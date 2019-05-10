package hotelBooking_BeatVer;
import java.util.Scanner;
import java.util.*;


public class Room_service
{
	public static void main(String[] agrs) 
	{
		
	
		String[] star = {"5", "4", "3", "2", "1" };
		String[] service = { "Laundry Service", "Housekeeping", 
							"Airport Shuttle", "Spa", "Restaurant" };
		
		String [] service1 = {"Housekeeping"};
		String [] service2 = {"Housekeeping", "Airport Shuttle"};
		String [] service3 = {"Housekeeping", "Laundry Service", "Restaurant"};
		String [] service4 = {"Housekeeping", "Laundry Service", "Restaurant", "Airport Shuttle"};
		String [] service5 = {"Laundry Service", "Housekeeping", "Airport Shuttle", "Spa", "Restaurant"};
		
		
		Scanner input = new Scanner (System.in);
		System.out.println("Select Hotel Star: ");
	
		String userinput = input.next();
		System.out.println("The services are: ");
		switch(userinput) 
		{
			case "1":
				for(String s:service1) 
				{
					System.out.println(s);
				}break;
			case "2":
				for(String s:service2) 
				{
					System.out.println(s);
				}break;
			case "3":
				for(String s:service3) 
				{
					System.out.println(s);
				}break;
			case "4":
				for(String s:service3) 
				{
					System.out.println(s);
				}break;
			case "5":
				for(String s:service4) 
				{
					System.out.println(s);
				}break;
			default:
				System.out.println("Sorry there is no service available for this");
		}
		
			
	}

		
}
	
