// Tariq
//
// This program will test the methods of the Binary class.

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Container;
import javax.swing.JApplet;
import java.awt.Font;

public class BinaryDriver extends JApplet
{
	public void init()
	{
		int count = 0;
		int sum = 0;
		int num;
		String input = JOptionPane.showInputDialog("Enter Binary Number: ");
		Binary x;

		JTextArea out = new JTextArea();
		out.setFont(new Font("Monospaced", Font.BOLD, 16));
		out.setText("Results of U4A1\n\n");

		while(!input.equals("-1"))
		{
			count++;
			x = new Binary(input);
			num = x.convert();
			out.setTabSize(10-input.length());
			out.append("Number " + count + ": " + input + " = \t" + num + "\n");
			sum += num;
			input = JOptionPane.showInputDialog("Enter Binary Number: ");
		}

		String mean = String.format("%.2f", (double) sum / count);
		out.append("\nNumber of Numbers = " + count);
		out.append("\nAccumulated Value = " + sum);
		out.append("\nMean              = " + mean);
		Container a = getContentPane();
		a.add(out);
	}
}