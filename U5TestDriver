// Name
//
// This program will test the methods of the U5Test class.

public class U5TestDriver
{
	public static void main(String[] args)
	{
		String[] names = {"Iowa City", "Ames", "Waterloo", "Ottumwa", "Burlington"};
		int[][]chart = {{0, 121, 81, 83, 82},
						{121, 0, 96, 116, 190},
						{81, 96, 0, 117, 154},
						{83, 116, 117, 0, 77},
						{82, 190, 154, 77, 0}};

		U5Test x = new U5Test(chart, names);
		System.out.println("The Itinerary\n-------------");

		String[] output = x.makeItinerary();

		for (int i=0; i<5; i++) System.out.println(output[i]);
	}
}
