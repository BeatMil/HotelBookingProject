package hotelBooking_BeatVer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;



public class Menu {
	static String[] condition_yn = {"yes","no"};
	static String[] condition_num = {"1","2","3","4","5"};
	static String[] condition_num_menu = {"1","2","3"};
	static String[] condition_num_menu2 = {"1","2","3","4","5","6"};
	static String[] condition_country = {"japan","korea","china","singapore"};
	static String[] condition_num4 = {"1","2","3","4"};
	static String fileName = "C:\\Users\\anuto\\eclipse-workspace\\getStart\\src\\hotelBooking_BeatVer\\Book1.csv";
	


	public static void main(String[] args) throws IOException, ParseException 
	{
		//initialize
//		Scanner console = new Scanner(System.in); 
		Residence[] hotelList = loadHotelObject();
		String user_input_string;
		String country;
		Booking booking = new Booking();
		ArrayList<Hotel> selectedHotel = new ArrayList<Hotel>();
		
		
		
		
		
		do //looping menu options
		{
			//menu message 
			System.out.println("Welcome to hotel booking system.");
			System.out.println("1) Book a hotel\n2) View your booking\n3) Exit");
			user_input_string = inputChecker(condition_num_menu);
			
			if (user_input_string.contentEquals("1"))
			{
				country = countrySelecter(condition_country);
//				CSVreader.getHotelCountryFilter(country);
				for (Residence hotel : hotelList)
				{
					if (hotel.country.equalsIgnoreCase(country))
					{
						selectedHotel.add((Hotel) hotel);
						System.out.println(hotel);
					}
				}
				do
				{
					System.out.println("1. Go back to menu\n"
									+  "2. Filter with star\n"
									+  "3. Filter with free breakfast\n"
									+  "4. Filter with swimming pool\n"
									+  "5. Filter with all\n"
									+  "6. Choose a hotel");
					user_input_string = inputChecker(condition_num_menu2);
					
					switch (user_input_string) {
					  case "1":
						  	System.out.println("Go back to menu...");
						  	break;
					  case "2":
							System.out.println("Please specify hotel rating e.g. 1-5:");
//							CSVreader.getHotelStarFilter(inputChecker(condition_num),country);
							String star = inputChecker(condition_num);
							selectedHotel.clear();
							for (Residence hotel : hotelList)
							{
								if (hotel.country.equalsIgnoreCase(country) && hotel.star.equalsIgnoreCase(star))
								{
								 	System.out.println(hotel);
									selectedHotel.add((Hotel) hotel);
								}
							}
							break;
							
					  case "3":
							System.out.println("Please specify free breakfast e.g. yes,no");
//							CSVreader.getHotelBreakfastFilter(inputChecker(condition_yn), country);
							String breakfast = inputChecker(condition_yn);
							selectedHotel.clear();
							for (Residence hotel : hotelList)
							{
								if (hotel.country.equalsIgnoreCase(country) && hotel.breakfast.equalsIgnoreCase(breakfast))
								{
									System.out.println(hotel);
									selectedHotel.add((Hotel) hotel);
								}
							}
						  	break;
					  case "4":
							System.out.println("Please specify swimming pool e.g. yes, no");
//							CSVreader.getHotelPoolFiler(inputChecker(condition_yn), country);
							String pool = inputChecker(condition_yn);
							selectedHotel.clear();
							for (Residence hotel : hotelList)
							{
								if (hotel.country.equalsIgnoreCase(country) && hotel.breakfast.equalsIgnoreCase(pool))
								{
									System.out.println(hotel);
									selectedHotel.add((Hotel) hotel);
								}
							}
						  	break;
					
					  case "5":
						  	System.out.println("Please specify hotel rating, swimming pool and free breakfast e.g. 5 *enter* yes *enter* no *enter*");
//						  	CSVreader.getHotelAllFilter(inputChecker(condition_num), inputChecker(condition_yn), inputChecker(condition_yn), country);
							star = inputChecker(condition_num);
							pool = inputChecker(condition_yn);
							breakfast = inputChecker(condition_yn);
						  	selectedHotel.clear();
							for (Residence hotel : hotelList)
							{
								if (hotel.country.equalsIgnoreCase(country) && hotel.star.equalsIgnoreCase(star) && hotel.pool.equalsIgnoreCase(pool) && hotel.breakfast.equalsIgnoreCase(breakfast))
								{
									System.out.println(hotel);
									selectedHotel.add((Hotel) hotel);
								}
							}
						  	break;
						  	
					  case "6":
						  	booking.chooseHotel(selectedHotel);
						  	booking.getCustomerInfo();
						  	booking.writeInfoTofile();
						  	break;
					}
				}while (!user_input_string.equalsIgnoreCase("1") && !user_input_string.equalsIgnoreCase("6"));
				
	
//				Booking hotel = new Booking(null, null, null);
			}
			else if (user_input_string.contentEquals("2"))
			{
				CSVreader.viewBooking();
			}
			
		} while (!user_input_string.contentEquals("3"));
		
		System.out.println("Thank you for using our hotel booking system.");
	}

	
	
	
	//method of validating user input
	public static String inputChecker(String[] condition)
	{
		String user_input = null;
		boolean key = true;
		while (key==true)
		{
			Scanner console = new Scanner(System.in); 
			String box = console.nextLine(); 
			for (int i = 0; i<condition.length; i++)
			{
				if (box.equalsIgnoreCase(condition[i]))
				{
					user_input = box;
					key=false;
					break;
				}			
				else if (i == condition.length-1 && !box.equals(condition[i]))
				{
					System.out.println("Please try again");
				}
						
			}
		
		}
		return user_input;
	}
	
	
	

	public static String countrySelecter(String[] country)
	{
		//initialize
//		Scanner console = new Scanner(System.in);
		int userInputInt;

		
		
		System.out.println("Listing country...");
		for (int i = 0; i<country.length; i++)
		{
			System.out.println(i+1+". " + country[i].substring(0, 1).toUpperCase() + country[i].substring(1)); //capitalize first letter with numbers
		}
		
		
		
		System.out.println("Please select a country by numbers e.g. 1 or 2");
		userInputInt = Integer.parseInt((inputChecker(condition_num4)));
		System.out.println(country[userInputInt-1].substring(0, 1).toUpperCase() + country[userInputInt-1].substring(1)+" has been selected.\n");

		return country[userInputInt-1];
	}

	
	//hopefully delete later
	static Residence[] loadHotelObject () throws FileNotFoundException
	{
//		String file_name = "C:\\Users\\anuto\\eclipse-workspace\\getStart\\src\\hotelBooking_BeatVer\\Book1.csv";
		String hotelInfo;
		Residence[] hotelList = new Residence[getAmountOfHotel()];
		Scanner scanner = new Scanner(new File(fileName));
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
//		String file_name = "C:\\Users\\anuto\\eclipse-workspace\\getStart\\src\\hotelBooking_BeatVer\\Book1.csv";
		int i = 0;
		Scanner scanner = new Scanner(new File(fileName));
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
