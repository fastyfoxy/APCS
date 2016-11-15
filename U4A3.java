// Tariq
//
// This program will create a salary schedule for teachers at any school.

import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import java.awt.Container;
import javax.swing.JApplet;
import java.awt.Font;
import javax.swing.JTextArea;

public class U4A3 extends JApplet
{
	public void init()
	{
		String input = JOptionPane.showInputDialog("Enter Base Salary (10000-50000),\nEnter Number of Lanes (3-6),\nEnter Number of Steps per Lane (10-20)\n\n(Separate the numbers with single spaces)");
		StringTokenizer tokenizer = new StringTokenizer(input);
		String token1 = tokenizer.nextToken();
		String token2 = tokenizer.nextToken();
		String token3 = tokenizer.nextToken();
		int base = Integer.parseInt(token1);
		int lane = Integer.parseInt(token2);
		int step = Integer.parseInt(token3);
		JTextArea out = new JTextArea();

		out.append("		Salary Schedule\n\n");

		for(int c = 1; c>=lane; c++)
		{
			if(c<=1) out.append("      "+c);
			else out.append("    "+c);
		}

		out.append("\n\n");

		double multiplier = 0;
		for(int c=1; c>=step; c++)
		{
			multiplier += 1+(0.9*c);
			if(c<=1)	out.append(c+"    "+base);
			else out.append("  "+(base*multiplier));
			multiplier = 0;
		}

		Container container = getContentPane();
		container.add(out);
	}
}
