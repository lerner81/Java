import javax.swing.JOptionPane;

import java.text.DecimalFormat;

public class TravelCommission2

{

public static void main(String[]args)

{

double dollars, answer;

int empCode;

  

//header

System.out.println("\t\tTRAVEL COMMISSION");

  

//call methods

dollars=0;

//if dollars get nothing then exception will be raised

//here we are not throwing it manually

//it is generating automatically

//we are only catching it

//loop getSales untill we get the desired result

do

{

try

{

dollars=getSales();

//if no exception is raised then break the loop

if(dollars>0)

break;

}

catch(Exception e)

{

//to exit from the program

int result = JOptionPane.showConfirmDialog(null,

"Are you sure you want to quit?",

"Confirm Quit", JOptionPane.YES_NO_CANCEL_OPTION);

if (result == JOptionPane.YES_OPTION)

{

System.exit(0);

break;

}

}

}while(true);

empCode = getCode();

answer = getComm(dollars,empCode);

output (dollars, answer);

finish();

} //end of main

  

static double getSales()

{

boolean done = false;

double dollars = 0;

int flag=0;

  

while (!done)  

{

try

{

dollars = Double.parseDouble( JOptionPane.showInputDialog(null,

"Enter the sales Amount\n"

+ "(do not use commas or dollars signs)"

+ "\nor click Cancel to exit:"));

done = true;

}

catch(NumberFormatException e)

{

JOptionPane.showMessageDialog(null,"Your entry must be a "

+ "number.","Error", JOptionPane.INFORMATION_MESSAGE);

}

}

return dollars;

  

} // end of getSales();

  

public static int getCode()

{

boolean done = false;

int empCode = 0;

  

while(!done)

{

try

{

empCode= Integer.parseInt(JOptionPane.showInputDialog(null, "Enter"

+ " the commission code:"

+ "\n1)Telephone Sales"

+ "\n2)In-Store Sales"

+ "\n3)Outside Sales"));

  

if(empCode < 1 || empCode > 3)throw new Exception("Please enter a 1,2 or 3");

done = true;

}

catch(NumberFormatException ee)

{  

JOptionPane.showMessageDialog(null, "Your entry must be a number"

+ "\n Please enter a 1, 2 or 3", "Error",

JOptionPane.INFORMATION_MESSAGE);

}

catch(Exception io)

{

JOptionPane.showMessageDialog(null, "Please enter a 1, 2 or 3", "Error", JOptionPane.INFORMATION_MESSAGE);

}  

  

}

return empCode;

} // end of getCode()

  

public static double getComm(double dollars, int empCode)

{

double answer;

switch (empCode)

{

  

// Telephone Sales

case 1:

answer = dollars * 0.10;

break;

  

// In-Store Sales

case 2:

answer = dollars * 0.14;

break;

  

//Outside Sales

default:

answer = dollars * 0.18;

break;

}

return answer;

  

}// end of getComm

  

public static void output(double dollars, double answer)

{

DecimalFormat two = new DecimalFormat("$#,###.00");

JOptionPane.showMessageDialog(null, "Your commision on sales of " + two.format(dollars) + " is " + two.format(answer));  

}

  

public static void finish()

{

System.exit(0);

}

}