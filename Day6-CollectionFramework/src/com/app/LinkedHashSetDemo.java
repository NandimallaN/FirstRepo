package com.app;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("Varma");
		lhs.add("Sarma");
		lhs.add("Raju");
		
		lhs.add("Varma");
		lhs.add("Sarma");
		lhs.add("Raju");
		
		System.out.println(lhs);
		

	}

}
