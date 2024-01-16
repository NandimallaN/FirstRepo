package com.app;

class Sample{
	void show() {}
}
public class AnonymousClassDemo {
	public static void main(String[] args) {
	
		Sample s=new Sample() {
			void show() {System.out.println("show from anonymous Class");}
		};
		s.show();
	}

}
