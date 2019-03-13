/*
Mark Lerner
Lab 11
11/28/2018
Program will prompt user for the cost of the candle order and the shipping type
 */

import java.util.*;
import java.text.DecimalFormat;

public class Candleline
{
    public static void main(String[]args)
    {
    int shippingType;
    double candleCost, shippingCost;
    
    //Header    
     System.out.println("\t\tCandleLine -  Candles Online\n");    
    
    //calling methods
    candleCost =  getCandleCost();
    shippingType = getShippingType();
    shippingCost = getShippingCost(candleCost,shippingType);
    output(candleCost, shippingCost);  
    }// end of main
    
    //prompts users for the candle cost   
    public static double getCandleCost()
    {
     Scanner input = new Scanner(System.in);
     double newCost = 0;
     boolean done = false;
     
     while(!done)
     {
        try
        {
        System.out.print("Enter the cost of the candle order: ");
        newCost = input.nextDouble();
        if(newCost <= 0)throw new InputMismatchException();
        done= true;        
        }
        catch(InputMismatchException i)
        {
        System.out.println("Error, enter a dollar amount greater than 0");
        input.nextLine();
        }
     } 
     return newCost;
    }
     
     //prompts the users for the shipping type
    public static int getShippingType()
    {
     Scanner input = new Scanner(System.in);
     int newShippingType = 0;
     boolean done = false;
    
    while(!done) 
    {
     try
     {
     System.out.print("Enter the type of shipping:\n"
        + " 1) Priority (Overnight)\n"
        + " 2) Express (2 business days)\n"
        + " 3) Standard (3 to 7 business days)\n"
        + "Enter type number: ");
     newShippingType = input.nextInt();
     if(newShippingType < 1 || newShippingType > 3)throw new InputMismatchException();
     done = true;
     }
     catch(InputMismatchException ei)
     {
     System.out.println("\nError, enter a 1,2 or 3\n");
     input.nextLine();
     }
    }
     return newShippingType;
    }
    
    //Takes the candle cost, shipping type and returns shipping cost
    public static double getShippingCost(double myCandleCost, int myShippingType)
    {
    double newShippingCost = 0;
    
    if (myCandleCost >= 100 && myShippingType == 3)               
      newShippingCost = 0;
    else if(myShippingType == 1)
      newShippingCost = 16.95;
    else if(myShippingType == 2)
      newShippingCost = 13.95;
    else 
      newShippingCost = 7.95;
    
    return newShippingCost;
    }
   
    //uses all the inputs and calls for the output statement
    public static void output(double myCandleCost, double myShippingCost)
    {
    DecimalFormat money = new DecimalFormat("$#,###0.00");
    
    System.out.println("The candle cost of " + money.format(myCandleCost)
    + " plus shipping costs of " + money.format(myShippingCost)
    + " equals " + money.format(myShippingCost + myCandleCost));
    }
}