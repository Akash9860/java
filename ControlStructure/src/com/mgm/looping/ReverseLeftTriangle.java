package com.mgm.looping;

public class ReverseLeftTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row = 7;
		for (int i = row; i>=1;i--)
		{
			for (int j = row;j>=i;j--) {
				System.out.println("");
			}
			for (int k=1; k<=i;k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
