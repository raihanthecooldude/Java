public class flight
{
	private int id;
	private String name;
	private int capacity;
	private employee pilot;
	private airport from;
	private airport to;
	private schedule departure;
	private schedule arrival;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setCapacity(int capacity)
	{
		this.capacity=capacity;
	}
	public void setPilot(employee pilot)
	{
		this.pilot=pilot;
	}
	public void setFrom(airport from)
	{
		this.from=from;
	}
	public void setTo(airport to)
	{
		this.to=to;
	}
	public void setDeparture(schedule departure)
	{
		this.departure=departure;
	}
	public void setArrival(schedule arrival)
	{
		this.arrival=arrival;
	}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getCapacity()
	{
		return capacity;
	}
	public employee getPilot()
	{
		return pilot;
	}
	public airport getFrom()
	{
		return from;
	}
	public airport getTo()
	{
		return to;
	}
	public schedule getDeparture()
	{
		return departure;
	}
	public schedule getArrival()
	{
		return arrival;
	}
}