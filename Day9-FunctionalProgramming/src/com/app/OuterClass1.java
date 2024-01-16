package com.app;

public class OuterClass1 {
	
	void display()
	{
					class InnerClass1{
						int x;
						static int y=10;
						InnerClass1(){System.out.println("Inner Class Constructor");}
						
						//abstract void dis();
						final void show()
						{
							System.out.println("Show from InnerClass");
						}
						static void show1()
						{
							System.out.println("Show1 static method from InnerClass");
						}
					}
	
	
		System.out.println(" Display method from Outer class");
	}
	
	public static void main(String[] args) {
		
		OuterClass oc=new OuterClass();
		
		oc.display();
		
		OuterClass.InnerClass inner=oc.new InnerClass();
		
		OuterClass.InnerClass inner1=new OuterClass().new InnerClass();
		System.out.println(inner.x);
		System.out.println(OuterClass.InnerClass.y);
		inner.show();
		OuterClass.InnerClass.show1();
		
		
		
		
	}

}
