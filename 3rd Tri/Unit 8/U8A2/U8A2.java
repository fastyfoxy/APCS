// Tariq
//
// This program will test the concepts of an interface.

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Container;
import java.awt.Font;
import java.io.*;
import java.util.StringTokenizer;
import java.util.Scanner;

public class U8A2 extends JFrame
{
	private JTextArea out = new JTextArea();

	public static void main(String[] args)
	{
		U8A2 u8a2 = new U8A2();
		u8a2.setSize(300, 500);
		u8a2.setVisible(true);
		u8a2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public U8A2()
	{
		testBBPlayer();
		testBankAccount();
	}

	public void testBBPlayer()
	{
		String input;
		DataSet z = new DataSet();

		try
		{
			Scanner in = new Scanner(new File("u7test.txt"));

			for (int i=0; i<5; i++)
			{
				input = in.nextLine();
				BBPlayer aPlayer = new BBPlayer(input);
				z = new DataSet(aPlayer);
			}
		}
		catch(IOException e)
		{
			throw new RuntimeException(e.toString());
		}

		Container container = getContentPane();
		out.setFont(new Font("Monospaced", Font.BOLD, 14));
		out.setText("BBPlayer Stats\n");
		out.append("--------------\n\n");
		double bbmin = z.getMin();
		double bbmax = z.getMax();
		double bbavg = z.getAvg();

		String output = String.format("%.2f", bbavg);
		out.append("Minimum Points Per Game = "+bbmin+"\n\n");
		out.append("Maximum Points Per Game = "+bbmax+"\n\n");
		out.append("Average Points Per Game = "+output+"\n\n");
		container.add(out);
	}

	public void testBankAccount()
	{
		String num, sbal;
		double bal;
		DataSet z = new DataSet();

		try
		{
			Scanner in = new Scanner(new File("myCreditUnion.txt"));

			while(in.hasNext())
			{
				String line = in.nextLine();
				StringTokenizer tokenizer = new StringTokenizer(line);
				num = tokenizer.nextToken();
				sbal = tokenizer.nextToken();
				bal = Double.parseDouble(sbal);
				BankAccount anAccount = new BankAccount(num, bal);
				z = new DataSet(anAccount);
			}
			in.close();
		}
		catch(IOException e)
		{
			throw new RuntimeException(e.toString());
		}

		out.append("\nBankAccount Stats\n");
		out.append("-----------------\n\n");
		double bamin = z.getMin();
		double bamax = z.getMax();
		double baavg = z.getAvg();
		out.append("Minimum Bank Account = "+bamin+"\n\n");
		out.append("Maximum Bank Account = "+bamax+"\n\n");
		String x = String.format("%.2f", baavg);
		out.append("Average Bank Account = "+x+"\n\n");
	}
}