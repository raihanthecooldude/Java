package Package;

import Package.PackA.*;
import Package.PackB.*;
import Package.PackC.*;
class Start
{
	public static void main(String []args)
	{
		ClassA1 a1 = new ClassA1();
		a1.setX(10);
		System.out.println(a1.getX());
		
		ClassA2 a2 = new ClassA2();
		a2.setY(20);
		System.out.println(a2.getY());
		
		ClassB1 b1 = new ClassB1();
		b1.setX(30);
		System.out.println(b1.getX());
		
		ClassB2 b2 = new ClassB2();
		b2.setY(40);
		System.out.println(b2.getY());
		
		ClassC1 c1 = new ClassC1();
		c1.setX(50);
		System.out.println(c1.getX());
		
		ClassC2 c2 = new ClassC2();
		c2.setY(60);
		System.out.println(c2.getY());
	}
}