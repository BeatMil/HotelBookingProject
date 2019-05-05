package poom;

import java.util.*;

import hotelBooking_BeatVer.Menu;

import java.io.*;

public class Room2 {
	public int ask = 0;
//	Menu menu = new Menu();
	String room;
	int type;

	public Room2(int numchoice) throws FileNotFoundException {// constructor and file
		
		// This is the question part that can be input into the menu to let the user
		// know what to input
//		System.out.println("Please select your room type.");
//		System.out.println("1. Single room \n2. Double room \n3.Twin bed room\n4. Triple room\n5.Quad room ");
//		System.out.println("Please input a number to choose the room type");
		this.type = numchoice;// the choice that will be put to the switch
	}
	
	
	public void roomtype() throws FileNotFoundException {//method
		PrintStream fileprint = new PrintStream(new File("booking.txt"));// printstream to print it into file
		try {
			do {
				switch (type) {// input into the switch
				case 1:
					System.out.println("Single room is selected");// print into the console that is selected
					method();// method look down
					fileprint.println("Roomtype: Single room");// print to the existing file called booking.txt
					break;// break
				case 2:
					System.out.println("Double room is selected");
					method();
					fileprint.println("Roomtype: Double room");
					break;
				case 3:
					System.out.println("Twin bed room is selected");
					method();
					fileprint.println("Roomtype: Twin bed room");
					break;
				case 4:
					System.out.println("Triple room is selected");
					method();
					fileprint.println("Roomtype: Triple room");
					break;
				case 5:
					System.out.println("Quad room is selected");
					method();
					fileprint.println("Roomtype: Quad room");
					break;
				default:
					ask = 1;
				}
			} while (ask != 1);// if not equal to 1 mean stop
		} catch (Exception e) {// if there error run this
			System.out.println("wrong please try again");// which some user who dont read instruction and input error
		}
	}

	public void method() {// method
		Scanner console = new Scanner(System.in);// console
		System.out.println("1. Confirm\n2. Retry");// ask user if he/she want to try again or confirm
		ask = console.nextInt();// user input
	}

}
