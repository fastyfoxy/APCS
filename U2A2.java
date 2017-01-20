// Name
//
// This program directs a cashier on how to give change.

public class U2A2
{
	private int dollars;
	private int quarters;
	private int dimes;
	private int nickels;
	private int pennies;

	public U2A2(double amountdue, double amountrecieved)
	{
		int diff = (int)(100 * amountrecieved) - (int)(100 * amountdue);

		dollars = (diff/100);
		diff = diff % 100;

		quarters = (diff/25);
		diff = diff % 25;

		dimes = (diff/10);
		diff = diff % 10;

		nickels = (diff/5);
		diff = diff % 5;

		pennies = diff;
	}

	public int getDollars()
	{
			return dollars;
	}

	public int getQuarters()
	{
			return quarters;
	}

	public int getDimes()
	{
			return dimes;
	}

	public int getNickels()
	{
			return nickels;
	}

	public int getPennies()
	{
			return pennies;
	}
}
