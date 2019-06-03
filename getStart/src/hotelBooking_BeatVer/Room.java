package hotelBooking_BeatVer;

//I did all the code. Certain guy tries hard to help me but fail. Well, at least he manage to created this Room class
//Coding in real fun so I don't really mad at him.
public class Room 
{	
	String type;
	
	public Room() 
	{
		type = "Default Room";
	}
	
	public Room(String roomType)
	{
		this.type = roomType;
	}
	
	public String getType() 
	{
		return type;
	}
	
	public void setType(String type) 
	{
		this.type = type;
	}
	
	public String toString() 
	{
		return "Room Type: "+type;
	}

}
