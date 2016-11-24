// Tariq
//
// This progarm  will determine the number of months it will take to completely pay off debt.

import java.util.Scanner;

public class U4A4
{
	private double balance, apr, profit, total;
	private int percent, months;

	public static void main(String[] args)
	{
		U4A4 debt = new U4A4();
	}
	public U4A4()
	{
		Scanner in = new Scanner(System.in);

		System.out.print("Enter credit card balance: ");
		balance = in.nextDouble();

		System.out.print("\nEnter minimum monthly payment (as a % of the balance): ");
		percent = in.nextInt();

		System.out.print("\nEnter the annual percentage rate: ");
		apr = in.nextDouble() / 100.0;

		System.out.println("\n\nNumber of months to pay off debt: "+getMonths(balance));
		System.out.printf("\nProfit for the credit card company = $%.2f",profit);
		System.out.println("\n");
	}

	public int getMonths(double balance)
	{
		double newBalance = 0;
		double minimumPay = balance*percent/100.0;

		if(balance<20) minimumPay = balance*(1+apr/12);
		else
		{
			if(minimumPay < 20) minimumPay = 20;
			else minimumPay = minimumPay;
		}

		total+=minimumPay;
		if(balance < 20) total-=(balance * (1 + apr / 12) - balance);
		else total-=0;
		newBalance = balance*(1+apr/12) - minimumPay;

		months++;

		if(newBalance!=0)
		{
			getMonths(newBalance);
		}

		profit = total - balance;
		return months;
	}
}
