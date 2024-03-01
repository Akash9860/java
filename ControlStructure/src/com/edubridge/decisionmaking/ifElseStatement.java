package com.edubridge.decisionmaking;
import java.util.Scanner;

public class ifElseStatement {
	public static void main (String [] args) {
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		int weight = s.nextInt();
		if ( age >= 18 && weight >= 45)
		{
			System.out.println("elible");
		}
		else
		{
		System.out.println("not eligible");
		}
		s.close();

}
}
