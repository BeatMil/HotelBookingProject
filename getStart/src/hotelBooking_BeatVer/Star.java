package hotelBooking_BeatVer;

import java.util.Scanner;

public abstract class Star {
	public int Starnum;
	public String Facility;
	
	public static void main(String[] agrs) {
		
		
//		String [] Starnum = {" 5 ", " 4 ", " 3 ", " 2 ", " 1 " };
		String[] Facility = { " Laundry Service ", " Housekeeping "," Airport Shuttle ", " Spa ", "Restaurant" };
		
		String [] Facility1 = {"Housekeeping"};
		String [] Facility2 = {"Housekeeping", "Airport Shuttle"};
		String [] Facility3 = {"Housekeeping", "Laundry Service", "Restaurant"};
		String [] Facility4 = {"Housekeeping", "Laundry Service", "Restaurant", "Airport Shuttle"};
		String [] Facility5 = {"Laundry Service", "Housekeeping", "Airport Shuttle", "Spa", "Restaurant"};
		
		
		Scanner input = new Scanner (System.in);
		System.out.println("Select Hotel Star: ");
		String userinput = input.next();
		System.out.println("The facilities are: ");
		switch(userinput) {
			case "1":
				for(String facility:Facility1) 
				{
					System.out.println(facility);
				}
				break;
					
			case "2":
				for(String facility:Facility2)
				{
					System.out.println(facility);
				}
				break;
				
			case "3":
				for(String facility:Facility3)
				{
					System.out.println(facility);
				}
				break;
				
			case "4":
				for(String facility:Facility3)
				{
					System.out.println(facility);
				}
				break;
				
			case "5":
				for(String facility:Facility4)
				{
					System.out.println(facility);
				}
				break;
			default:
				System.out.println("Sorry there is no service available for this");
		}			
	}
		abstract public String Service();
		
		
		
}

