// This program will test the methods of BBPlayer.

import javax.swing.JTextArea;
import java.util.ArrayList;
import java.awt.Container;
import javax.swing.JFrame;
import java.util.Scanner;
import java.awt.Font;
import java.io.*;

public class U7Test extends JFrame
{
	private ArrayList<BBPlayer> arrayList = new ArrayList<BBPlayer>();
	private JTextArea out = new JTextArea();

	public static void main(String[] args)
	{
		U7Test u7test = new U7Test();

		u7test.setSize(500, 500);
		u7test.setVisible(true);
		u7test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public U7Test()
	{
		try
		{
			int i=0;
			Scanner reader = new Scanner(new File("U:\\STUDENT\\PROJECTS\\West Projects\\Computer Science\\JavaData\\u7test.txt"));

			while(reader.hasNext())
			{
				arrayList.add(new BBPlayer(reader.nextLine()));
			}
			reader.close();
		}
		catch(IOException e)
		{
			throw new RuntimeException(e.toString());
		}

		out.append(" Original List\n\n");

		printList();
		sort();

		out.append("\n\n\n Sorted List\n\n");
		printList();
	}

	public void printList()
	{
		out.setFont(new Font("Monospaced", Font.PLAIN, 14));
		out.append(" Number Year\tPosition\tPoint Per Game\n");
		out.append(" ------ ----\t--------\t--------------\n");

		for(int i=0; i<arrayList.size(); i++)
		{
			out.append("   "+arrayList.get(i).getNum()+"\t ");
			out.append(arrayList.get(i).getYear()+"\t   "+arrayList.get(i).getPos());
			out.append("\t\t     "+arrayList.get(i).getPPG()+"\n");
		}

		Container container = getContentPane();
		container.add(out);
	}

	public void sort()
	{
		int maxPos;

		for (int i=0; i<arrayList.size()-1; i++)
		{
			maxPos = i;

			for (int c=i+1; c<arrayList.size(); c++)
			{
				if (arrayList.get(c).getPPG() > arrayList.get(maxPos).getPPG()) maxPos = c;
			}

			BBPlayer temp = arrayList.get(i);
			arrayList.set(i, arrayList.get(maxPos));
			arrayList.set(maxPos, temp);
		}
	}
}