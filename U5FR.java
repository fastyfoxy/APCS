public class U5FR
{
	private int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	int[][]chart = {{0, 1, 2, 3, 4},
						{5, 6, 7, 8, 9},
						{10, 11, 12, 13, 14},
						{15, 16, 17, 18, 19},
						{20, 21, 22, 23, 24}};

	public U5FR()
	{
		/* 
    System.out.println("Original Array: "+array[0]+array[1]+array[2]+array[3]+array[4]+array[5]+array[6]+array[7]+array[8]+array[9]);
		rotate(array);
		System.out.println("New Array: "+array[0]+array[1]+array[2]+array[3]+array[4]+array[5]+array[6]+array[7]+array[8]+array[9]);
    */

		//System.out.println(arraySum(array));

		/*Copy into rowSums before return statement:

		System.out.println("Sums of Rows: "+sums[0]+", "+sums[1]+", "+sums[2]+", "+sums[3]+", "+sums[4]);
    
    rowSums(chart);
		*/

		//System.out.println(isDiverse(array));

	}

	public static void main(String[] args)
	{
		U5FR U5FR = new U5FR();
	}

	public void rotate(int[] a)
	{
int[] newArray = new int[a.length];

for(int i: a)
{
	if(i==0) newArray[0] = a[a.length-1];
	else newArray[i] = a[i-1];
}

array = newArray;
	}

	public int arraySum(int[] a)
	{
		int sum = 0;
		for (int i: array) sum+= a[i];
		return sum;
	}

	public int[] rowSums(int[][] a)
	{
        int[] sums = new int[a.length];

        for (int i=0; i<a.length; i++)
        {
            sums[i] = arraySum(a[i]);
        }

        return sums;
	}

	public boolean isDiverse(int[] a)
	{
		for (int i=0; i<a.length; i++)
		{
			for (int c=i+1; c<a.length; c++)
			{
				if (a[i] == a[c]) return false;
			}
		}
		return true;
	}
}
