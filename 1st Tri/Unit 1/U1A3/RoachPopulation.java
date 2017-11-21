// This class will simulate the growth of a roach population.

public class RoachPopulation
{
	private int roaches;

	public RoachPopulation()
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
