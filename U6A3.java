// Tariq
//
// This program will test the sequential and binary searches.

import javax.swing.JTextArea;
import javax.swing.JApplet;
import java.awt.Container;
import java.util.Random;
import java.awt.Font;

public class U6A3 extends JApplet
{

	private int[] targets = {2, 2629, 11176, 27032, 43661};
	private JTextArea out = new JTextArea();
	private int[] array = new int[300];

	public void init()
	{
		out.setFont(new Font("Monospaced", Font.PLAIN, 12));
		buildArray();

		out.append("The Array\n\n");

		for (int i=0; i<array.length; i=i)
		{
			for (int c=0; c<15; c++)
			{
				out.append(array[i]+"\t");
				i++;
			}
			out.append("\n");
		}

		out.append("\n\n\nSearch Comparisons using # of visits to the Array\n\nNumber  Sequential\tBinary\n");
		out.append("------  ----------\t------\n");
		for (int i=0; i<5; i++)
		{
			out.append(targets[i]+"\t");
			if(sequential(targets[i]) == -1) out.append("Not Found\t");
			if(binary(targets[i]) == -1) out.append("Not Found\n");
			else out.append(sequential(targets[i])+"\t\t"+binary(targets[i])+"\n");
		}

		Container container = getContentPane();
		container.add(out);
	}

	public void buildArray()
	{
		for (int i=1; i<array.length; i++)
		{
			array[0] = 1;
			array[i] = array[i-1]+i;
		}
	}

	public int sequential(int target)
	{
		for (int i=0; i<array.length; i++)
		{
			if (array[i] == target) return i+1;
		}
		return -1;
	}

	public int binary(int target)
	{
		int low = 0;
		int high = array.length-1;
		int mid, dif, count = 0;

		while (low <= high)
		{
			count++;
			mid = (low+high)/2;
			dif = array[mid] - target;

			if (dif == 0) return count;
			else if (dif<0) low = mid+1;
			else high = mid-1;
		}
		return -1;
	}
}