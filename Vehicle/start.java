public class start
{
	public static void main(String args[])
	{
		heavy_vehicle h1 = new heavy_vehicle();
		h1.setnow(6);
		h1.setcap(3.5);
		System.out.println("Wheel: "+h1.getnow()+" Pass: "+h1.getcap());
		
		heavy_vehicle h2 = new heavy_vehicle(4, 2);
		h2.show();
		
		light_vehicle l1 = new light_vehicle();
		l1.setnow(2);
		l1.setpass(2);
		System.out.println("Wheel: "+l1.getnow()+" Pass: "+l1.getpass());
		
		light_vehicle l2 = new light_vehicle(4, 3);
		l2.show();
	}
}