public class heavy_vehicle extends vehicle
{
	private double capacity;
	
	public heavy_vehicle()
	{
		super();
		System.out.println("Empty heavy_vehicle");
	}
	public heavy_vehicle(int now, double capacity)
	{
		super(now);
		System.out.println("Para heavy_vehicle");
		this.capacity=capacity;
	}
	
	public void setcap(double capacity)
	{
		this.capacity=capacity;
	}
	
	public double getcap()
	{
		return capacity;
	}
	
	public void show()
	{
		System.out.println("Wheels: "+now+"\nCapacity: "+capacity);
		
	}
}