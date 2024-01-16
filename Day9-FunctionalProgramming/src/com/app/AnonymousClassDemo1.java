package com.app;

//pe 1:- Anonymous class extends a class
class Sample1{
	void show() {System.out.println(" show from Sample1");}
}

class AnonymousDemo1 extends Sample1
{
	public void createClass()
	{
		Sample1 s=new Sample1() {
			void show() {System.out.println("show from anonymous Class");}
		};
		s.show();
	}
	
}


public class AnonymousClassDemo1{
	public static void main(String[] args) {
		AnonymousDemo1 ad=new AnonymousDemo1();
		ad.createClass();
		
	}

}
