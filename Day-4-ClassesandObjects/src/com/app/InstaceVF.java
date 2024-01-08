package com.app;

public class InstaceVF {
	// Instance Variables
	int no = 101;
	String name = "RAmana";

	InstaceVF()
	{
		System.out.println(" Default Constructor.........");
	}
	public static void main(String[] args) {
		display();
		InstaceVF ivf = new InstaceVF();

		System.out.println(" No value " + ivf.no);
		System.out.println(" No value " + ivf.name);
		ivf.show();
	}

	// Instance Method
	void show() {
		System.out.println("Instace Methods");
	}

	static void display() {
		System.out.println("Static Methods");
	}

}
