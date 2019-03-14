/*
Mark Lerner
Lab 1 Part 1
Using Interger arithmetic tests
9/2/2018
 */
import java.util.Scanner;

public class Lab1Part1
{
    public static void main (String[]args)
    {//setting up keyboard input
        Scanner input =  new Scanner (System.in);
        
    //This is the header for the program
    System.out.println("*****************************************************");
    System.out.println("*          this is my first Java program            *");
    System.out.println("*****************************************************");
    System.out.println(" ");
    System.out.println("    **    Integer arithmetic tests    **");
    System.out.println(" ");
    
    //prompts user to enter input for integers
    System.out.print("Enter the first integer to test:  ");
    int int1 = input.nextInt();
    System.out.print("Enter the second integer to test:  ");
    int int2 = input.nextInt();
    
    //declares and intializes variables    
    int sum = int1 + int2;
    int diff = int1 - int2;
    int prod = int1 * int2;
    int qout = int1 / int2;
    int remain = int1 % int2;
    
    //displays results of arithmetic
    System.out.println(int1 + " + " + int2 + " = " + sum);
    System.out.println(int1 + " - " + int2 + " = " + diff);
    System.out.println(int1 + " * " + int2 + " = " + prod);
    System.out.println(int1 + " / " + int2 + " = " + qout);
    System.out.println(int1 + " % " + int2 + " = " + remain);
    
    //subhead for the next section
    System.out.println(" ");
    System.out.println("   **    Real arithmetic tests    **");
    System.out.println(" ");
    
    //promts user to enter real numbers
    System.out.print("Enter the first real to test:  ");
    double x = input.nextDouble();
    System.out.print("Enter the second real to test:  ");
    double y = input.nextDouble();
    
    //declarers and intializes real variables
    double realSum = x + y;
    double realDiff = x - y;
    double realProd = x * y;
    double realQout = x / y;
    
    System.out.println(x + " + " + y + " = " + realSum);
    System.out.println(x + " - " + y + " = " + realDiff);
    System.out.println(x + " * " + y + " = " + realProd);
    System.out.println(x + " / " + y + " = " + realQout);
    }
}
