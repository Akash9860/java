package com.capgemini.introductiontojava;
 import java.util.Scanner;
public class squarechecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Example test case
		System.out.println("enter the length. ");
		int length = scanner.nextInt();
		
		System.out.println("enter the breadth.");
		int breadth = scanner.nextInt();
		
		int sum = length * breadth;
		System.out.println("area of rectangle." + sum);
		 
		
	}
}