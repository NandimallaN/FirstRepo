package com.app.examples;


public class OverridingDemo {

	public static void main(String[] args) {
		
		A a=new A();
		a.show();
		System.out.println("===============");
		B b=new B();
		b.show();
		System.out.println(b.x);
	}

}
