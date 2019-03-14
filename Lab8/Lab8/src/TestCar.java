/*
Mark Lerner
10/26/2018
Lab 8 CarDemo Class
returns make and year of a car and checks for an empty string
 */
import java.util.Scanner;

public class TestCar 
{
    public static void main(String[]args)
    {
    Scanner input = new Scanner(System.in);  
    String myMake; int myYearModel,mySpeed;
            
    //Car myCar = new Car(int myYearModel,String myMake);
    
      
    System.out.println("\tDemonostration of Car Class");   
    
    //do 
     {    
     System.out.print("\nEnter the make of the car:");
    
           myMake= input.nextLine();
           getInputMark();
     }

    //while(" ".equals(myMake));          
     //   System.out.println("Input Error -  enter a car make ");
    System.out.print("Enter the year of the car: ");
        myYearModel = input.nextInt();
        getInputYear();
                
                
              
    }
}
