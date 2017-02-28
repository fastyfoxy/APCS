// Tariq
//
// This program will test the methods of the BankAccount class.

import javax.swing.JTextArea;
import java.util.ArrayList;
import javax.swing.JFrame;
import java.awt.Container;
import java.util.Scanner;
import java.awt.Font;
import java.io.*;

public class U7A2 extends JFrame
{
	private JTextArea out = new JTextArea();
	private ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();

	public static void main(String[] args)
	{
		U7A2 u7a2 = new U7A2();
		u7a2.setSize(500, 500);
		u7a2.setVisible(true);
		u7a2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public U7A2()
	{
		buildList();
		printList();

		deposit("103s", 500);
		withdraw("110s", 304.52);
		insertNewAcc("105c", 300);
		deleteAccs();
		correctError("107s", 1113.88);
		applyInterest();
		insertNewAcc("111s", 100);
		fileUpdated();
	}

	public void buildList()
	{
		try
		{
			Scanner reader = new Scanner(new File
				("U:\\STUDENT\\PROJECTS\\West Projects\\Computer Science\\JavaData\\myCreditUnion.txt"));

			while(reader.hasNext())
			{
				String inputLine = reader.nextLine();

				accounts.add(new BankAccount
					(inputLine.substring(0, 4), Double.parseDouble(inputLine.substring(5))));
			}
			reader.close();
		}

		catch (IOException e)
		{
			throw new RuntimeException(e.toString());
		}
	}

	public void printList()
	{
		out.append("Account #\tBalance\n");

		for(int i=0; i<accounts.size(); i++)
		{
			BankAccount temp = accounts.get(i);

			out.append(String.format(temp.getAccountNumber()+"\t$ %.2f\n", temp.getBalance()));
		}

		Container container = getContentPane();
		container.add(out);
	}

	public void deposit(String accNum, double money)
	{
		for(int i=0; i<accounts.size(); i++)
		{
			BankAccount test = accounts.get(i);
			if(accNum.equals(test.getAccountNumber()))
			{
				test.deposit(money);
			}
		}
		out.append("\nDeposit Accepted\n");
	}

	public void withdraw(String accNum, double money)
	{
		for(int i=0; i<accounts.size(); i++)
		{
			if(accNum.equals(accounts.get(i).getAccountNumber()))
			{
				accounts.get(i).withdraw(money);
			}
		}
		out.append("Withdrawl Accepted\n");
	}

	public void insertNewAcc(String accNum, double initdep)
	{
		BankAccount temp = new BankAccount(accNum, initdep);
		int k;

		if(temp.getAccountType().equals("s")) accounts.add(new BankAccount(accNum, initdep));

		if(temp.getAccountType().equals("c"))
		{
			for(int i=0; i<accounts.size(); i++)
			{
				if(accounts.get(i).getAccountNum() == temp.getAccountNum())
				{
					accounts.add(i+1, temp);
					break;
				}
			}
		}

		out.append("New Account Added\n");
	}

	public void deleteAccs()
	{
		int count = 0;

		for(int i=0; i<accounts.size(); i++)
		{
			if(accounts.get(i).getBalance() == 0)
			{
				accounts.remove(i);
				count++;
			}
		}

		out.append(count+" Account(s) Removed\n");
	}

	public void correctError(String accNum, double balance)
	{
		BankAccount temp = new BankAccount(accNum, balance);

		for(int i=0; i<accounts.size(); i++)
		{
			if(accounts.get(i).getAccountNum() == temp.getAccountNum())
			{
				accounts.get(i).setBalance(balance);
				break;
			}
		}

		out.append("Correction Completed\n");
	}

	public void applyInterest()
	{
		for(int i=0; i<accounts.size(); i++)
		{
			accounts.get(i).calculateInterest();
		}

		out.append("Interest Applied to all Savings Accounts\n");
	}

	public void fileUpdated()
	{
		try
		{
			FileWriter writer = new FileWriter("temp.txt");
			PrintWriter out = new PrintWriter(writer);

			for(int i=0; i<accounts.size(); i++)
			{
				BankAccount temp = accounts.get(i);
				String bal = String.format("%.2f",temp.getBalance());
				out.println(temp.getAccountNumber()+" "+bal);
			}

			out.close();
		}
		catch(IOException e)
		{
			throw new RuntimeException(e.toString());
		}

		out.append("File Updated\n");
	}
}