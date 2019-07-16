public class box
{
	private int height;
	private int length;
	private int width;
	
	public box()
	{
		System.out.println("Empty");
	}
	public box(int h, int l, int w)
	{
		System.out.println("Parameterized");
		height=h;
		length=l;
		width=w;
	}
	
	public void setheight(int h)
	{
		height=h;
	}
	public void setlength(int l)
	{
		length=l;
	}
	public void setwidth(int w)
	{
		width=w;
	}
	
	public int getheight()
	{
		return height;
	}
	public int getlength()
	{
		return length;
	}
	public int getwidth()
	{
		return width;
	}
	
	public void show()
	{
		System.out.println("Height: "+height+"\nLength: "+length+"\nWidth: "+width);
	}
	
	public static void main(String args[])
	{
		box yolo = new box();
		
		yolo.setheight(2);
		yolo.setlength(5);
		yolo.setwidth(7);
		
		System.out.println("Height Yolo 1: "+yolo.getheight()+"\nLength Yolo 1: "+yolo.getlength()+"\nWidth Yolo 1: "+yolo.getwidth());
		
		box yo = new box(9, 1, 2);
		yo.show();
	}
}