// Name
//
// This program will convert base 2 to base 10 numbers.

public class U4A1
{
	private String bin;

	public U4A1(String x)
	{
		bin = x;
	}

	public int convert()
	{
		int result = 0;
		int counter = 0;
		String exp = bin;
		while(exp.length()>0)
		{
			result += (Integer.parseInt(exp.substring(0, 1))) * Math.pow(2, exp.length()-1);
			exp = exp.substring(1);
		}
		return result;
	}
}
