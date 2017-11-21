// This program will structure the Card object.

public class Card implements Comparable
{
	private int cardValue;
	private int cardPoints;
	private String cardType;

	public Card (String suit, int value)
	{
		cardValue = value;
		cardType = suit;
		setPoints();
	}

	public void setPoints()
	{
		if(cardValue == 12 && cardType.equals("Spades")) cardPoints = 13;
		else if(cardType.equals("Hearts")) cardPoints = 1;
		else cardPoints = 0;
	}

	public String toString()
	{
		String name = "";

		switch(cardValue)
		{
			case 11:
				name = "Jack";
				break;
			case 12:
				name = "Queen";
				break;
			case 13:
				name = "King";
				break;
			case 14:
				name = "Ace";
				break;
			default: name = Integer.toString(cardValue);
				break;
		}

		return name+" of "+cardType;
	}

	public int compareTo(Object obj)
	{
		Card myCard = (Card)obj;

		if(cardValue > myCard.getValue()) return 1;
		if(cardValue < myCard.getValue()) return -1;
		else return 0;
	}

	public int getValue()
	{
		return cardValue;
	}

	public String getType()
	{
		return cardType;
	}

	public int getPoints()
	{
		return cardPoints;
	}
}