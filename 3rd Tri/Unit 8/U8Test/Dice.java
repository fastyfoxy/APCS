// This program will structure an object representing two die rolls.

public class Dice implements Measurable
{
	private int die1;
	private int die2;
	private String sum;

	public Dice(int num1, int num2)
	{
		die1 = num1;
		die2 = num2;
		setSum();
	}

	public void setSum()
	{
		int total = die1+die2;
		sum = ""+total;
	}

	public String getResult()
	{
		return sum;
	}
}