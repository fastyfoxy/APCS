// This driver class will test the methods of the RoachPopulation class.

public class U1A3
{
	public static void main(String[] args)
	{
		int x;
		RoachPopulation r = new RoachPopulation();

		r.timePasses();
		x = r.getRoaches();
		System.out.println("Population = " + x);

		r.spray();
		x = r.getRoaches();
		System.out.println("Population = " + x);

		r.spray();
		x = r.getRoaches();
		System.out.println("Population = " + x);

		r.timePasses();
		x = r.getRoaches();
		System.out.println("Population = " + x);
	}
}