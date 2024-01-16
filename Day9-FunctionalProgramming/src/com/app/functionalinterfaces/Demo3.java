package com.app.functionalinterfaces;

interface Sample3
{
	//static and Default methods
	int sayHello(int x,int y);
}

class Sample1Impl3
{
	
	void callMethod()
	{
		/*Sample1 s=new Sample1() {
			
			@Override
			public void sayHello() {
				// TODO Auto-generated method stub
				
			}
		};*/
		
		
	Sample3 s=(x,y)-> x+y;
	System.out.println(s.sayHello(10,20));
	}
}

public class Demo3 {

	public static void main(String[] args) {
		new Sample1Impl3 ().callMethod();

	}

}
