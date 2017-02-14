import java.util.Random;

public class U6FR
{
	private int[] array = new int[10000];

	public U6FR()
	{
		fillArray();
		Searcher searcher = new Searcher(array);
		Sorter sorter = new Sorter(array);

		long start = System.currentTimeMillis();
		boolean found = searcher.seqSearch(1234);
		long end = System.currentTimeMillis();
		long time  = end-start;
		System.out.println("Idea #1:  Found = "+found+"\t\tTime = "+time+" milliseconds\n");

		start = System.currentTimeMillis();
		sorter.mergeSort();
		found = searcher.binSearch(1234);
		end = System.currentTimeMillis();
		time  = end-start;
		System.out.println("Idea #2:  Found = "+found+"\t\tTime = "+time+" milliseconds");
	}

	public static void main(String[] args)
	{
		U6FR app = new U6FR();
	}

	private void fillArray()
	{
		Random generator = new Random();

		for (int i=0; i<array.length; i++)
		{
			array[i] = generator.nextInt(9000) + 1000;
		}
	}
}