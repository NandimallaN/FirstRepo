package com.app;


import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> lhs=new TreeSet<String>();
		lhs.add("Varma");
		lhs.add("Sarma");
		lhs.add("Raju");
		
		lhs.add("Varma");
		lhs.add("Sarma");
		lhs.add("Raju");
		lhs.add("Arun");
		
		System.out.println(lhs);
		

	}

}
