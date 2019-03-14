/*
Lab 3
Mark Lerner
09/14/2017
PayrollRecord
Promts user to enter employee's name, hours worked, hourly pay, federal and 
state taxes
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class PayrollRecord 
{
    public static void main (String[]args)
    {
    Scanner input = new Scanner(System.in);
        String name; 
    
    DecimalFormat two = new DecimalFormat("$#,###.00");
    DecimalFormat percent = new DecimalFormat("<##.0%>");
        double hours, payRate, grossPay,federalTax,
               federalWithholding,stateWithholding,
                stateTax, totalDeduction, netPay;            
//header
    System.out.println("\t\t\tPayroll Record\n\n");
    
//prompt user for name using nextLine()
    System.out.print("Enter employee's name: ");
        name = input.nextLine();
    
//prompt user  for hours worked
    System.out.print("Enter number of hours worked in a week: ");
    hours = input.nextDouble();
  
//prompt user for pay rate
    System.out.print("Enter hourly pay rate: ");
    payRate = input.nextDouble();
    
//prompt user for federal tax withholding
    System.out.print("Enter federal tax withholding rate: ");
    federalWithholding = input.nextDouble();
    
//prompt user for state tax withholding
   System.out.print("Enter state tax withholding rate: ");
   stateWithholding = input.nextDouble();
   
//calculate inputs
    grossPay = hours * payRate;
    federalTax = grossPay * federalWithholding;
    stateTax = grossPay * stateWithholding; 
    totalDeduction = federalTax + stateTax;
    netPay =  grossPay - totalDeduction;
   
//display inputs and calculations
    System.out.println("\nEmployee Name:\t" + name +
            "\nHours Worked:\t" + hours +
           "\nPay Rate:\t" + two.format(payRate) + 
            "\nGross Pay:\t" + two.format(grossPay)+
            "\nDections:"+
            "\n  Federal Withholding " + percent.format(federalWithholding)+ ":\t"
            + two.format(federalTax)+
            "\n  State Withholding " + percent.format(stateWithholding) + ":\t" +
            two.format(stateTax)+
            "\n  Total Deduciton:\t" + two.format(totalDeduction)+
            "\n  Net Pay:\t" + two.format(netPay));

    }
}
