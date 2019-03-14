/*
Mark Lerner
Lab 7 Part A
10/21/2018
This program has two overloaded methods and it will return an average
 */
import java.util.Scanner;

public class AvgArray 
{
    public static void main(String[]args)
    {
    Scanner input = new Scanner(System.in);
    int num [] =  new int[10];
    double dNum [] = new double[10];
    
    //header of the program
    System.out.println("\t Average arrays");
    
    //array that takes user input and calculates average
    System.out.print("Enter 10 integer values: ");
	for (int i = 0; i < num.length; i++)
	{
            num [i] = input.nextInt();
	}
    System.out.print("The average of the ten integers is " + average(num)+ "\n\n");
    // end of integer calculation
    
    //beginning of averaging the double
    System.out.print("Enter 10 double values: ");
	for (int j = 0; j < dNum.length; j++)
	{
            dNum [j] = input.nextDouble();
	}
    System.out.print("The average of the ten doubles is " + average(dNum));
    
    }//end of main
    
    //method for calculating int average
    public static int average(int[] array)
        {
            int sum = 0;
            for(int i : array)
            {    
            sum += i;
            }
            int avg = sum / array.length;
            return avg;
        }
    
     //method for calculating double average
    public static double average(double[] array)
        {
            double sum = 0;
            for(double j: array)
            {    
            sum += j;
            }
            double avg = sum / array.length;
            return avg;    
        }
    
}
