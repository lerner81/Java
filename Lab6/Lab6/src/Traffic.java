/*
	Chapter 6:	Traffic Ticket
	Programmer:     Mark Lerner
	Date:           10/10/2018
	Filename:	Trafic.java
	Purpose:	This program calculates a traffic ticket and court costs.
*/

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Traffic
{
	public static void main(String[] args)
	{
		//declare class variables 

		double fine, courtCosts, ticket;
		int speedLimit, offenderSpeed, previousTickets, overLimit;

		System.out.println("       *****Ticket Calculator*****");


		//call methods

				speedLimit = getLimit();
				offenderSpeed = getDriverSpeed();
				if (offenderSpeed <= speedLimit)
				{
				JOptionPane.showMessageDialog(null,"No violation", "Traffic Ticket",JOptionPane.INFORMATION_MESSAGE);
				finish();
				}


				previousTickets = getTickets();
				overLimit = offenderSpeed - speedLimit;
				fine = overLimit * 20.00;
				courtCosts = getCosts(previousTickets);
				ticket = fine + courtCosts;
				output (fine, courtCosts, ticket);
				finish();
			}




	//The getLimit() method asks the user to input a the speed limit.
	public static int getLimit()
	{
		//declare method variables
		int limit = 0;
		String answer;
                answer = JOptionPane.showInputDialog(null, "Enter the speed limit:");
                
               //exits if cancel is clicked  
                if (answer == null)finish();     
                
                //parses answer
                limit = Integer.parseInt(answer);
                
                //error checks if a negative number is entered
                if (limit < 0)
                {
                JOptionPane.showMessageDialog(null, "You must enter a speed limit greater than 0", "error",JOptionPane.INFORMATION_MESSAGE);
                finish();
                }
                
		return limit;
	}

	//The getDriverSpeed() method asks the user to input the offender's speed.
		public static int getDriverSpeed()
		{
			//declare method variables
			int speed = 0;
			String answer;
                        answer = JOptionPane.showInputDialog(null, "Enter the offender's speed:");
                        
                        //exits if cancel is clicked     
                        if (answer == null)finish();
                        
                        //parses answer
                        speed = Integer.parseInt(answer);
                        
                        //error checks if a negative number is entered
                        if (speed < 0)
                        {
                            JOptionPane.showMessageDialog(null, "You must enter a speed greater than 0", "error",JOptionPane.INFORMATION_MESSAGE);
                            finish();
                        }
                            return speed;
	}

	//The getTickets() method retrieves number of tickets.
	public static int getTickets()
	{
			//declare method variables
			int tickets = 0;
			String answer;
                        answer = JOptionPane.showInputDialog(null, "Enter the number of previous tickets:");
                        
                        //exits if cancel is clicked
                        if (answer == null)finish();
                        
                        //parses answer
                        tickets = Integer.parseInt(answer);               
			return tickets;
	}

	//The getCosts() method returns the court costs.
	public static double getCosts(int tickets)
	{
		double costs;
                
                if (tickets <= 1)
                    costs = 74.80;
                else if (tickets <= 2)
                    costs = 99.80;
                else
                    costs = 124.80;
		return costs;
	}

	//The output() method displays the cost of the ticket.
	public static void output(double dFine, double dCost, double dTicket)
	{
            DecimalFormat two = new DecimalFormat("$####.00");
            JOptionPane.showMessageDialog(null,"Your fine of "+ two.format(dFine) + " plus your court costs of "
                    + two.format(dCost) + " is " + two.format(dTicket), "Traffic Ticket", JOptionPane.INFORMATION_MESSAGE);


	}

	//The finish() method ends the program.
	public static void finish()
	{
		System.exit(0);
	}
}