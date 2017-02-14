// Tariq
//
// This program will test two sorting methods.

import javax.swing.JTextArea;
import javax.swing.JApplet;
import java.awt.Container;
import java.util.Random;
import java.awt.Font;

public class U6A1 extends JApplet
{

	private JTextArea out = new JTextArea();
	private int[] array1 = new int[10000];
	private int[] array2 = new int[10000];
	private long time;

	public void init()
	{
		out.setFont(new Font("Monospaced", Font.PLAIN, 12));

		out.append("Unsorted Array\n\n");
		buildArrays(array1, array2);
		printArray(array1);
		out.append("\n");

		out.append("After Selection Sort\n\n");
		long start = System.currentTimeMillis();
		selectionSort(array1);
		long end = System.currentTimeMillis();
		time=end-start;
		printArray(array1);
		out.append("Time = "+time+" milliseconds");

		out.append("\n\n\nAfter Insertion Sort\n\n");
		start = System.currentTimeMillis();
		insertionSort(array2);
		end = System.currentTimeMillis();
		time=end-start;
		printArray(array2);
		out.append("Time = "+time+" milliseconds");

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

	public void selectionSort(int[] array)
	{
		int minPos, temp;
		for (int i=0; i<array.length-1; i++)
		{
			minPos = i;

			for (int c=i+1; c<array.length; c++)
			{
				if (array[c] < array[minPos]) minPos = c;
			}

			temp = array[i];
			array[i] = array[minPos];
			array[minPos] = temp;
		}
	}

	public void insertionSort(int[] array)
	{
		int i, temp;

		for (int c=0; c<array.length; c++)
		{
			temp = array[c];
			i=c;

			while (i>0 && temp<array[i-1])
			{
				array[i] = array[i-1];
				i--;
			}

			array[i] = temp;
		}
	}

	public void printArray(int[] array)
	{
		for (int i=0; i<15; i++)	out.append(array[i]+"\t");
		out.append("\n   .\n   .\n   .\n\n");
		for (int i=9984; i<9999; i++)	out.append(array[i]+"\t");
		out.append("\n\n");
	}
}