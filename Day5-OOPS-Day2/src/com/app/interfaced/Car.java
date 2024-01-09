package com.app.interfaced;

public class Car implements Vehicle {

	@Override
	public void drive() {
		System.out.println(" Driver method");
		
	}
	
	public void show()
	{
		System.out.println(" this is show from car class");
	}

}
