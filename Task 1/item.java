public abstract class item
{
	protected String name;
	protected int id;
	protected double price;
	
	public item()
	{
		System.out.println("Empty Item");
	}
	public item(String name, int id, double price)
	{
		System.out.println("Para Item");
		this.name=name;
		this.id=id;
		this.price=price;
	}
	
	public abstract void showinfo();
}