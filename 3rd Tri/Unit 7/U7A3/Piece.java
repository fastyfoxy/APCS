// This program will make a piece, either an "X" or an "O".

public class Piece
{
	private String id;

	public Piece()
	{
		id = " ";
	}

	public Piece(String x)
	{
		id = x;
	}

	public String getID()
	{
		return id;
	}

	public boolean equals(Piece p)
	{
		if (this.getID().equals(p.getID()))
			return true;
		else
			return false;
	}
}