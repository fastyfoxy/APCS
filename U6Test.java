// Tariq
//
// This program will sort an array of names and search for "Jones".

import javax.swing.JTextArea;
import javax.swing.JApplet;
import java.awt.Container;
import java.awt.Font;

public class U6Test extends JApplet
{
  private String[] names = {"Barr", "Chamberlain", "Fullam", "Gertler", "Jones",
			"Krantzler", "Ferguson", "Litchfield", "Johnson", "Sundeen", "Baker",
			"Celebucki", "Dunagan", "Eckert", "Framke", "Hoekstra", "Jackson",
			"Klupchak", "Kurtz", "Mahler", "Maxwell", "Rothermel", "Tarjan",
			"Tiller", "Turek"};

  public void init()
  {
	  JTextArea out = new JTextArea();
	  out.setFont(new Font("Monospaced", Font.PLAIN, 12));
	  String[] alphabetical = new String[25];
	  String[] length = new String[25];
	  int j, minPos;
	  String temp;

	  for(int i=0; i<names.length; i++)
	  {
		  temp = names[i];
		  j=i;

		  while(j>0 && temp.compareTo(alphabetical[j-1]) < 0)
		  {
			alphabetical[j] = alphabetical[j-1];
			j--;
		  }
		  alphabetical[j] = temp;
	  }

	  System.arraycopy(alphabetical, 0, length, 0, names.length);

	  for(int i=0; i<names.length; i++)
	  {
		  temp = length[i];
		  j=i;

		  while(j>0 && temp.length() < length[j-1].length())
		  {
			length[j] = length[j-1];
			j--;
		  }
		  length[j] = temp;
	  }

	  out.setTabSize(24);
	  out.append("Sorted Alphabetically   Sorted by Length");
	  out.append("\n---------------------   ----------------\n");
	  	  for(int i=0; i<names.length; i++)
	  	  		out.append(alphabetical[i]+"\t"+length[i]+"\n");
	  out.append("\nJones at index "+binary(alphabetical, "Jones"));
	  out.append("\tJones at index "+sequential(length, "Jones"));

	  Container container = getContentPane();
	  container.add(out);
  }

  public int binary(String[] array, String target)
  {
	int low = 0;
	int high = array.length-1;
	int mid, dif, count = 0;

	while (low <= high)
	{
		mid = (low+high)/2;
		dif = array[mid].compareTo(target);

		if (dif == 0) return mid;
		else if (dif<0) low = mid+1;
		else high = mid-1;
	}
	return -1;
  }

  public int sequential(String[] array, String target)
  {
	  for (int i=0; i<array.length; i++)
	  {
		  if (array[i] == target) return i+1;
	  }
	  return -1;
  }
}