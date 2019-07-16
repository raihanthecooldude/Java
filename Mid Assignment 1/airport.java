public class airport
{
	private int id;
	private String name;
	private coordinate location;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setLocation(coordinate location)
	{
		this.location=location;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public coordinate getLocation()
	{
		return location;
	}
}