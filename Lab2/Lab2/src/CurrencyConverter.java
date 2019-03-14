/*
Mark Lerner
9/7/2018
Lab 2 Part 2
Currency Converter
 */
import java.util.Scanner;
public class CurrencyConverter
{
    public static void main (String[]args)
    {
        // Allows Keyboard for input
    Scanner input = new Scanner(System.in);
    double dollar;  

    //Header
    System.out.println("    ***    Currency Converter     ***");
    
    //Prompts user for input in dollars 
    
    System.out.print(" Enter the US dollar amount: ");
    dollar = input.nextDouble();
    
    //Prompts user to enter number that will dictact which converstion is used
    
    System.out.println(" Enter a 1 to convert to euros \n" + 
                       " Enter a 2 to convert to pounds \n" +
                       " Enter a 3 to convert to rubles");
    System.out.print("Enter your conversion choice: ");
    
    int num = input.nextInt();
    
        switch (num) 
        {
            case 1:                               
                System.out.println("The dollar amount of " + 
                     java.text.NumberFormat.getCurrencyInstance().format(dollar)
                        + " is equal to " + 
                     java.text.NumberFormat.getCurrencyInstance().format(dollar 
                             * .91) +
                        " euros.");
               
                break;
            case 2:
                System.out.println("The dollar amount of " + 
                    java.text.NumberFormat.getCurrencyInstance().format(dollar)
                        + " is equal to " + 
                    java.text.NumberFormat.getCurrencyInstance().format(dollar 
                            * .64) +
                        " pounds.");
                break;
            case 3:
                System.out.println("The dollar amount of " + 
                     java.text.NumberFormat.getCurrencyInstance().format(dollar)
                        + " is equal to " + 
                     java.text.NumberFormat.getCurrencyInstance().format(dollar
                             * 61.73) +
                        " rubles.");
                break;
            default:
                break;
        }
    }
}
