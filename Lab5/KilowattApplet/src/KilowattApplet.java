/*
Mark Lerner
10/5/2018
Lab 5
Kilowatt Applet
Applet that will calculate the monthly cost of using an appliance
 */
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class KilowattApplet extends Applet implements ActionListener{

//declare variables
    double costPerKW, hoursUsed, totalCost;
    
//construct components
    Label calculatorLabel = new Label("Welcome to Mark's Appliance Energy Calculator");
    Label costPerKWLabel = new Label("Please enter the cost per kilowatt-hour: ");
	TextField costPerKwField = new TextField(5);
    Label hoursUsedLabel = new Label("Please enter the kilowatt-hours consumed: ");
	TextField hoursUsedField = new TextField(5);
    Button calButton = new Button("Calculate");
    Label outputLabel = new Label("Click the Calculate button to display the monthly  energy cost.");
    DecimalFormat twoDigits = new DecimalFormat("$#,###.00");
    
//sets pretty colors, adds fields and labels    
    public void init()
    {
        setForeground(Color.decode("#500ff"));
        setBackground(Color.decode("#c3f6fe"));
	add(calculatorLabel);
	add(costPerKWLabel);
	add(costPerKwField);
	add(hoursUsedLabel);
	add(hoursUsedField);
	add(calButton);
	calButton.addActionListener(this);
	add(outputLabel);

    }

    public void actionPerformed(ActionEvent e)
    {
     // parses data from text fields, calculates the cost, and displays results   
	costPerKW = Double.parseDouble(costPerKwField.getText());
	hoursUsed = Double.parseDouble(hoursUsedField.getText());
	totalCost = hoursUsed * costPerKW;
	outputLabel.setText("The monthly cost to operate this appliance is " + twoDigits.format(totalCost) + ".");
    
    }
}
