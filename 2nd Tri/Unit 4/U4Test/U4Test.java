// This program will find and print the first prime number
// larger than the number inputted by the user.

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JApplet;
import java.awt.Container;
import java.awt.Font;

public class U4Test extends JApplet
{
	private long base;
	private boolean foundPrime;

	public void init()
	{
		Font font = new Font("Monospaced", Font.BOLD, 12);
		JTextArea out = new JTextArea();
		foundPrime = false;

		String input = JOptionPane.showInputDialog("Enter Base Number: ");
		long base = Long.parseLong(input);
		long baseCopy = base;

		long start = System.currentTimeMillis();

		if(baseCopy%2==0) baseCopy++;
		else baseCopy = baseCopy;

		while(!isPrime(baseCopy)) baseCopy+=2;

		long end = System.currentTimeMillis();
		int time = (int) (end - start);

		out.append("Results of the Prime Number Search\n\n");
		out.append("Base Number = "+base);
		out.append("\n\nPrime Number = "+baseCopy);
		out.append("\n\nElapsed Time = "+time+" milliseconds");
		Container container = getContentPane();
		container.add(out);
	}

	boolean isPrime(long n)
	{
	    if(n%2==0 || n%3==0) return false;
	    long sqrt=(long)Math.sqrt(n)+1;
	    for(long i=6; i<=sqrt; i+=6)
	    {
	        if(n%(i-1)==0 || n%(i+1)==0) return false;
	    }
	    return true;
	}
}
