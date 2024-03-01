package com.mgm.looping;

import java.util.Scanner;

public class MenuDrivenApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("welcome to student dashboard");
		int ch = 0;
		System.out.println("1:student information");		
		System.out.println("2:student course rating");		
		System.out.println("3:student placement criteria");
		
		System.out.println("4:exit");
		System.out.println("enter choice");
		switch (ch) {
		case 1:
			System.out.println("enter your name:");
			String name=s.next();
			System.out.println("enter your age:");
			int age = s.nextInt();
			System.out.println("enter your address");
			String adress = s.next();
			System.out.println("Student name:"+name+\n"student age:"+age+\n );
			
		case 2 :
			System.out.println();
		}
		
		int rating = s.nextInt();
		if (rating >= 4) {
			
		
		System.out.println("good");
	}
		else	
		{
			System.out.println("need to improve");
			
		}
		s.close();
		
	}
		
	}


