// This program prints arrays to an applet & resizes when neccesary.

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JApplet;
import java.awt.Container;
import java.awt.Font;

public class U5A3 extends JApplet
{
	private int array[] = new int[(int)(51 * Math.random() + 50)];
	private JTextArea out = new JTextArea();
	private int dataSize = 50;

	public void init()
	{
		fillArray();
	}

	public void fillArray()
	{
		out.setFont(new Font("Monospaced", Font.PLAIN, 12));
		out.append("Original Array\n\n");

		for(int i = 0; i<=49; i++)
		{
			array[i] = (int)(((4+(i*5))-(5*i)+1)*Math.random()+(5*i));
			out.append(array[i]+"\t");
			if((i+1)%10 == 0) out.append("\n");
		}

		out.append("\nArray Length = "+array.length);

		out.append("\n\n\nUpdated Array\n\n\n");

		for(int i=0; i<=29; i++)
		{
			int random = (int)(256*Math.random());
			insert(random);
		}

		for(int i = 0; i<=79; i++)
		{
			out.append(array[i]+"\t");
			if((i+1)%10 == 0) out.append("\n");
		}

		out.append("\nArray Length = "+array.length);

		Container container = getContentPane();
		container.add(out);
	}

	public void insert(int num)
	{
		int k=dataSize;
		int j = 0;
		boolean found = false;

		while ((j<dataSize) && (!found))
		{
			if(num>array[j]) j++;
		 	else found = true;
		}

		try
		{
			for(k=dataSize; k>j; k--)
			{
				array[k] = array[k-1];
			}
			array[j] = num;
			dataSize++;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			JOptionPane.showMessageDialog(null, "Index Out of Bounds - Resizing Array", "U5A3", JOptionPane.ERROR_MESSAGE);
			int newArray[] = new int[2*array.length];
			System.arraycopy(array, 0, newArray, 0, array.length);
			array = newArray;
			array[k] = array[k-1];
			dataSize++;
		}
	}
}
