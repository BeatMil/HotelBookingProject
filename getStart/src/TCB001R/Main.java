package TCB001R;

public class Main {

	public static void main(String[] args) 
	{
		Hotel[] bigBox = new Hotel[10];
		for (int i=0; i<bigBox.length; i++)
		{
			bigBox[i] = new Hotel();
		}
		
		System.out.println(bigBox[0]);
		System.out.println(bigBox[1]);
		bigBox[0].setName("SilverLand");
		bigBox[1].setName("Outer Wall of Serdin");
		System.out.println(bigBox[0]);
		System.out.println(bigBox[1]);
		
	}

}
