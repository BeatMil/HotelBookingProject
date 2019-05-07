package hotelBooking_BeatVer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TCB001 {
	//ignore this class
	//deleteable
	

	public static void main(String[] args) throws FileNotFoundException 
	{
		Residence[] hotelList = loadHotelObject();
		
		for (Residence hotel : hotelList)
		{
			
			if (hotel.country.equalsIgnoreCase("japan"))
			{
//				System.out.println(hotel);
			}
		}

		
		System.out.println(hotelList[29]);
		
		
		
		

	}
	
	static Residence[] loadHotelObject () throws FileNotFoundException
	{
		String file_name = "C:\\Users\\anuto\\eclipse-workspace\\getStart\\src\\hotelBooking_BeatVer\\Book1.csv";
		String hotelInfo;
		Residence[] hotelList = new Residence[getAmountOfHotel()];
		Scanner scanner = new Scanner(new File(file_name));
		int count = 0;
		
		scanner.useDelimiter("\n"); //separate by line (enter)
        while(scanner.hasNext())    	
        {   
        	hotelInfo = scanner.next();
    		String[] hotelListButArray = hotelInfo.split(","); //split by comma into array
    		hotelList[count] = new Hotel(hotelListButArray[0],hotelListButArray[1],hotelListButArray[2],hotelListButArray[3],hotelListButArray[4],hotelListButArray[5]);  
    		count++;
    	}
        scanner.close();
		return hotelList;
	}
	
	static int getAmountOfHotel() throws FileNotFoundException
	{
		String file_name = "C:\\Users\\anuto\\eclipse-workspace\\getStart\\src\\hotelBooking_BeatVer\\Book1.csv";
		int i = 0;
		Scanner scanner = new Scanner(new File(file_name));
		scanner.useDelimiter("\n"); //separate by space (enter)
		
        while(scanner.hasNext())    	
        {   
        	scanner.next();
        	i++;
        }
        scanner.close();
        
        return i;
	}

}
