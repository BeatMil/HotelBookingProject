package hotelBooking_BeatVer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Booking 
{
	//variables
	CSVreader filter = new CSVreader();
	Menu menu = new Menu();
	Hotel hotelInfo;
	
	//also variables
	String customer_name;
	String checkin_date;
	String checkout_date;
	int totalPrice;
	

	
	public void getCustomerInfo() throws ParseException
	{
		Scanner console = new Scanner(System.in);
		
		// get name checkindate checkoutdate from user
		System.out.println("Please fill in your information.\n"
						+  "Name: ");
		this.customer_name = console.nextLine();
		System.out.println("Check-in date: e.g. dd/mm/yyyy 20/05/2019");
		this.checkin_date = validateJavaDate();
		System.out.println("Check-out date: e.g. dd/mm/yyy 23/05/2019");
		this.checkout_date = validateDateDiff(this.checkin_date);
		
		//display customer name checkinoutdate
		System.out.println("Your hotel: " + this.hotelInfo.getName()+"\n"
						+  "Name: "+this.customer_name+"\n"
						+  "Check-in date: " + this.checkin_date+"\n"
						+  "Check-out date: "+this.checkout_date+"\n"
						+  "Total price   : "+this.totalPrice+" bath\n");
	}
	
	public void chooseHotel(ArrayList<Hotel> hotelList)
	{
		System.out.println("Please select hotels by numbers");

		for (int i = 0; i<hotelList.size(); i++) //looping array showing hotel list
        {
			
        	System.out.println(i+1 + ". "+hotelList.get(i));
        }
		
		
		
		this.hotelInfo = hotelList.get(inputCheckerForArray(hotelList.size()));
		System.out.println(this.hotelInfo.getName()+" has been chosen.");
	}
	
	public int inputCheckerForArray(int arraySize)

	{
		Scanner console = new Scanner(System.in);
		int userInput;
		
		do
		{
			userInput = console.nextInt();
			userInput -= 1;
			if (userInput >= arraySize)
			{
				System.out.println("There is no specified hotel.\n"
								+  "Please try again.");
			}
			
		}while (userInput >= arraySize);
		
		return userInput;
	}
	
	public void writeInfoTofile() throws IOException
	{
//		File file = new File("booking.txt"); 
		FileWriter fstream = new FileWriter("booking.txt",true);
        BufferedWriter out = new BufferedWriter(fstream); //buffer class name out
        out.append("name          : "+this.customer_name);
        out.newLine();
        out.append(hotelInfo.getName());// Writing all customer info
        out.newLine();
        out.append("country       : "+hotelInfo.getCountry());
        out.newLine();
        out.append("Hotel rating  : "+hotelInfo.getStar());
        out.newLine();       
        out.append("check-in date : "+this.checkin_date);
        out.newLine();
        out.append("check-out date: "+this.checkout_date);
        out.newLine();
        out.append("Total price   : "+this.totalPrice);
        out.newLine();
        out.close();
        System.out.println("Writting successful.");
	}

	public void getTotalPrice(long day)
	{
		this.totalPrice = (int) (day * Integer.parseInt(hotelInfo.getPrice()));
	}
	public String validateJavaDate()
	{
		int key=1;
		String strDate = null;
		Scanner console = new Scanner(System.in);
		Date today = Calendar.getInstance().getTime();
		SimpleDateFormat sdfrmt = new SimpleDateFormat("dd/MM/yyyy");
		sdfrmt.setLenient(false);
		while (key ==1)
		{
			strDate = console.nextLine();
			try 
			{
				Date javaDate = sdfrmt.parse(strDate);
				if (javaDate.getTime() < today.getTime())
				{
					System.out.println("Error: Booking to the past in invalid.\nPlease try again.");
				}
				else
				{
					key = 0;
				}
			} 
			catch (ParseException e) 
			{
	//			e.printStackTrace();
				System.out.println("!!!");
				System.out.println("Date format is not correct.\nPlease try again.");
			}
		}
		return strDate;
	}
	public String validateDateDiff(String day) throws ParseException
	{
		int key =1;
		Scanner console = new Scanner(System.in);
		String strDate = null;
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		format.setLenient(false);
		Date d1 = format.parse(day);
		Date d2 = null;
		
		
		while (key ==1) 
		{
			strDate = console.nextLine();
			try 
			{
				d2 = format.parse(strDate);
				if (d2.getTime() < d1.getTime())
				{
					System.out.println("Check-out Date cannot be sooner than Check-in Date.\nPlease try again.");
				}
				else
				{
					key =0;
				}
			} 
			catch (ParseException e)
			{
//				e.printStackTrace();
				System.out.println("!!!");
				System.out.println("Date format is not correct.\nPlease try again.");
			}
		}
		long diffDays = d2.getTime() - d1.getTime();
		getTotalPrice(diffDays / (24 * 60 * 60 * 1000));
		return strDate;
	}
	

}
