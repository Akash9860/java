package com.edubridge.polymorphism;
class Employee{
	void show (String name) {
		System.out.println("Employee name:"+name);
	}
class Company{
		void show (String name) {
			System.out.println("company name:"+name);
		}
	}
}

public class Overriding {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
			Employee e1 = new Employee();
			
			com.edubridge.polymorphism.Employee.Company c1 = com.edubridge.polymorphism.Employee.Company();
			e1.show("john smith");	
			c1.show("capegemini");
			

	}

}
