package TheDefault;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateValidation2 {

	public static void main(String[] args) throws ParseException 
	{
		String strDate = "01/05/2019";
		System.out.println("Check-out Date: ");
//		validateDateDiff(strDate);
		validateJavaDate();
		System.out.println("The end.");

	}
	
	public static String validateDateDiff(String day) throws ParseException
	{
		int key =1;
		Scanner console = new Scanner(System.in);
		String strDate = null;
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		format.setLenient(false);
		Date d1 = format.parse(day);
		Date d2;
		
		
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
		return strDate;
	}
	
	public static String validateJavaDate()
	{
		int key=1;
		String strDate = null;
		Date today = Calendar.getInstance().getTime();
		Scanner console = new Scanner(System.in);
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

}
