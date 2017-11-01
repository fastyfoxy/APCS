// Name
//
// This class will simulate a product purchase.

public class U2A1
{
	private String name;
	private double cost;

	public U2A1(String n, double c)	//parametric constructor
	{
		name = n;
		cost = c;
	}

	public void discount(int percent)
	{
		cost = (double) (100-percent)/100 * cost;
	}

	public void dollarsOff(int dollars)
	{
		cost = (double) cost - dollars;
	}

	public void tax()
	{
		final double TAX_RATE = 0.065;
		cost = (double) (TAX_RATE * cost) + cost;
	}

	public String getName()
	{
		return name;
	}

	public double getCost()
	{
		return cost;
	}
}
