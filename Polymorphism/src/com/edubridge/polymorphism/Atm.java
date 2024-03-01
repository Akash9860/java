package com.edubridge.polymorphism;

class Atmcard{
	void transactionHistory(int deposit) {
		System.out.println("Deposited rs:"+ deposit);
	}
	void transactionHistory(long withdraw) {
		System.out.println("withdraw rs :"+withdraw);
		
	}
	
}

public class Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atmcard a1= new Atmcard();
		a1.transactionHistory(2000);
		a1.transactionHistory(50000L);
	}

}
