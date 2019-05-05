package poom;


import java.io.*;

import java.util.*;
public class Help {
	public int choose;
	int exit;
	
	public  void Helpp() {
		do {
			System.out.println("1.Instruction with form\n2.Other\n3.Contact Us");
			Scanner console = new Scanner(System.in);
			int num = console.nextInt();
			switch (num) {
			case 1:
				System.out.println("Need example for filling information form.");
				System.out.println("Name: Joseph");
				System.out.println("Check-in date: 17/04/19");
				System.out.println("Check-out date: 20/04/19");
				ask();
				break;
			case 2:
				System.out.println("1:Rate our service\n2.Complaint");
				System.out.println("Please type in your option");
				int other_input = console.nextInt();
				switch (other_input) {
				case 1:
					System.out.println("please rate 1 to 5");
					int rate = console.nextInt();
					break;
				case 2:
					System.out.println("please write your complain");
					String complain = console.nextLine();
					ask();
				}
			case 3:
				System.out.println("Contact us");
				System.out.println("Email: psa_Hotel@hotmail.com\nPhone number:0927482658\n");
				ask();
				break;
			case 4:
				System.out.println("exit");
				ask();
			default:
				System.out.println(" ");
				ask();
			}

			
			
		} while (exit != 1);
	}

	public String toString() {
		return "-----------------------";
	}

	public void ask() {
		System.out.println("1. Exit.\n2. Return to help option.");
		Scanner console = new Scanner(System.in);
		exit = console.nextInt();
	}
}
