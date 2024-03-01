package com.edubridge.encapsulation;

public class Hotel {

	public static void main(String[] args) {
		
		Menu m1=new Menu();
		
		m1.setMenuId(101);
		m1.setMenuname("Dosa");
		m1.setMenuprise(100);
		System.out.println(m1.getMenuId()+" "+m1.getMenuname()+" "+m1.getMenuprise());
		
		
	}

}
