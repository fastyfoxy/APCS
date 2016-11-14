// Tariq
//
// This program will test the methods of the
// TimeInterval class.

import java.util.Scanner;

public class TimeIntervalDriver
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

		TimeInterval t = new TimeInterval(x, y, z);

		double pay = t.getPay();
		int hrs = t.getHours();
		int min = t.getMinutes();

		System.out.println("Time on Task = " + hrs + " hours " + min + " minutes\n");
		System.out.printf("Pay = $%-5.2f%n", pay);
	}
}

/*

Please enter the starting time: 0930
Please enter the finishing time: 1700
Plese enter rate of pay: 12.75

Time on Task = 7 hours 30 minutes

Pay = $95.63
Press any key to continue . . .

*/