package com.app.examples;

public class B extends A
{
	@Override
    public void show()
	{
		System.out.println(" show method from Class B"+ x);
		super.show();
	}
}
