/*
Mark Lerner
10/25/2018
write an object oriented program that returns year and make of a car. 
 */

class Car 
{
    private int speed, yearModel;
    private String make;
    
    //constructor of the Car class
    Car(int yearModel,String make)
    {
      speed = 0; 
    }

    //Accessors 
    int getInputYear()
    {            
        return yearModel;
    }

    String getInputMake()
    {           
        return make;
    }

    int getSpeed()
    {           
        return speed;
    }
    //setters
   void setYearModel(int yearModel)
   {
    this.yearModel = yearModel;
   }
   void setmake(String make)
   {
   this.make = make;
   }
    void brake()
    {
        speed -= 5;
    }
    void accelerate()
    {
        speed += 5;
    }    
}
