package com.app.functionalinterfaces;

interface Sample1
{
	//static and Default methods
	void sayHello();
}

class Sample1Impl 
{
	
	void callMethod()
	{
		/*Sample1 s=new Sample1() {
			
			@Override
			public void sayHello() {
				// TODO Auto-generated method stub
				
			}
		};*/
		
		
	Sample1 s=()->{  System.out.println("Hello Excelon systems.......");};
	s.sayHello();
	}
}

public class Demo1 {

	public static void main(String[] args) {
		new Sample1Impl ().callMethod();

	}

}
