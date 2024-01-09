package com.app.abstractdemo;

 public class Telivision extends Remote{

	
	Telivision()
	{
	super();	
	}
	@Override
	public void on() {
		System.out.println("Switch On Telivision");
	}

	@Override
	public void off() {
		System.out.println("Switch Off Telivision");
	}
	
	public void monitor()
	{
		System.out.println(" Monitor....");
	}
	
	
}
