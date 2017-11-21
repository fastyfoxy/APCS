// This program will display the itinerary of a golf trip.

public class Itinerary
{
	private String[] cityNames;
	private int[][] distances;

	public Itinerary(int[][]d, String[] cn)
	{
		distances = d;
		cityNames = cn;
	}

	public int findRemoteCity()
	{
		int index = 0;
		int sum = 0;

		for (int i=0; i<cityNames.length; i++)
		{
			int count = 0;
			for (int c=0; c<distances[i].length; c++)
			{
				 count+= distances[i][c];
			}

			if(count>sum) index = i;
			if(count>sum) sum = count;
		}
		return index;
	}

	public int findNearestCity(int num)
	{
		int index = 0;
		int distance = Integer.MAX_VALUE;

		for (int i=0; i<cityNames.length; i++)
		{
			if (i==num) continue;
			int d = distances[num][i];

			if (d<distance) index = i;
			if (d<distance) distance = d;
		}

		for (int i=0; i<cityNames.length; i++)
		{
			distances[i][index] = Integer.MAX_VALUE;
		}

		return index;
	}

	public String[] makeItinerary()
	{
		int[] indices = new int[cityNames.length];
		indices[0] = findRemoteCity();

		for (int i=1; i<cityNames.length; i++)
		{
			indices[i] = findNearestCity(indices[i - 1]);
		}

		String[] itinerary = new String[cityNames.length];

		for (int i = 0; i < cityNames.length; i++)
		{
			itinerary[i] = cityNames[indices[i]];
		}

		return itinerary;
	}

}
