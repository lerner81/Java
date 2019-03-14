/*
Mark Lerner
10/10/2018
Lab 6 Part A
Program converts temperature from celsius to fahrenheit and fahrenheit to celsius
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class TempConverter
{
    public static void main (String[]args)
    {
    //declarations
      double numCon, temp; 
      int inNum;
      
      Scanner input = new Scanner(System.in);
      DecimalFormat one = new DecimalFormat("###.0");
      
    //Header 
        System.out.println("\t Temerature Converter"+
                "\n----------------------------------------------------------");
      do//error for correct inputs
      {
           System.out.print("\nBetween 3 and 6, how many conversions would you like to make: ");
       numCon = input.nextDouble();      
      }
      while(numCon < 3 || numCon > 6);
      
      // sets number of conversions to user input
      for(int count = 1; count <= numCon; count++)
      {
        // States conversion number
        System.out.println("Conversion # " + count);
        do
        {
        System.out.print("Press 1 to convert from celsius to fahrenheit"
                + "\nPress 2 to convert from fahrenheit to celsius: ");
        inNum = input.nextInt();
        }
        //user must enter 1 or 2 or will not continue
        while(inNum < 1 || inNum > 2);
        
      //Output statement that calls on method and asks for number to be converted
        if  (inNum == 1)
        {
          System.out.print("Enter a celsius temperature:");
          temp = input.nextDouble();
          System.out.println("The celsius temperature of " + one.format(temp) + " degrees is equal "
                  + "to " + one.format(celsiusToFahrenheit(temp)) + " degrees fahrenheit");
          continue;
        }
        else
          System.out.print("Enter a fahrenheit temperature:");
          temp = input.nextDouble();
          System.out.println("The fahrenheit temperature of " + one.format(temp) + " degrees is equal "
                  + "to " + one.format(fahrenheitToCelsius(temp)) + " degrees celsius3");
      }      
    }
    
    //end of Main Method and beginning of conversion methods
    public static double celsiusToFahrenheit(double cels)
    {
        double result;
        result = cels * 1.8 + 32;
        return result;
    }
    
    public static double fahrenheitToCelsius(double fahr)
    {
        double result;
        result = (fahr - 32) * .5556;               
        return result;
    }
}
