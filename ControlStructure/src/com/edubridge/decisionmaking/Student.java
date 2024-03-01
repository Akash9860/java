package com.edubridge.decisionmaking;
 import java.util.Scanner;
public class Student {
	public static void main (String [] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("enter student id");
		int Studentid = s.nextInt();
		System.out.println("enter student name");
		
		String Name = s.next();
		System.out.println("enter marks for m1");
		int m1 = s.nextInt();
		
		int m2= s.nextInt()	;
		System.out.println("enter marks for m2");
		int m3 = s.nextInt();
		System.out.println("enter maks for m3 ");
		int marks = m1+m2+m3;
		int avg = marks/3;
		System.out.println("Student id:"+"\nStudentName");
		if(avg>=90) {
		System.out.println("a grade");
		}
		else if(avg>=75 && avg<90) {
		System.out.println("b grade");
		}
	
		else if(avg>=90 && avg<75) {
			System.out.println("c grade");
	}
	
		else if(avg>=90) {
			System.out.println("d grade");
	}
	else
			System.out.println("fail ");
	
			
			
	}

}
