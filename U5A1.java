// Name
// This program will find the mean & correlation between two integer arrays.

public class U5A1
{
	public static void main(String[] args)
	{
		U5A1 a = new U5A1();
	}

	public U5A1()
	{
		int[] grds = {5, 5, 5, 5, 4, 4, 5, 3, 5, 4, 4, 5, 5, 4, 4, 5, 4};
		int[] ap = {4, 5, 5, 5, 3, 2, 5, 4, 5, 4, 3, 4, 5, 4, 4, 5, 4};

		System.out.printf("Mean of AP Exams = %1.2f\n", mean(ap));
		System.out.printf("Mean of Grades   = %1.2f\n\n", mean(grds));
		System.out.printf("Standard Deviation of AP Exams = %1.2f\n", standardDev(ap));
		System.out.printf("Standard Deviation of Grades   = %1.2f\n\n", standardDev(grds));
		System.out.printf("Correlation = %1.2f\n\n", correlation(ap, grds));
	}

	public double mean(int[] a)
	{
		double sum = 0;
		for(int x : a)	sum+=x;
		return (sum/a.length);
	}

	public double standardDev(int[] a)
	{
		double apMean = mean(a);
		double sum = 0;
		for(int x : a)	sum += Math.pow((x - apMean), 2);
		return Math.sqrt(sum/a.length);
	}

	public double correlation(int[] a, int[] b)
	{
		double sum = 0;
		double aMean = mean(a);
		double bMean = mean(b);

		for(int i=0; i<a.length; i++)
			sum += (a[i]-aMean)*(b[i]-bMean)/((a.length-1)*standardDev(a)*standardDev(b));

		return sum;
	}
}
