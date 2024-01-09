package com.app.examples;

class Demo
{
	int a=10;
	static int b=20;
	void increment()
	{
		a++;
		b++;
		System.out.println("a "+ a +" b"+b);
	}
}
public class StaticDemo1 {

	public static void main(String[] args) {
		
     new Demo().increment();
     new Demo().increment();
     new Demo().increment();
     new Demo().increment();
	}

}
