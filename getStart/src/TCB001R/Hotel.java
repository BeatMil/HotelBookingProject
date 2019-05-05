package TCB001R;

public class Hotel
{
	private String name;
	private String star;
	private Room[] roomList;
	Hotel(Room[] roomList)
	{
		this.setName("Default Hotel");
		this.setStar("4");
		this.roomList = roomList;
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
				"Star: "+this.star+"\n"+
				"Room: "+this.roomList.length;
	}

	public Room[] getRoomList() {
		return roomList;
	}

	public void setRoomList(Room[] roomList) {
		this.roomList = roomList;
	}
}
