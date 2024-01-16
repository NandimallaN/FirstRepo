package com.app;

public class StaticInnerClassDemo {
	
	StaticInnerClassDemo()
	{
		System.out.println(" Outer Class Constructor...");
	}
	static class InnerClass2
	{
		int x;
		static int y=100;
		InnerClass2(){
			System.out.println("Constructor..................");
		}
		void show() {
			System.out.println(" Show from static Inner Class");
		}
		
		static void show1() {
			System.out.println(" static Show1 from static Inner Class");
		}
		
		
	}

	public static void main(String[] args) {
		
		new StaticInnerClassDemo();
		StaticInnerClassDemo.InnerClass2 s=new InnerClass2();
       System.out.println(s.x);
       System.out.println(StaticInnerClassDemo.InnerClass2.y);
       s.show();
       StaticInnerClassDemo.InnerClass2.show1();
	}

}
