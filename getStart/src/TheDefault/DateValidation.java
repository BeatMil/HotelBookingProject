package TheDefault;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
public class DateValidation{
   public static String validateJavaDate()
   {
	   Scanner console = new Scanner(System.in);
	   String strDate = console.nextLine();
	/* Check if date is 'null' */
	if (strDate.trim().equals(""))
	{
	    
	}
	/* Date is not 'null' */
	else
	{
	    /*
	     * Set preferred date format,
	     * For example MM-dd-yyyy, MM.dd.yyyy,dd.MM.yyyy etc.*/
	    SimpleDateFormat sdfrmt = new SimpleDateFormat("dd/MM/yyyy");
	    sdfrmt.setLenient(false);
	    /* Create Date object
	     * parse the string into date 
             */
	    try
	    {
	        Date javaDate = sdfrmt.parse(strDate); 
	        System.out.println(strDate+" is valid date format");
	    }
	    /* Date format is invalid */
	    catch (ParseException e)
	    {
	        System.out.println(strDate+" is Invalid Date format");
	        return strDate;
	    }
	    /* Return true if date format is valid */
	    return strDate;
	}
	return strDate;
   }
   public static void main(String args[]){
	validateJavaDate();

	
   }
}