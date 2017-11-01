// Name
//
// This program calculates a worker's pay.

public class U2A3
{
	private int hrs;
	private int min;
	private double pay;

	public U2A3(int beginTime, int finishTime, double hourlyPay)
	{
		int h1 = beginTime / 100;
		int m1 = beginTime % 100;
		int t1 = h1 * 60 + m1;

		int h2 = finishTime / 100;
		int m2 = finishTime % 100;
		int t2 = h2 * 60 + m2;

		int time = t2 - t1;

		hrs = time / 60;
		min = time % 60;

		pay = hourlyPay * (hrs + min/60.0);
	}

	public int getHours()
	{
		return hrs;
	}

	public int getMinutes()
	{
		return min;
	}

	public double getPay()
	{
		return pay;
	}
}
