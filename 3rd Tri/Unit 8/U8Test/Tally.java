// This program will tally up the different outcomes of each situation.

public class Tally
{
	private int[] tally;
	private String[] item;

	public Tally(String[] outcomes)
	{
		item = outcomes.clone();
		tally = new int[item.length];

		for (int i=0; i<tally.length; i++)
		{
			tally[i] = 0;
		}
	}

	public void process(Measurable x)
	{
		String result = x.getResult();

		for (int i=0; i<item.length; i++)
		{
			if(result.equals(item[i]))
			{
				tally[i]++;
				break;
			}
		}
	}

	public int[] getTally()
	{
		return tally;
	}
}