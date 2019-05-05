package TheDefault;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) throws ParseException 
	{
		String dateStart = "29/04/2019";
		String dateStop =  "02/05/2019";
		
		SimpleDateFormat format = new SimpleDateFormat ("dd/MM/yyyy");
		
		Date d1 = format.parse(dateStart);
		Date d2 = format.parse(dateStop);
		
		
		
		long diff = d2.getTime() - d1.getTime();
		
		
		
		long diffDays = diff;
		
		System.out.println(diffDays/(24 * 60 * 60 * 1000));
		
		

	}

}
