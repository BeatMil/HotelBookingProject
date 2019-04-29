package hotelBooking_BeatVer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;





public class CSVreader 
{
	static String file_name = "C:\\Users\\anuto\\eclipse-workspace\\getStart\\src\\hotelBooking_BeatVer\\Book1.csv";
	static String booking_file ="C:\\Users\\anuto\\eclipse-workspace\\getStart\\booking.txt";
	static String boxString;
	static String header; //for display purpose e.g. Name, Country, Star, Swimming pool, Breakfast
	static String selectedHotel;
	static ArrayList<String> filteredHotel = new ArrayList<String>();

	

	

	public static void viewBooking() throws FileNotFoundException
	{
		Scanner console = new Scanner(new File(booking_file));
		console.useDelimiter("\n");
		while(console.hasNext())
		{
			System.out.println(console.next());
		}
	}
	
	public static void getHotelStarFilter(String star, String country) throws FileNotFoundException
	{
		Scanner scanner = new Scanner(new File(file_name));
		int count = 0;
		
        filteredHotel.clear();
		
		scanner.useDelimiter("\n"); //separate by space (enter)
        while(scanner.hasNext())    	
        {   
        	if (count==0)
    		{
    			header = scanner.next();//data for header name country star
    			count =2;
    		}
        	
        	
        	
    		boxString = scanner.next();
    		String[] boxArray = boxString.split(","); //split by comma into array
    		if (boxArray[2].equalsIgnoreCase(star) && boxArray[1].equalsIgnoreCase(country))
    		{
    			filteredHotel.add(boxString);  //add the hotel info if condition star meets
    		}
    	}
        
        System.out.println(header);
        //display array by looping
        for (int i = 0; i<filteredHotel.size(); i++)
        {
        	System.out.println(filteredHotel.get(i));
        }

        scanner.close();
	}
	
	public static void getHotelBreakfastFilter(String breakfast, String country) throws FileNotFoundException
	{
		Scanner scanner = new Scanner(new File(file_name));
		int count = 0;
		
        filteredHotel.clear();
		
		scanner.useDelimiter("\n"); //separate by space (enter)
        while(scanner.hasNext())    	
        {   
        	if (count==0)
    		{
    			header = scanner.next();
    			count =2;
    		}
    		boxString = scanner.next();
    		String[] boxArray = boxString.split(",");
    		if (boxArray[4].contains(breakfast) && boxArray[1].equalsIgnoreCase(country))
    		{
    			filteredHotel.add(boxString);
    			
    		}
    	}
        
        System.out.println(header);
        //display array by looping
        for (int i = 0; i<filteredHotel.size(); i++)
        {
        	System.out.println(filteredHotel.get(i));
        }

        scanner.close();
	}
	
	public static void getHotelPoolFiler(String pool, String country) throws FileNotFoundException
	{
		Scanner scanner = new Scanner(new File(file_name));
		int count = 0;
		
        filteredHotel.clear();
		
		scanner.useDelimiter("\n"); //separate by space (enter)
        while(scanner.hasNext())    	
        {   
        	if (count==0)
    		{
    			header = scanner.next();  // info for header e.g. Name Country 
    			count =2;
    		}
        	
        	
        	
        	
    		boxString = scanner.next();
    		String[] boxArray = boxString.split(",");
    		if (boxArray[3].contains(pool) && boxArray[1].equalsIgnoreCase(country))
    		{
    			filteredHotel.add(boxString);
    		}
    	}
        
        System.out.println(header);
        //display array by looping
        for (int i = 0; i<filteredHotel.size(); i++)
        {
        	System.out.println(filteredHotel.get(i));
        }

        scanner.close();
	}
	
	public static void getHotelStarAndBreakfastFilter (String star, String breakfast, String country) throws FileNotFoundException
	{
		Scanner scanner = new Scanner(new File(file_name));
		int count = 0;
		
        filteredHotel.clear();
		
		scanner.useDelimiter("\n"); //separate by space (enter)
        while(scanner.hasNext())    	
        {   
        	if (count==0)
    		{
    			header = scanner.next(); //get header the name country and stuff
    			count =2;
    		}
        	
        	
        	
    		boxString = scanner.next();
    		String[] boxArray = boxString.split(",");
    		if (boxArray[1].equalsIgnoreCase(country) && boxArray[2].equalsIgnoreCase(star) && boxArray[4].equalsIgnoreCase(breakfast) ) //condition of filter
    		{
    			filteredHotel.add(boxString);
    		}
    	}
        
        System.out.println(header); //display: Name, Country, Star, Swimming pool, Breakfast
        //display array by looping
        for (int i = 0; i<filteredHotel.size(); i++)
        {
        	System.out.println(filteredHotel.get(i));
        }

        scanner.close();
	}
	
	public static void getHotelCountryFilter(String country) throws FileNotFoundException
	{
		Scanner scanner = new Scanner(new File(file_name));
		int count = 0;
		
		
        filteredHotel.clear(); //clear the filter
		
		scanner.useDelimiter("\n"); //separate by space (enter)
        while(scanner.hasNext())    	
        {   
        	if (count==0)
    		{
    			header = scanner.next();//data for header name country star
    			count =2;
    		}
        	
        	
        	
    		boxString = scanner.next();
    		String[] boxArray = boxString.split(","); //split by comma into array
    		if (boxArray[1].equalsIgnoreCase(country))
    		{
    			filteredHotel.add(boxString);  //add the hotel info if condition star meets
    		}
    	}
        System.out.println("Listing all hotels in "+country.substring(0, 1).toUpperCase() + country.substring(1)+"\n");
        System.out.println(header);
        //display array by looping
        for (int i = 0; i<filteredHotel.size(); i++)
        {
        	System.out.println(filteredHotel.get(i));
        }

        scanner.close();
	}
	
	public static void getAllHotel(String country) throws FileNotFoundException
	{
		Scanner scanner = new Scanner(new File(file_name));
		int count = 0;
		
		
        filteredHotel.clear(); //clear the filter
		
		scanner.useDelimiter("\n"); //separate by space (enter)
        while(scanner.hasNext())    	
        {   
        	if (count==0)
    		{
    			header = scanner.next();//data for header name country star
    			count =2;
    		}
        	
        	
        	
    		boxString = scanner.next();
    		String[] boxArray = boxString.split(","); //split by comma into array
    		if (boxArray[1].equalsIgnoreCase(country))
    		{
    			filteredHotel.add(boxString);  //add the hotel info if condition star meets
    		}
    	}
        System.out.println("Listing all hotels in "+country.substring(0, 1).toUpperCase() + country.substring(1)+"\n");
        System.out.println(header);
        //display array by looping
        for (int i = 0; i<filteredHotel.size(); i++)
        {
        	System.out.println(filteredHotel.get(i));
        }

        scanner.close();
	}

	public static void getHotelAllFilter(String star,String pool , String breakfast, String country) throws FileNotFoundException
	{
		Scanner scanner = new Scanner(new File(file_name));
		int count = 0;
		
        filteredHotel.clear();
		
		scanner.useDelimiter("\n"); //separate by space (enter)
        while(scanner.hasNext())    	
        {   
        	if (count==0)
    		{
    			header = scanner.next();//data for header name country star
    			count =2;
    		}
        	
        	
        	
    		boxString = scanner.next();
    		String[] boxArray = boxString.split(","); //split by comma into array
    		if (boxArray[2].equalsIgnoreCase(star)&& boxArray[3].contains(pool) && boxArray[4].contains(breakfast) && boxArray[1].equalsIgnoreCase(country))
    		{
    			filteredHotel.add(boxString);  //add the hotel info if condition star meets
    		}
    	}
        
        System.out.println(header);
        //display array by looping
        for (int i = 0; i<filteredHotel.size(); i++)
        {
        	System.out.println(filteredHotel.get(i));
        }

        scanner.close();
	}
	
	
	
	
	
	
	
	
	
}

