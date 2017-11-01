// Tariq
//
// This program will test the methods of the Card and Trick class.

import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import java.util.ArrayList;


public class U8A3
{

	public static void main(String[] args)
	{
		ArrayList<Card> cards = new ArrayList<Card>();
		String input;

		for (int i=1; i<6; i++)
		{
			if(i==1)input = JOptionPane.showInputDialog("Please Enter The 1st Card:");
			else if(i==2)input = JOptionPane.showInputDialog("Please Enter The 2nd Card:");
			else if(i==3)input = JOptionPane.showInputDialog("Please Enter The 3rd Card:");
			else input = JOptionPane.showInputDialog("Please Enter The "+i+"th Card:");

			StringTokenizer st = new StringTokenizer(input);

			cards.add(new Card(st.nextToken(), Integer.parseInt(st.nextToken())));
		}

		Trick trick = new Trick(cards);

		System.out.println("The Trick:\n\n"+trick.toString());
		System.out.println("Winning Card = "+trick.getWinner().toString()+"\n");
		System.out.println("Points in Trick = "+trick.getTotalPoints());
	}
}