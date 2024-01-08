package com.app;

import java.util.Scanner;





public class Customer {
	int custNO;
	String custName;
	String location;
	
	public void insertCustomer()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Customer no:");
		custNO=s.nextInt();
		System.out.println("Enter Customer Name :");
		custName=s.next();
		System.out.println("Enter Customer location");
		location=s.next();
	}

	public void showCustomer()
	{
		System.out.println("Custono: "+ custNO +"     CustName:- "+ custName+"     Location :-"+location);
	}
}
