public class pizza extends item
{
	private int diameter;
	
	public pizza()
	{
		super();
		System.out.println("Empty pizza");
	}
	public pizza(String name, int id, double price, int diameter)
	{
		super(name, id, price);
		System.out.println("Para pizza");
		this.diameter=diameter;
	}
	
	public void showinfo()
	{
		System.out.println("Item Name: "+name+"\nItem Id: "+id+"\nPrice: "+price+"\nDaimeter Size: "+diameter+"\n");
	}
}