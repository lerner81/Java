/*
Mark Lerner
11/1/2018
Lab 9 create a CheckAcct class that is the blueprint for accounts
 */

import java.util.Date;

public class CheckAcct
{
    Date date = new Date();
    private int id; 
    private String dateCreated;
    private double balance;
    private static double annualInterestRate;
    
    //constructor 
    CheckAcct(int newId,double newBalance)
    {
    id = newId;
    balance = newBalance;
    }
    
    //accessor methods
    int getId()
    {
    return id;
    }
    double getBalance()
    {
    return balance;
    }
    static double getAnnualInterestRate()
    {
    return annualInterestRate;
    }
    String getDateCreated()
    {    
    dateCreated = date.toString();   
    return dateCreated;    
    }
    double getMonthlyInterest()
    {        
    return (annualInterestRate * balance) / 12;
    }
    
    //mutator methods
    static void setAnnualInterestRate(double newAnnualInterestRate)
    {
     annualInterestRate = newAnnualInterestRate;
    }
    void withdraw(double newWithDraw)
    {
    balance -= newWithDraw;
    }
    void deposit(double newDeposit)
    {
    balance += newDeposit;
    }
}
