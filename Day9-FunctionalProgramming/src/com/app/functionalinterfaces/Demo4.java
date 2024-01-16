package com.app.functionalinterfaces;

interface Sample4
{
	//static and Default methods
	int sayHello();
}

class Sample1Impl4
{
	
	void callMethod()
	{
		/*Sample1 s=new Sample1() {
			
			@Override
			public void sayHello() {
				// TODO Auto-generated method stub
				
			}
		};*/
		
		
	Sample4 s=()-> 100;
	System.out.println(s.sayHello());
	}
}

public class Demo4 {

	public static void main(String[] args) {
		new Sample1Impl4 ().callMethod();

	}

}
