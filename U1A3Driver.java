// Name
//
// This driver class will test the methods of the
// U1A3 class.

public class U1A3Driver
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
