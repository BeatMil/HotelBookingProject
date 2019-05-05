package TCB001R;

public class Room 
{
	private String color;
	private String size;
	
	
	Room() //default constructor
	{
		this.color = "Green";
		this.setSize("1");
	}
	
	Room(String c, String s)
	{
		this.color = c;
		this.setSize(s);
	}
	
	String getColor()
	{
		return this.color;
	}

	public String getSize() 
	{
		return size;
	}

	public void setSize(String size) 
	{
		this.size = size;
	}
	
	
	
	
	
}
