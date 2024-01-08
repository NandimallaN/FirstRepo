package com.app.test;

import com.app.Address;
import com.app.Person;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address paddress=new Address("HYD1", "INDIA");
		Address taddress=new Address("HYD2", "pakistan");
		Address laddress=new Address("HYD3", "USA");
		Person p=new Person(101, "KUMAR", paddress,taddress,laddress);
		
		System.out.println(p);

	}

}
