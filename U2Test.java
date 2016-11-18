//Tariq
//
// This program will calculate the average of a set of numbers.

public class U2Test
{
	private int sum;
	private int count;

	public U2Test()
	{
		sum = 0;
		count = 0;
	}

	public DataSet(int x, int y)
	{
		sum = x;
		count = y;
	}

	public void addValue(int x)
	{
		sum = sum + x;
		count = count+1;
	}

	public double average()
	{
		double ans;
		ans = (double)sum/count;
		return ans;
	}

	public int getSum()
	{
		return sum;
	}

	public int getCount()
	{
		return count;
	}
}
