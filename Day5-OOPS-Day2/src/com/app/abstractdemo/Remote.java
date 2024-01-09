package com.app.abstractdemo;

abstract public class Remote {
	
	// abstract methods
	public abstract void on();
	public abstract void off();
	
	public Remote() {System.out.println("Constructor....");}
	
	public static void show() {System.out.println("static show");}
	
	public void display() {System.out.println(" display instance ");}
	
	public final void view() {System.out.println("View final methods");}
	
}
