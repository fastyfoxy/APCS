// This program will create a salary schedule.

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

		Font font = new Font("Monospaced", Font.BOLD, 12);
		out.setFont(font);
		out.append("	  Salary Schedule\n\n");

		for(int c=1; c<=lane; c++)
		{
			if(c==1) out.append("        "+c);
			else out.append("       "+c);
		}

		out.append("\n");
		int baseCopy;
		for(int c=1; c<=step; c++)
		{
			baseCopy = base;
			out.append("\n");
			out.append(""+c);
			if(c<10) out.append(" ");
			out.append("    "+baseCopy);
			for (int d=1; d<lane; d++)
			{
				baseCopy =(int)(baseCopy * 1.09);
				out.append("   " + baseCopy);
			}
			base = (int)(base * 1.03);
		}

		Container container = getContentPane();
		container.add(out);
	}
}
