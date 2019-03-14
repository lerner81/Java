/*
Mark Lerner
09/21/2018
Lab4 part 1
Program that asks user to enter positive numbers and negative numbers.
Then adds how many times user enters a number
*/
import java.util.Scanner;

public class PositiveNegativeNum
{
    public static void main (String[]args)
    {int forLoop, loopX, num, zero = 0, neg = 0, pos = 0;
       //create a new scanner for user input and title
        Scanner input = new Scanner(System.in);
        System.out.println("\t\tPositive and Negative Numbers\n\n");

        System.out.print("Enter the total amount of integers to be entered: \n" +
                "Must be between 5 and 10; ");
        loopX = input.nextInt();

        //if the user does not enter a valid number, the program will prompt user to re-enter
        while (loopX < 5 || loopX > 10)
        {
            System.out.print("Enter the total amount of integers to be entered: \n" +
                    "Must be between 5 and 10; ");
            loopX = input.nextInt();
        }

        //executes number the user enters and keeps track how many zero, positive, and negative integers

        for(forLoop = 1; forLoop <= loopX; forLoop++)
        {
           System.out.print("Enter number "+ forLoop + ": ");
            num = input.nextInt();

            if(num == 0)
            {
                zero++;
            }
            else if (num < 0)
            {
                neg++;
            }
            else
            {
                pos++;
            }
        }
        //prints the user's input
        System.out.println("Total zeros: " + zero +
                "\n Total positive integers: " + pos +
                "\n Total negative integers: " + neg);
    }
}
