// This program will test the methods of the GradeConverter class.

import javax.swing.JOptionPane;

public class U3A1
{
	public static void main(String[] args)
	{
		String x;
		x = JOptionPane.showInputDialog("Please enter Letter Grade: ");

		String numeric;
		numeric = JOptionPane.showInputDialog("Please enter Numeric Grade: ");

		double y = Double.parseDouble(numeric);
		GradeConverter a = new GradeConverter(x, y);
		double newNumeric = a.getNewNumeric();
		String newLetter = a.getNewLetter();

		String output1 = "Numeric Grade Equivalent = " + newNumeric;
		String output2 = "\n\nLetter Grade Equivalent = " + newLetter;
		String output = output1 + output2;

		JOptionPane.showMessageDialog(null, output, "U3A1", JOptionPane.INFORMATION_MESSAGE);
	}
}
