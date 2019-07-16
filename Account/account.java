public class account
{
	private String name;
	private int number;
	private double balance;
	
	public void setname (String n)
	{
		name=n;
	}
	public void setnumber (int no)
	{
		number=no;
	}
	public void setbalance (double b)
	{
		balance=b;
	}
	
	public String getname()
	{
		return name;
	}
	public int getnumber()
	{
		return number;
	}
	public double getbalance()
	{
		return balance;
	}
	
	public static void main(String args[])
	{
		account yolo = new account();
		
		yolo.setname("Yolo");
		yolo.setnumber(100);
		yolo.setbalance(105.75);
		
		System.out.println("Name:" +yolo.getname());
		System.out.println("Number:" +yolo.getnumber());
		System.out.println("Balance:" +yolo.getbalance());
	}
}