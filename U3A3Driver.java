// Tariq
//
// This program will test the methods of the U3A3 class.

import javax.swing.JApplet;
import javax.swing.JTextArea;
import java.awt.Container;
import javax.swing.JOptionPane;

public class U3A3Driver extends JApplet
{
	public void init()
	{

		String monthname;
		String input = JOptionPane.showInputDialog("Please enter month as a number: ");
		int month = Integer.parseInt(input);

		switch(month)
		{
			case 1:
				monthname = "January";
				break;
			case 2:
				monthname = "Febuary";
				break;
			case 3:
				monthname = "March";
				break;
			case 4:
				monthname = "April";
				break;
			case 5:
				monthname = "May";
				break;
			case 6:
				monthname = "June";
				break;
			case 7:
				monthname = "July";
				break;
			case 8:
				monthname = "August";
				break;
			case 9:
				monthname = "September";
				break;
			case 10:
				monthname = "October";
				break;
			case 11:
				monthname = "November";
				break;
			default:
				monthname = "December";
		}

		U3A3 a = new U3A3(month);
		a.setDays();
		String days = a.getDays();
		String b = "The month of "+monthname+"\n has "+days+" days.";
		JTextArea output = new JTextArea();
		output.setText(b);

		Container x = getContentPane();
		x.add(output);
	}
}
