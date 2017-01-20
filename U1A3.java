// Name
//
// This class will simulate the growth of a roach population.

public class U1A3
{
	private int roaches;

	public U1A3()
	{
		roaches = 100;
	}

	public void timePasses()
	{
		roaches = 2 * roaches;
	}

	public void spray()
	{
		roaches = (int)(0.25 * roaches);
	}

	public int getRoaches()
	{
		return roaches;
	}
}
