package TheDefault;
import java.util.*;
public class playground { 
	public static void main(String args[]) 
	{
			
		
		int array[]= {50,10,30,20,100,5};
		int min = array[0];
		int max = array[0];
		
		
		for(int i=0; i<array.length; i++)
		{
			if(array[i]<min)
			{
				min = array[i];
			}
			else if (array[i]>max)
			{
				max=array[i];
			}
			
	}
		System.out.println("max:"+max);
		System.out.println("min:"+min);
		
		
		
		
		
		
		
	}
}
	
