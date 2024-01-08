package com.app.test;

import com.app.Address;
import com.app.Person;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address address=new Address("HYD", "INDIA");
		Person p=new Person(101, "KUMAR", address);
		
		System.out.println(p);

	}

}
