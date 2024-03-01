package com.mgm.looping;

import java.util.Scanner;

public class LeftTrianglePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of rows for the right triangle: ");
	        int numRows = scanner.nextInt();

	        // Print right-angled triangle pattern
	        for (int i = 1; i <= numRows; i++) {
	            // Print spaces
	            for (int j = 1; j <= numRows - i; j++) {
	                System.out.print(" ");
	            }

	            // Print stars
	            for (int k = 1; k <= i; k++) {
	                System.out.print("*");
	            }

	            // Move to the next line
	            System.out.println();
	        }

	        scanner.close();
	    }
	}