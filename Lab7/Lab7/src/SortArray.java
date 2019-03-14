/*
Mark Lerner
Lab 7 Part B
10/21/2018
This program will search the array and display the smallest number
 */

import java.util.Scanner;

public class SortArray
{
    public static void main (String[]args)
    {
    Scanner input = new Scanner(System.in);
    double num [] = new double[10];
    
    //header of the program
    System.out.println("\tFind the minimum value\n\n");
    System.out.print("Enter ten double numbers: ");
    	for (int j = 0; j < num.length; j++)
	{
            num [j] = input.nextDouble();
	}
     System.out.println("The smallest element is " + min(num));
    }//end of main
    
    public static double min(double[] array)
    {
    double smallest = array[0];
    for(int i = 0; i < array.length; i++)
        {
        if (smallest > array[i])
        smallest = array[i];             
        }
    return smallest;  
    }
    
}
