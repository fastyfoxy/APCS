// Tariq
//
// This program will simulate a bank account.

import java.util.Random;

public class BankAccount
{
	private static int lastAssignedNumber = 100;
	private static final double RATE = 4.0;
	public int accountNumber;
	private double balance;

	public BankAccount()
	{
		setAccountBalance();
		setAccountNumber();
		accountNumber = lastAssignedNumber++;
	}

	public BankAccount(double money)
	{
		balance = money;
		setAccountNumber();
	}

	public String deposit(double money)
	{
		if(money>=0)
		{
			balance = balance+money;
			return "Deposit Accepted";
		}

		else
		{
			return "Desposit Rejected";
		}
	}

	public String withdraw(double money)
	{
		if(money<=getBalance())
		{
			balance = balance-money;
			return "Withdraw Accepted";
		}

		else
		{
			return "Withdraw Denied - Insufficient Funds";
		}
	}

	public void interest()
	{
		balance = balance*(1+(RATE/100.0));
	}

	public void setAccountNumber()
	{
		accountNumber = lastAssignedNumber++;
	}

	public void setAccountBalance()
	{
		Random gen = new Random();
		balance = 1000*gen.nextDouble();
	}

	public int getAccountNumber()
	{
		return accountNumber;
	}

	public double getBalance()
	{
		return balance;
	}

	public static double getRate()
	{
		return RATE;
	}
}