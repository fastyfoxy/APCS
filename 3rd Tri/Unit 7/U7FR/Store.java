import java.util.ArrayList;

public class Store
{
	private ArrayList<StockItem> myStockList;

	public Store()
	{
		myStockList = new ArrayList<StockItem>();
	}

	public void add(StockItem s)
	{
		myStockList.add(s);
	}

	public double removeAll(int idnum)
	{
		int shelf = 2;
		StockItem temp = null;


		for (int i=0; i<myStockList.size(); i++)
		{
			temp = myStockList.get(i);

			if (temp.getID() == idnum);
			{
				shelf = temp.getNum();
				temp.remove(shelf);
				break;
			}
		}

		return temp.getPrice() * shelf;
	}

	public void replace(StockItem x, StockItem y)
	{
		for (int i=0; i<myStockList.size(); i++)
		{
			if(myStockList.get(i).getID() == x.getID())
			{
				myStockList.set(i, y);
			}
		}
	}

	public void list()
	{
		System.out.println("ID\tName\t\tPrice\tQuantity");
		System.out.println("--\t----\t\t-----\t--------");

		for (int i=0; i<myStockList.size(); i++)
		{
			System.out.println(myStockList.get(i).toString()+"\n");
		}
	}
}