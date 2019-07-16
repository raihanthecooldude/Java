public class light_vehicle extends vehicle
{
	private int pass;
	
	public light_vehicle()
	{
		super();
		System.out.println("Empty light_vehicle");
	}
	public light_vehicle(int now, int pass)
	{
		super(now);
		System.out.println("Para light_vehicle");
		this.pass=pass;
	}
	
	public void setpass(int pass)
	{
		this.pass=pass;
	}
	
	public int getpass()
	{
		return pass;
	}
	
	public void show()
	{
		System.out.println("Wheels: "+now+"\nPassenger: "+pass);
		
	}
}