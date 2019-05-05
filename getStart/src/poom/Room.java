package poom;


import java.util.*;

import hotelBooking_BeatVer.Menu;

import java.io.*;
public class Room {
	public int ask=0;	
	Menu menu=new Menu();	
	String [] condition= {"1","2","3","4","5"};
	String room;
	
	
	public void roomtype()throws FileNotFoundException{
		Scanner console=new Scanner(System.in);
		System.out.println("Please select your room type.");
		System.out.println("1. Single room \n2. Double room \n3.Twin bed room\n4. Triple room\n5.Quad room ");
		System.out.println("Please input a number to choose the room type");
		String type=menu.inputChecker(condition);
		do {
		switch(type) {
		case "1":System.out.println("Single room is selected");
			method();
		 String Room="Single room";
		 room=Room;
		    break;
		case "2":System.out.println("Double room is selected");
		    method();
		    Room="Double room";
		    room=Room;
			break;
		case "3":System.out.println("Twin bed room is selected");
			method();
			Room="Twin bedroom";
			 room=Room;
		break;
		case "4":System.out.println("Triple room is selected");
		    method();
		    Room="Triple room";
		    room=Room;
			break;
		case "5":System.out.println("Quad room is selected");
		    method();
		    Room="Quad room";
		    room=Room;
			break;
			default:System.out.println("Please type in something and try again");
		}
	}while(ask!=1);	
	}	
	
	public void method() {
		Scanner console=new Scanner(System.in);
		System.out.println("1. Confirm\n2. Retry");
	    ask=console.nextInt();
	}
	
}

