// Tariq
//
// This program will simulate a bank account.

public class BankAccount implements Measurable
{
	private String accountType;
	private static final double RATE = .04;
	private String accountNumber;
	private double balance;

	public BankAccount(String accNum, double bal)
	{
		setAccountType(accNum);
		accountNumber = accNum;
		balance = bal;
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
			return "Desposit Rejected - Insufficient Funds";
		}
	}

	public String withdraw(double money)
	{
		if(money<=getMeasure())
		{
			balance = balance-money;
			return "Withdraw Accepted";
		}

		else
		{
			return "Withdraw Denied - Insufficient Funds";
		}
	}

	public void calculateInterest()
	{
		if(accountType.equals("s"))
		{
			balance = balance*(1+RATE);
		}
	}

	public void setAccountType(String string)
	{
		String type = string.substring(3, 4);
		accountType = type;
	}

	public void setBalance(double money)
	{
		balance = money;
	}

	public static double getRate()
	{
		return RATE;
	}

	public double getMeasure()
	{
		return balance;
	}

	public String getAccountNumber()
	{
		return accountNumber;
	}

	public int getAccountNum()
	{
		return Integer.parseInt(accountNumber.substring(0,3));
	}

	public String getAccountType()
	{
		return accountType;
	}
}