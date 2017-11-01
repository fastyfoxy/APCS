public class Driver
{
	public static void main(String[] args)
	{
		Store inventory = new Store();

		StockItem a = new StockItem("Special K", 1001, 2.35, 12);
		inventory.add(a);

		StockItem b = new StockItem("Kleenix", 1002, 1.76, 8);
		inventory.add(b);

		StockItem c = new StockItem("Coke", 1003, 1.49, 15);
		inventory.add(c);

		StockItem d = new StockItem("Peanuts", 1004, 2.29, 6);
		inventory.add(d);

		StockItem e = new StockItem("Soap", 1005, 0.89, 25);
		inventory.add(e);


		inventory.list();

		StockItem newSoap = new StockItem("Soap", 1005, 0.92, 25);
		inventory.replace(e, newSoap);

		StockItem newKleenix = new StockItem("Kleenix", 1002, 1.76, 2);
		inventory.replace(b, newKleenix);

		StockItem newCoke = new StockItem("Coke", 1003, 1.49, 39);
		inventory.replace(c, newCoke);

		System.out.println("Value of peanuts removed from shelf: $"+inventory.removeAll(1004)+"\n\n");


		StockItem Total = new StockItem("Total", 1006, 2.24, 48);
		inventory.replace(a, Total);

		inventory.list();
	}
}