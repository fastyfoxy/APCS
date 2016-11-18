// Tariq
//
// This program will test the methods of the U2A2 class.

import java.util.Scanner;

public class U2A2Driver
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		System.out.print("Enter Amount Due: ");
		double x = in.nextDouble();

		System.out.print("Enter Amount Received: ");
		double y = in.nextDouble();
		System.out.println();

		U2A2 a = new U2A2(x, y);

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

/*

Enter Amount Due: 41.35
Enter Amount Received: 50.00

Dollars  = 8
Quarters = 2
Dimes    = 1
Nickels  = 1
Pennies  = 0
Press any key to continue . . .

*/
