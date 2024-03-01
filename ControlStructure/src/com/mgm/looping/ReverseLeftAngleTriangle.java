package com.mgm.looping;

import java.util.Scanner;

public class ReverseLeftAngleTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the reversed left triangle: ");
        int numRows = scanner.nextInt();

        // Print reversed left-angled triangle pattern
        for (int i = numRows; i >= 1; i--) {
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("");
            }

            // Move to the next line
            System.out.println();
        }

        scanner.close();
    }
}

