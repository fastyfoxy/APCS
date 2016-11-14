// Tariq
//
// This driver class will test the methods of the
// RoachPopulation class.

public class RoachPopulationDriver
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


/*

Population = 200
Population = 50
Population = 12
Population = 24
Press any key to continue . . .

*/