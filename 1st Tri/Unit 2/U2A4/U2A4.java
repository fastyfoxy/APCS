// This program will test the methods of the EasterSunday class.

import java.util.Scanner;
import java.io.*;

public class U2A4
{
	public static void main(String[] args)
	{
		U2A4 app = new U2A4();
	}

	public U2A4()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int x = in.nextInt();

		EasterSunday a = new EasterSunday(x);
		int m = a.getMonth();
		int d = a.getDay();

		String name = getMonthName(m);

		System.out.println("Easter Sunday is on " + name + d + ".");
	}


	public String getMonthName(int m)
	{
		Scanner in;

		try
		{
			in = new Scanner(new File("U:\\STUDENT\\PROJECTS\\West Projects\\Computer Science\\JavaData\\U2A4.txt"));
		}
		catch (IOException e)
		{
			throw new RuntimeException(e.toString());
		}

		String inputLine = in.nextLine();
		String name = inputLine.substring((m-1)*9, m*9);
		return name;
	}
}