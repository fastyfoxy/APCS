public class Sorter
{
	private int[] list;

	public Sorter(int[] x)
	{
		list = x;
	}

	public void selectionSort()
	{
		int minPos, temp;
		for (int i=0; i<list.length-1; i++)
		{
			minPos = i;

			for (int c=i+1; c<list.length; c++)
			{
				if (list[c] < list[minPos]) minPos = c;
			}

			temp = list[i];
			list[i] = list[minPos];
			list[minPos] = temp;
		}
	}

	public void insertionSort()
	{
		int i, temp;

		for (int c=0; c<list.length; c++)
		{
			temp = list[c];
			i=c;

			while (i>0 && temp<list[i-1])
			{
				list[i] = list[i-1];
				i--;
			}

			list[i] = temp;
		}
	}

	public void mergeSort()
	{
		MergeSorter mergesorter = new MergeSorter(list);
		mergesorter.sort();
	}

	public void quickSort()
	{
		QuickSorter quicksorter = new QuickSorter(list);
		quicksorter.sort(0, 9999);
	}
}