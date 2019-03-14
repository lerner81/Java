
/*
Mark Lerner
Currency Convertor
10/5/2018
Lab 5 Part B
Will take user input through prompt boxes and calculate convertions to euros, pounds, and rubles
 */
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class CurrencyConvertSwing
{
    public static void main(String[]args)
    {
    //declare and construct variables
        DecimalFormat twoDigits = new DecimalFormat("#,###.00");
        double dollar, euros, pounds, rubles;
        String answer;
        
    //print prompts and get user input
        System.out.println("\tMark's Currency Convertor");   
        answer = JOptionPane.showInputDialog(null, "Enter your dollar amount: ");
            if (answer == null) System.exit(0);
            dollar = Double.parseDouble(answer);  
            
    //calculations
        euros = dollar * .91;
        pounds = dollar * .64;
        rubles = dollar * 61.73;   
        
    //output
        JOptionPane.showMessageDialog(null, "YOUR DOLLAR AMOUNT OF " + twoDigits.format(dollar) +
           "\nis equal to "+ twoDigits.format(euros) + " euros,\n " + twoDigits.format(pounds) +" pounds" + 
            "\n and " + twoDigits.format(rubles) + " rubles."); 
        
        System.exit(0);
    }
}
