// This program will test the methods of the CashRegister class.

import java.util.Scanner;

public class U2A2
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		System.out.print("Enter Amount Due: ");
		double x = in.nextDouble();

		System.out.print("Enter Amount Received: ");
		double y = in.nextDouble();
		System.out.println();

		CashRegister a = new CashRegister(x, y);

		int dollars = a.getDollars();
		int quarters = a.getQuarters();
		int dimes = a.getDimes();
		int nickels = a.getNickels();
		int pennies = a.getPennies();

		System.out.println("Dollars  = " + dollars);
		System.out.println("Quarters = " + quarters);
		System.out.println("Dimes    = " + dimes);
		System.out.println("Nickels  = " + nickels);
		System.out.println("Pennies  = " + pennies);
	}
}