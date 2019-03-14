/*
Mark Lerner
9/7/2018
Lab 2
Shipping Cost Estimate
 */
import java.util.Scanner;

public class ShippingCost
{
    public static void main (String[]args)
    {
        Scanner input =  new Scanner(System.in);
        
        double lbs, cost;
        
        System.out.print("Enter package weight: ");
        lbs = input.nextDouble();
        
        if (lbs >0 && lbs <=1)
        {
            cost = 3.50;
        System.out.println("The shipping cost is " + 
        java.text.NumberFormat.getCurrencyInstance().format(cost));
        }
        else if (lbs >1 && lbs <=3)
        {
            cost = 5.50;
        System.out.println("The shipping cost is " + 
        java.text.NumberFormat.getCurrencyInstance().format(cost));
        }
        else if (lbs >3 && lbs <=10)
        {
            cost = 8.50;
        System.out.println("The shipping cost is " + 
        java.text.NumberFormat.getCurrencyInstance().format(cost));
        }
        
        else if (lbs >10 && lbs <=20)
        {
            cost = 10.50;
        System.out.println("The shipping cost is " + 
        java.text.NumberFormat.getCurrencyInstance().format(cost));
        }
        else
        {
        System.out.println("Sorry, the package cannot be shipped.");
        }
    }   
}
