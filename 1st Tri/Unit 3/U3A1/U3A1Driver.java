// Name
//
// This program will test the methods of the U3A1 class.

import javax.swing.JOptionPane;

public class U3A1Driver
{
	public static void main(String[] args)
	{
		String x;
		x = JOptionPane.showInputDialog("Please enter Letter Grade: ");

		String numeric;
		numeric = JOptionPane.showInputDialog("Please enter Numeric Grade: ");

		double y = Double.parseDouble(numeric);
		U3A1 a = new U3A1(x, y);
		double newNumeric = a.getNewNumeric();
		String newLetter = a.getNewLetter();

		String output1 = "Numeric Grade Equivalent = " + newNumeric;
		String output2 = "\n\nLetter Grade Equivalent = " + newLetter;
		String output = output1 + output2;

		JOptionPane.showMessageDialog(null, output, "U3A1", JOptionPane.INFORMATION_MESSAGE);
	}
}
