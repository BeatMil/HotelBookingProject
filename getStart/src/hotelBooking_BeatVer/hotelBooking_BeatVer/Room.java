package hotelBooking_BeatVer;


public class Room {
	
	String name;
	
	

	public Room() 
	{
		name = "Default Room";
	}
	public Room(String roomname)
	{
		this.name = roomname;
	}
	
	public String getName()
	{
		return this.name;
	}
	public void setName(String room)
	{
		this.name = room;
	}




	public String toString() 
	{
		return name;
	}

}
