/*
Mark Lerner
Lab 1 part 2
Splash Screen Displaying initials, Name, address, student email, and date
9/2/2018
 */
import java.util.Date;

public class Lab1Part2 
{
  public static void main (String[]args)
  {
  //sets up date utility
  Date currentDate = new Date();
  
  //Using system.out.println for artistic splash screen. 
 
  System.out.println("*******************************************************");
  System.out.println("*                                                     *");
  System.out.println("*            *     *     *     *                      *");
  System.out.println("*            * * * *   *   *   *                      *");
  System.out.println("*            *  *  *  *******  *                      *");
  System.out.println("*            *     * *       * ******                 *");
  System.out.println("*                                                     *");
  System.out.println("*               Mark A. Lerner                        *");
  System.out.println("*             4081 Carefree Place                     *");
  System.out.println("*             Westerville, OH 43081                   *");
  System.out.println("*         email: mlerner3@student.cscc.edu            *");
  System.out.println("*                                                     *");
  System.out.println("* "+"  Today's Date:  " + currentDate.toString()+"       *");
  System.out.println("*                                                     *");
  System.out.println("*******************************************************");
  
  }
}
