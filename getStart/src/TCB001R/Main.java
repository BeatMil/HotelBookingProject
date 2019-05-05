package TCB001R;

public class Main {

	public static void main(String[] args) 
	{
		Hotel[] bigBox = new Hotel[10];
		for (int i=0; i<bigBox.length; i++)
		{
			bigBox[i] = new Hotel(getRandomRoom());
		}
		
		for (Hotel hotel : bigBox)
		{
			System.out.println(hotel);
		}
		

		
//		Room[] roomList = new Room[2];
//		Room room1 = new Room();
//		Room room2 = new Room("Blue","3");
//		roomList[0] = room1;
//		roomList[1] = room2;
//		Hotel japHotel = new Hotel(roomList);
//		System.out.println(japHotel.getRoomList()[1]);
//		japHotel.getRoomList()[1].setColor("Green");
//		System.out.println(japHotel.getRoomList()[1]);
		

		
	}
	
	
	
	
	
	static Room[] getRandomRoom()
	{
		String[] color = {"Green","Orange","Blue","Red"};
		String[] size = {"1","2","3","4","5","6"};
		
		
		int numRoom = (int) (Math.random() * 20 + 1);
		Room[] roomList = new Room[numRoom];
		
		for (Room room : roomList)
		{
			room = new Room();
			room.setColor(color[(int) (Math.random() * color.length - 1)]);
			room.setSize(size[(int) (Math.random() * size.length - 1)]);
		}

		return roomList;
	}

}
