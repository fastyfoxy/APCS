public class Searcher
{
	private int[] list;

	public Searcher(int[] x)
	{
		list = x;
	}

	public boolean seqSearch(int t)
	{
		for (int i=0; i<list.length; i++)
		{
			if (list[i] == t) return true;
		}
		return false;
	}

	public boolean binSearch(int t)
	{
		int low = 0;
		int high = list.length-1;
		int mid, dif, count = 0;

		while (low <= high)
		{
			count++;
			mid = (low+high)/2;
			dif = list[mid] - t;

			if (dif == 0) return true;
			else if (dif<0) low = mid+1;
			else high = mid-1;
		}
		return false;
	}
}