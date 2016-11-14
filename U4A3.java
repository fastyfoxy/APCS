// Tariq
//
// This program will create a salary schedule for teachers at any school.

import java.util.StringTokenizer;
import java.awt.Container;
import javax.swing.JApplet;
import javax.swing.JTextArea;

public class U4A3 extends JApplet
{
	public void init()
	{
		String input = JOptionPane.showInputDialog("Enter Base Salary (10000-50000),\n Enter Number of Lanes(3-6),\nEnter Number of Steps per Lane(10-20),\n\n(Separate the numbers with single spaces)");
		StringTokenizer tokenizer = new StringTokenizer(input);
		String token1 = tokenizer.nextToken();
		String token2 = tokenizer.nextToken();
		String token3 = tokenizer.nextToken();
		int base = Integer.parseInt(token1);
		int lanes = Integer.parseInt(token2);
		int steps = Integer.parseInt(token3);
   		for(int c = 1, c=steps, c++)
  		  {
		  if(c=1) int multi = base; 
		  else multi =((0.03*c)+1)*base;
  		  out.append(c+"    "+multi;
  		  }
	}
}
