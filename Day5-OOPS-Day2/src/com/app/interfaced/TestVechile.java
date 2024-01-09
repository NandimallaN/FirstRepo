package com.app.interfaced;

public class TestVechile {

	public static void main(String[] args) {
	
		Vehicle.show();
		System.out.println(Vehicle.PI);
		
		Car c=new Car();
		c.drive();
		c.show();
		
		 Vehicle r=new Car();
		 r.drive();
		 

	}

}
