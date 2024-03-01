package com.edubridge.polymorphism;
class Maths{
	void add (int a, int b) {
		System.out.println(a+b);
	}
	void add (int a,int b, int c) {
		System.out.println(a+b);
	}
	void add (String a, String b) {
		System.out.println(a+b);
	}
}

public class polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths m1=new Maths();
		
		m1.add(10,20);
		m1.add("Hello","  hi");
		m1.add(10,20,30);

	}

}
