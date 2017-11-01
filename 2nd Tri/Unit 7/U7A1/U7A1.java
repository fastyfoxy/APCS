// Tariq
//
// This program will test the methods of the BankAccount class.

import javax.swing.JTextArea;
import javax.swing.JApplet;
import java.awt.Container;
import java.util.Random;
import java.awt.Font;

public class U7A1 extends JApplet
{
	public void init()
	{
		JTextArea out = new JTextArea();
		out.setFont(new Font("Monospaced", Font.PLAIN, 12));
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount(1500.00);

		out.append("Account Information\n-------------------\n\n");

		String result = String.format("$ %.2f", account1.getBalance());
		out.append("Initial Balance for account "+account1.getAccountNumber()+" = "+result);
		result = String.format("$ %.2f", account2.getBalance());
		out.append("\nInitial Balance for account "+account2.getAccountNumber()+" = "+result);

		out.append("\n\n"+account1.deposit(300.0)+"\n"+account2.deposit(200.0));

		out.append("\n"+account1.withdraw(250.0)+"\n"+account2.withdraw(125.0)+"\n");

		account1.interest();
		account2.interest();

		if(account1.getBalance()>=550.0)
		{
			out.append(account1.withdraw(550.0)+"\n");
			out.append(account2.deposit(550.0)+"\n");
		}
		else
		{
			out.append(account1.withdraw(550.0)+"\n");
			out.append(account1.deposit(-1)+"\n");
		}

		account1.interest();
		account2.interest();

		result = String.format("$ %.2f", account1.getBalance());
		out.append("\nFinal Balance for account "+account1.getAccountNumber()+" = "+result);
		result = String.format("$ %.2f", account2.getBalance());
		out.append("\nFinal Balance for account "+account2.getAccountNumber()+" = "+result);

		out.append("\n\nInterest Rate = "+BankAccount.getRate()+" %");

		Container container = getContentPane();
		container.add(out);
	}
}