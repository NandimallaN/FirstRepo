package com.app.functionalinterfaces;

interface Sample2
{
	//static and Default methods
	void sayHello(String name);
}

class Sample1Impl2 
{
	
	void callMethod()
	{
		/*Sample1 s=new Sample1() {
			
			@Override
			public void sayHello() {
				// TODO Auto-generated method stub
				
			}
		};*/
		
		
	Sample2 s=(x)->{  System.out.println("Hello Excelon systems......."+x);};
	s.sayHello("Nageswara");
	}
}

public class Demo2 {

	public static void main(String[] args) {
		new Sample1Impl2 ().callMethod();

	}

}
