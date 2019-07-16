public class vehicle
{
	protected int now; //now = number of vehicles
	
	public vehicle()
	{
		System.out.println("Empty vehicle");
	}
	public vehicle(int now)
	{
		System.out.println("Para vehicle");
		this.now=now;
	}
	
	public void setnow(int now)
	{
		this.now=now;
	}
	
	public int getnow()
	{
		return now;
	}
	
	public void show()
	{
		System.out.println("Show Vehicle\n"+now);
		
	}
}