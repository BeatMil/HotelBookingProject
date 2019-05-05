package TheDefault;
import java.util.*;
public class Stringcount {
public static void main(String args[]) 
{
	Scanner console=new Scanner(System.in);
	String num;
	do {
	System.out.println("how many thing you know end with /MON/");
	System.out.println("Example:pokemon. Please dont use the example");
	int n=console.nextInt();
	console.nextLine();
	String array[]=new String[n];
	int wincount=0;
	for(int i=0;i<array.length;i++) {
	System.out.println("name the no:"+(i+1));
	String name=console.nextLine();
	if(name.endsWith("mon")) {
		System.out.println("correct");
		wincount++;
	}
	else {
		System.out.println("wrong");
	}
	if(name.equalsIgnoreCase("Pokemon")){
		System.out.println("damn it you use the example minus point");
		wincount--;
	}
	}System.out.println("your score is :"+wincount);
	System.out.println("play again type anything other than quit");
	num=console.nextLine();
	}while(!num.equalsIgnoreCase("quit"));	
}	
}
