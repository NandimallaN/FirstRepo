package com.app;

public class OverloadingDemo {

	void show(int x)
	{
		System.out.println(" Int value is "+x);
	}
	
	void show(int x,int y)
	{
		System.out.println(" Int  x+y value is "+x + y);
	}
	
	void show(double x,int y)
	{
		System.out.println(" Int  x+y value is "+x + y);
	}
	void show(String x)
	{
		System.out.println(" String value is "+x);
	}
	
	public static void main(String[] args) {
		OverloadingDemo old=new OverloadingDemo ();
		old.show(100);
		old.show("Ramana");
		old.show(10.00, 20);
		old.show(10, 20);
		
	}
}
