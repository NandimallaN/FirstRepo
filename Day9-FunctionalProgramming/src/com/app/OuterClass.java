package com.app;

public class OuterClass {
	
					class InnerClass{
						int x;
						static int y=10;
						InnerClass(){System.out.println("Inner Class Constructor");}
						final void show()
						{
							System.out.println("Show from InnerClass");
						}
						static void show1()
						{
							System.out.println("Show1 static method from InnerClass");
						}
					}
	
	void display()
	{
		System.out.println(" Display method from Outer class");
	}
	
	public static void main(String[] args) {
		
		OuterClass oc=new OuterClass();
		
		oc.display();
		
		OuterClass.InnerClass inner=oc.new InnerClass();
		
		System.out.println(inner.x);
		System.out.println(OuterClass.InnerClass.y);
		inner.show();
		OuterClass.InnerClass.show1();
		
		
		
		
	}

}
