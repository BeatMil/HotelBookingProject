package TCB001R;

import hotelBooking_BeatVer.Room;

public class Main {

	public static void main(String[] args) 
	{
		
		
		String[] type = {"Green","Orange","Blue","Red"};
        
        
        int numRoom = (int) (Math.random() * 20 + 1);
        Room[] roomList = new Room[numRoom];
        
//        for (Room room : roomList)
//        {
//            room = new Room("Green");
//            System.out.println(room);
//        }
        
        for (int i = 0; i<numRoom; i++)
        {
        	roomList[i] = new Room(type[(int) (Math.random() * type.length)]);
        	System.out.println(roomList[i]);
        }
        System.out.println("__________________________");
        System.out.println(roomList[0]);


        
		
		
		
		
		
		
//		Hotel[] bigBox = new Hotel[10];
//		for (int i=0; i<bigBox.length; i++)
//		{
//			bigBox[i] = new Hotel(getRandomRoom());
//		}
//		
//		for (Hotel hotel : bigBox)
//		{
//			System.out.println(hotel);
//		}
		

		
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
		
		
		int numRoom = (int) (Math.random() * 20 + 1);
		Room[] roomList = new Room[numRoom];
		
		for (Room room : roomList)
		{
			room = new Room();
			room.setType(color[(int) (Math.random() * color.length - 1)]);
			
		}

		return roomList;
	}

}
