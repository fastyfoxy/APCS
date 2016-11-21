// Tariq
//
// This progarm  will determine the number of months it will take to completely pay off debt.

import java.util.Scanner;

public class U4A4
{
	private double balance, apr, profit, total, minimumPay;
	private int months, percent;

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
		apr = in.nextDouble();

		System.out.println("\n\nNumber of months to pay off debt: "+months);
		System.out.println("\nProfit for the credit company = "+profit+"\n"); //PROFIT HAS TO BE STRING.FORMAT'ED
	}

	public int getMonths()
	{
       if((percent/100D)*balance > 20.0) minimumPay = (percent/100D)*balance;
		else if (balance<20.0) minimumPay = balance;
		else minimumPay = 20.0;

		profit = total - balance;
		return months;
	}
}
