// This program will test the methods of the Pay class.

import java.util.Scanner;

public class U2A3
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		System.out.print("Please enter the starting time: ");
		int x = in.nextInt();

		System.out.print("Please enter the finishing time: ");
		int y = in.nextInt();

		System.out.print("Plese enter rate of pay: ");
		double z = in.nextDouble();
		System.out.println();

		Pay t = new Pay(x, y, z);

		double pay = t.getPay();
		int hrs = t.getHours();
		int min = t.getMinutes();

		System.out.println("Time on Task = " + hrs + " hours " + min + " minutes\n");
		System.out.printf("Pay = $%-5.2f%n", pay);
	}
}