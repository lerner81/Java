/*
Mark Lerner
11/15/2018
Lab 10
This program will be used to calculate the sales commission for a travel agency.
 */
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class TravelCommission 
{
    public static void main(String[]args)
    {
        double dollars, answer;
        int empCode;
        
        //header 
        System.out.println("\t\tTRAVEL COMMISSION");
    
        //call methods
        dollars = getSales();        
        empCode = getCode();
        answer = getComm(dollars,empCode);        
        output (dollars, answer);        
        finish();              
     
    }   //end of main
    
    //promts user for the sales amount with exception
    static double getSales()
    {
        boolean done = false;
        double dollars = 0; 
        
        while (!done)  
        {
            try
            {                
            dollars = Double.parseDouble( JOptionPane.showInputDialog(null, 
                    "Enter the sales Amount\n"
                    + "(do not use commas or dollars signs)"
                    + "\nor click Cancel to exit:"));        
            
            if( dollars <=0 ) throw new Exception("Error- Enter a number greater"
                    + " than zero");
            done = true;         
            }
           catch(NullPointerException i)
           {
               finish();
           }
           catch(NumberFormatException e)   
           {            
               JOptionPane.showMessageDialog(null,"Your entry must be a "
                        + "number.","Error", JOptionPane.INFORMATION_MESSAGE);   
           }
           catch(Exception ei)
           {
               JOptionPane.showMessageDialog(null, "Error- Enter a number "
                       + "greater than 0","Error",JOptionPane.INFORMATION_MESSAGE);
           }
        }
        return dollars;
        
    }  // end of getSales();
    
    public static int getCode()
    {
        boolean done = false;
        int empCode = 0;
        int result;
        
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
            result = JOptionPane.showConfirmDialog(null, "Your entry must be an integer: 1,2,or 3"
                    + "\n Click 'Yes' to continue\n Click 'No' to exit", "Error",
                    JOptionPane.YES_OPTION);
            if (result == JOptionPane.NO_OPTION)
            {   
            finish();    
            }
            }
 
        catch(Exception io)
            {
            JOptionPane.showMessageDialog(null, "Please enter a 1, 2 or 3", "Error", JOptionPane.INFORMATION_MESSAGE);    
            }  
  

        }
        return empCode;
    }  // end of getCode()
    
    public static double getComm(double getdollars, int getempCode)
    {
        double answer;

        switch (getempCode)
        {
            
        // Telephone Sales
            case 1:
                answer = getdollars * 0.10;
                break;
                
        // In-Store Sales
            case 2:
                answer = getdollars * 0.14;
                break;
                
        //Outside Sales        
            default:
                answer = getdollars * 0.18;
                break;
        }
        return answer;
        
    }// end of getComm
    
    public static void output(double outdollars, double outanswer)
    {
      DecimalFormat two = new DecimalFormat("$#,###.00");
      JOptionPane.showMessageDialog(null, "Your commision on sales of " + two.format(outdollars) + " is " + two.format(outanswer));  
    }
  

    public static void finish()
        {
        System.exit(0);
        }

}
