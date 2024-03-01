package com.edubridge.decisionmaking;

import java.util.Scanner;

public class arithmetic {

	public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
	System.out.println("enter value of i:");
	int i = s.nextInt();
	System.out.println("enter value of j:");
	int j = s.nextInt();
	int choice = s.nextInt();
	switch(choice) {
	case 1:
		System.out.println(i+j);
		break;
	case 2:
		System.out.println(i-j);
		break;
	case 3:
		System.out.println(i*j);
		break;
	case 4:
		System.out.println(i/j);
		break;
		default :
			System.out.println("wrong choice");
	}
		
	}
}