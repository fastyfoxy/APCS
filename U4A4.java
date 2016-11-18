// Tariq
//
// This progarm  will determine the number of months it will take to completely pay off debt.

import java.util.Scanner;

public class U4A4
{
	private double balance, apr, total, minimumPay;
	private int months, percent;
	
	public static void main(String[] args)
	{
		U4A4 debt = new U4A4();	
	}
	public U4A4(double x, y, z)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter credit card balance: ");
		balance = in.nextDouble();
		
		System.out.print("\n\nEnter minimum monthly payment (as a % of the balance): "
		percent = in.nextInt();
				 
		System.out.print("\n\nEnter the annual percentage rate: ");
		percent = in.nextInt();
				 
		double bal = x;
		if((percent/100.0)*balance > 20.0) minimumPay = (percent/100.0)*balance;
		else if (bal<20.0) pay = bal;
		else pay = 20.0;
		double pay = (y/100.0) * bal;
		double apr = z;
	}
	
	public int getMonths()
	{
		
	}
}
