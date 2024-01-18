package com.app;


//User Defined Exceptions
public class AgeException extends Exception {

	public AgeException()
	{
		System.out.println("Person is Not eligable for Votar Card");
	}
	
	public AgeException(String msg)
	{
		System.out.println("Person is Not eligable for Votar Card"+msg);
	}
	
	public AgeException(String msg,int age)
	{
		System.out.println("Person is Not eligable for Votar Card"+msg +"    "+age);
	}
}
