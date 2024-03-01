package com.edubridge.polymorphism;
class vehicle {
	void disp (int speed){
		System.out.println("Speed of vehicle:"+speed);
		
	}
}
class car extends vehicle {
	void disp(int speed) {
		System.out.println("speed of car:"+speed);
	}
}
class bus extends vehicle{
	void disp (int speed) {
		System.out.println("speed of bus:"+speed);
	}
}
class Bycycle extends vehicle{
	void disp(int speed) {
		System.out.println("speeed of bycycle:"+speed);
	}
}

public class Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehicle v1,v2,v3;
		
		v1=new car();
		v2=new bus();
		v3=new Bycycle();
	
		v1.disp(56);
		v2.disp(50);
		v3.disp(55);
	}

}


