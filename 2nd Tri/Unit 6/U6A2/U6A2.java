// This program will test the merge sort and quick sort methods.

import javax.swing.JTextArea;
import javax.swing.JApplet;
import java.awt.Container;
import java.util.Random;
import java.awt.Font;

public class U6A2 extends JApplet
{
	private JTextArea out = new JTextArea();
	private int[] array1 = new int[10000];
	private int[] array2 = new int[10000];
	private long time;

	public void init()
	{
		buildArrays(array1, array2);
		MergeSorter x = new MergeSorter(array1);
		QuickSorter y = new QuickSorter(array2);
		out.setFont(new Font("Monospaced", Font.PLAIN, 12));

		out.append("Unsorted Array\n\n");
		printArray(array1);
		out.append("\n");

		out.append("MergeSort\n\n");
		long start = System.currentTimeMillis();
		x.sort();
		long end = System.currentTimeMillis();
		time = end-start;
		printArray(array1);
		out.append(time+" milliseconds");

		out.append("\n\n\nQuickSort\n\n");
		start = System.currentTimeMillis();
		y.sort(0, 9999);
		end = System.currentTimeMillis();
		time = end-start;
		printArray(array2);
		out.append(time+" milliseconds");

		Container container = getContentPane();
		container.add(out);
	}

	public void buildArrays(int[] array1, int[] array2)
	{
		int random;
		Random generator = new Random();

		for (int i=0; i<array1.length; i++)
		{
			random = generator.nextInt(1000);
			array1[i] = random;
			array2[i] = random;
		}

		array2 = (int[])array1.clone();
	}

	public void printArray(int[] array)
	{
		for (int i=0; i<15; i++)	out.append(array[i]+"\t");

		out.append("\n\n   .\n   .\n   .\n\n");

		for (int i=9984; i<9999; i++)	out.append(array[i]+"\t");
		out.append("\n\n");
	}
}