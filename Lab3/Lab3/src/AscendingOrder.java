/*
Lab 3 Part 2
Mark Lerner
09/14/2018
AscendingOrder
prompts user to enter three cities and displays them in ascending order
 */

import java.util.Scanner;

public class AscendingOrder 
{
    public static void main (String[]args)
    {
    Scanner input = new Scanner(System.in);
    String temp;
//header
    System.out.println("\t\t\tAscending Order\n");

//promt user to enter three differnt cities
    System.out.print("Enter the first city: ");
    String city1 = input.nextLine();
    
    System.out.print("Enter the second city: ");
    String city2 = input.nextLine();
    
    System.out.print("Enter the third city: ");
    String city3 = input.nextLine();
       
//calculation comparison of cities
    if (city1.compareTo(city2)> 0)
    {
        temp = city1;
        city1 = city2;
        city2 = temp;
    }
    if (city2.compareTo(city3)> 0)
    {
        temp = city2;
        city2 = city3;
        city3 = temp;
    }
    if (city1.compareTo(city2)> 0)
    {
        temp = city1;
        city1 = city2;
        city2 = temp;
    }
             
//display cities in alphabetical order
System.out.println("The three cities in alphabetical order are "
        + city1 + " " + city2 + " " + city3);
    }
}
