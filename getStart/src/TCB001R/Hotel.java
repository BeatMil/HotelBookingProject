package TCB001R;

public class Hotel
{
	private String name;
	private String star;
	
	Hotel()
	{
		this.setName("Default Hotel");
		this.setStar("4");
	}

	public String getStar() 
	{
		return star;
	}

	public void setStar(String star) 
	{
		this.star = star;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String toString()
	{
		return "Name: "+this.name+"\n"+
				"Star: "+this.star;
	}
}
