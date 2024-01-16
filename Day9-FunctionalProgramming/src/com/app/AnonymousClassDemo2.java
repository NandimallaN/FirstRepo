package com.app;

//Type 1:- Anonymous interface implements a class
interface Sample2
 {
	public void show();
}

class AnonymousDemo2   
{
	public void createClass()
	{
		Sample2 s=new Sample2(){
			public void show() {System.out.println("show from anonymous Class");}
		};
		s.show();
	}
	
}


public class AnonymousClassDemo2{
	public static void main(String[] args) {
		AnonymousDemo2 ad=new AnonymousDemo2();
		ad.createClass();
		
	}

}
