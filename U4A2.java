// Name
//
// This program will approximate the value of pi.

public class U4A2
{
	private static final double PI = 3.14159;

	public static void main(String[] args)
	{
		U4A2 a = new U4A2();
	}

	public U4A2()
	{
		double num = 0;
		int c = 0;

		do
		{
			num += 4*(1.0 / (2*c+1)) * Math.pow(-1, c);
			c++;
		} while (Math.round(num * 100000) / 100000.0 != PI);

		System.out.printf("Value of pi = %.5f ", num);
		System.out.println("\n\nNumber of elements in the series = "+c);
	}
}
