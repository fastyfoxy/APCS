// Tariq
//
// This program will structure the Trick object.

import java.util.ArrayList;

public class Trick
{
	private ArrayList<Card> trickCards = new ArrayList<Card>();
	private int totalPoints;

	public Trick(ArrayList<Card> arraylist)
	{
		trickCards = arraylist;
		setTotalPoints();
	}

	public void setTotalPoints()
	{
		for (int i=0; i<trickCards.size(); i++)
		{
			totalPoints += trickCards.get(i).getPoints();
		}
	}

	public Card getWinner()
	{
		Card firstCard = trickCards.get(0);
		Card winner = firstCard;

		for (int i=1; i<trickCards.size(); i++)
		{
			if(trickCards.get(i).getType().equals(firstCard.getType()))
			{
				if(trickCards.get(i).compareTo(winner) == 1) winner = trickCards.get(i);
			}
		}

		return winner;
	}

	public String toString()
	{
		String output = "";

		for (int i=0; i<trickCards.size(); i++)
		{
			output += trickCards.get(i).toString()+"\n";
		}

		return output;
	}

	public int getTotalPoints()
	{
		return totalPoints;
	}
}