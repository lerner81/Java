/*
Mark Lerner
10/26/2018
Lab 8 CarDemo Class
returns make and year of a car and checks for an empty string
 */
import java.util.Scanner;

public class CarDemo 
{
    public static void main(String[]args)
    {
    //creates new objects and intializes
    Scanner input = new Scanner(System.in); 
    
    String myMake = null;
    int myYearModel = 0;
            
    Car myCar = new Car(myYearModel,myMake);
    
      
    System.out.println("\tDemonostration of Car Class");   
    
    //uses a do while loop for error checking while prompting user for car make properties
    do 
    { 
         
    System.out.print("\nEnter the make of the car:");
          
          myMake = input.nextLine();
          myCar.setmake(myMake);
          
    if(myMake.equals(""))      
    System.out.println("Input Error -  enter a car make ");         
    }
   while(myMake.equals(""));    

   
   do
        
    // uses a do while loop for error checking while prompting user for the year of the car
    {
    System.out.print("Enter the year of the car: ");
        
        myYearModel = input.nextInt();
        myCar.setYearModel(myYearModel);
    
    if((myYearModel< 1940 || myYearModel > 2016))
    System.out.println("Input error - enter a year between 1940 and 2016"); 
    
    } 
  while((myYearModel< 1940 || myYearModel > 2016));

   //displays myCar properties and calls methods
    System.out.print("\ndemoCar"+ 
            "\n Model Year: " + myCar.getInputYear()+
            "\n Make\t: " + myCar.getInputMake()+ 
            "\n Speed\t: " + myCar.getSpeed());
    
    //calls methods and displays the changes to speed
    System.out.println("\n\nSpeed UP!\n");
    for(int i = 0; i < 5; i++)
    {
     myCar.accelerate();
     System.out.println(myCar.getSpeed());
    }
    
    System.out.println("\nSlow Down!\n");
    for(int i = 0; i < 5; i++)
    {
     myCar.brake();
    System.out.println(myCar.getSpeed());
    }
    
    System.out.println("End of the Road for Car Class Demonstration ");
                
                
              
    }
}
