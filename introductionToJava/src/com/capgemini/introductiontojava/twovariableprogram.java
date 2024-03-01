package com.capgemini.introductiontojava;

import java.util.Scanner;

public class twovariableprogram {
	 public static void main(String[] args) {
	        // Create a Scanner object to take input from the user
	      Scanner scanner = new Scanner(System.in);
	        
	       System.out.print("Enter the first variable: ");
	        int variable1 = scanner.nextInt();

	        System.out.print("Enter the second variable: ");
	        int variable2 = scanner.nextInt();

	        // Add the two variables
	     int sum = variable1 + variable2;
	        // Display the result
	        System.out.println("The sum of the two variables is: " + sum);

	        // Close the scanner to prevent resource leak
	        scanner.close();
	    }
}
