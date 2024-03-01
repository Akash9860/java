package com.edubridge.decisionmaking;

import java.util.Scanner;

public class bankingApplication {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("enter choice");
		int choice = s.nextInt();
		switch (choice) {
		case 1:
			System.out.println("deposit");
			break;
		case 2:
			System.out.println("withdrawl");
			break;
		case 3:
			System.out.println("check deposit");
			break;
		case 4:
			System.out.println("atm withdrawal");
			break;
			
			default :
				System.out.println("option not available");
	}

}
}
