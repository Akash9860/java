package operator;

import java.util.Scanner;

public class ternaryoperator {
	public static void main (String[] args) {
   // to check the number even or odd
		Scanner s = new Scanner (System.in);
		int num = s.nextInt();
		String res=(num%2==0)?"Even": "odd";
		System.out.println(res); 
		  
}
}
