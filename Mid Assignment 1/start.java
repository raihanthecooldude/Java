public class start
{
	public static void main(String args[])
	{
		coordinate coor1 = new coordinate();
		coordinate coor2 = new coordinate();
		
		coor1.setLatitude(2);
		coor1.setLongitude(5);
		
		coor2.setLatitude(10);
		coor2.setLongitude(15);
		
		schedule sche1 = new schedule();
		schedule sche2 = new schedule();
		
		sche1.setHour(2);
		sche1.setMinute(5);
		
		sche2.setHour(7);
		sche2.setMinute(9);
		
		employee emp1 = new employee();
		employee emp2 = new employee();
		
		emp1.setId(1001);
		emp1.setName("Jordan");
		emp1.setDesignation("Junior Pilot");
		
		emp2.setId(1007);
		emp2.setName("Logan");
		emp2.setDesignation("Chief Pilot");
		
		airport port1 = new airport();
		airport port2 = new airport();
		
		port1.setId(49);
		port1.setName("Port Xavior");
		port1.setLocation(coor1);
		
		port2.setId(52);
		port2.setName("Port Black Pearl");
		port2.setLocation(coor2);
		
		flight f1 = new flight();
		flight f2 = new flight();
		
		f1.setId(17);
		f1.setName("Castamere Flight");
		f1.setCapacity(500);
		f1.setPilot(emp2);
		f1.setFrom(port1);
		f1.setTo(port2);
		f1.setDeparture(sche1);
		f1.setArrival(sche2);
		
		f2.setId(19);
		f2.setName("Winterfell Flight");
		f2.setCapacity(300);
		f2.setPilot(emp1);
		f2.setFrom(port2);
		f2.setTo(port1);
		f2.setDeparture(sche2);
		f2.setArrival(sche1);
		
		System.out.println("\nDetails of 1st Flight of the Day:\n\nFlight ID: "+f1.getId()+"\nFlight Name: "+f1.getName()+"\nPassenger Capacity: "+f1.getCapacity()+"\n\nPilot ID No: "+f1.getPilot().getId()+"\nPilot Name: "+f1.getPilot().getName()+"\nPilot Designation: "+f1.getPilot().getDesignation()+"\n\nDeparture Port Id: "+f1.getFrom().getId()+"\nDeparture Port Name: "+f1.getFrom().getName()+"\nDeparture Port Location: "+f1.getFrom().getLocation().getLatitude()+" - "+f1.getFrom().getLocation().getLongitude()+"\n\nArrival Port Id: "+f1.getTo().getId()+"\nArrival Port Name: "+f1.getTo().getName()+"\nArrival Port Location: "+f1.getTo().getLocation().getLatitude()+" - "+f1.getTo().getLocation().getLongitude()+"\n\nDeparture Time: "+f1.getDeparture().getHour()+" - "+f1.getDeparture().getMinute()+"\nArrival Time: "+f1.getArrival().getHour()+" - "+f1.getArrival().getMinute()+"\n");
		System.out.println("\n\nnDetails of 2nd Flight of the Day:\n\nFlight ID: "+f2.getId()+"\nFlight Name: "+f2.getName()+"\nPassenger Capacity: "+f2.getCapacity()+"\n\nPilot ID No: "+f2.getPilot().getId()+"\nPilot Name: "+f2.getPilot().getName()+"\nPilot Designation: "+f2.getPilot().getDesignation()+"\n\nDeparture Port Id: "+f2.getFrom().getId()+"\nDeparture Port Name: "+f2.getFrom().getName()+"\nDeparture Port Location: "+f2.getFrom().getLocation().getLatitude()+" - "+f2.getFrom().getLocation().getLongitude()+"\n\nArrival Port Id: "+f2.getTo().getId()+"\nArrival Port Name: "+f2.getTo().getName()+"\nArrival Port Location: "+f2.getTo().getLocation().getLatitude()+" - "+f2.getTo().getLocation().getLongitude()+"\n\nDeparture Time: "+f2.getDeparture().getHour()+" - "+f2.getDeparture().getMinute()+"\nArrival Time: "+f2.getArrival().getHour()+" - "+f2.getArrival().getMinute()+"\n");
	}
}