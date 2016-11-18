// Tariq
//
// This program will test the methods of the U2A1 class.

public class U2A1Driver
{
	public static void main(String[] args)
	{
		Product a = new Product("Jeans", 34.95);
		Product b = new Product("Sweater", 49.99);
		Product c = new Product("Shoes", 99.95);

		a.discount(30);
		a.tax();
		b.discount(40);
		b.discount(30);
		b.tax();
		c.dollarsOff(5);
		c.discount(30);
		c.tax();

		String aname, bname, cname;
		double acost, bcost, ccost;

		aname = a.getName();
		bname = b.getName();
		cname = c.getName();
		acost = a.getCost();
		bcost = b.getCost();
		ccost = c.getCost();

		System.out.printf("Item: %-7s%n", aname);
		System.out.printf("Cost: $ %-5.2f%n%n", acost);
		System.out.printf("Item: %-7s%n", bname);
		System.out.printf("Cost: $ %-5.2f%n%n", bcost);
		System.out.printf("Item: %-7s%n", cname);
		System.out.printf("Cost: $ %-5.2f%n", ccost);
	}
}

/*

Item: Jeans
Cost: $ 26.06

Item: Sweater
Cost: $ 22.36

Item: Shoes
Cost: $ 70.79
Press any key to continue . . .

*/
