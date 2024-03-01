package com.edubridge.decisionmaking;

import java.util.Scanner;

public class Employee {
	public static void main (String [] args) {
		System.out.println("welcome to employee management system");
		
		int choice = 0;
		
		do {
			System.out.println("1.employee has to enter name");
			System.out.println("2.employee has to enter designation");
			System.out.println("3.employee has to enter specialization");
			System.out.println("4.exit");
			Scanner s = new Scanner(System.in);
			choice = s.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter name:");
				String name=s.next();
				System.out.println("employee name:"+name);
				break;
			case 2:
				System.out.println("enter designation:");
				String designation=s.next();
				System.out.println("employee designation:"+designation);
				break;
			case 3:
				System.out.println("enter specialization:");
				String specialization=s.next();
				System.out.println("employee specialization:"+specialization);
				break;
			case 4:
				System.out.println("exit");
			default:
				System.out.println("wrong input");
				break;
			}
		
	
	} while (choice!=4);
		
	}
}

