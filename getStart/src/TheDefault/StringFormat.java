package TheDefault;

public class StringFormat {

	public static void main(String[] args) 
	{
		//initializes variables
		String output = String.format("%s = %d", "joe", 35);
		
		int age = 20;
		int age2 = 17;
		String name = "Beat";
		String name2 = "Mate";
		String beat_info = String.format("%s: %d\n%s: %d", name, age, name2, age2);
		
		
		
		
		System.out.println(beat_info);
		System.out.printf("%s: %d\n",name,age);
		System.out.println(String.format("|%20d|", 93));
		System.out.println(String.format("*%-10d*",16));
		System.out.println(String.format("*%010d*",16));
		
		System.out.println(String.format("|%,d|", 6666666));
		
		System.out.println(String.format("|%10s|     q", "Hello"));
		System.out.println(String.format("|%10s|     q", "Hell"));
		System.out.println(String.format("|%10s|     q", "WOOOWEE"));
		System.out.println(String.format("|%10s|     q", "WOOOWEEEEEE"));
		System.out.format("|%10s|     q", "WOOOWEEEEEE");
	}

}
