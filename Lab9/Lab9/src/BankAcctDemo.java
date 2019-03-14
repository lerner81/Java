/*
	Chapter 10:	Account program
	Programmer:     Mark Lerner
	Date:           11/1/2018
	Filename:	BankAcctDemo.java
	Purpose:        Create a new account using external class
*/

import java.util.*;
import java.text.DecimalFormat;

public class BankAcctDemo 
{
  public static void main (String[] args)
  {
      //declarations and formatting
	  int acctID;
          boolean done = false;
	  double acctBalance, annIntRate, withAmt, depAmt;
	  Scanner input = new Scanner(System.in);
	  DecimalFormat twoDigits = new DecimalFormat("$###,###.00");
	  DecimalFormat percent = new DecimalFormat("##.00%");
          
          //prompts for user input
	  System.out.println("   Bank Account Balance");
	  System.out.println();
          
          
          //prompts user to enter account id

            System.out.print("Enter your account id: ");
           acctID = input.nextInt();              
          
    	  System.out.println();       
          
	  System.out.print("Enter your current Balance: ");
	  	  acctBalance = input.nextDouble();
	  System.out.println();

	  System.out.print("Enter your annual interest rate: ");
	  	  annIntRate = input.nextDouble();
	  System.out.println();

	  System.out.print("Enter any withdrawals: ");
	  	  	  withAmt = input.nextDouble();
	  System.out.println();

	  System.out.print("Enter any deposits: ");
	  	  	  depAmt = input.nextDouble();
	  System.out.println();

          //creates a new object 
    CheckAcct account = new CheckAcct(acctID, acctBalance);
    CheckAcct.setAnnualInterestRate(annIntRate);

    //applies methods and displays output messages
    account.withdraw(withAmt);
    account.deposit(depAmt);
    System.out.println("Balance for account # " +  account.getId() + " is " +twoDigits.format(account.getBalance()));

    System.out.println("Monthly interest is " + twoDigits.format(account.getMonthlyInterest()));

    System.out.println("This account was created at " +
      account.getDateCreated());
      System.out.println();
      System.out.println();

      System.out.println("Annual interest rate is " + percent.format(CheckAcct.getAnnualInterestRate()));






  }
}

