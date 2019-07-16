public class burger extends item
{
	private int numberofPatties;
	
	public burger()
	{
		super();
		System.out.println("Empty Burger");
	}
	public burger(String name, int id, double price, int numberofPatties)
	{
		super(name, id, price);
		System.out.println("Para Burger");
		this.numberofPatties=numberofPatties;
	}
	
	public void showinfo()
	{
		System.out.println("Item Name: "+name+"\nItem Id: "+id+"\nPrice: "+price+"\nNumber of Patties: "+numberofPatties+"\n");
	}
}