package com.app;


import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<String> lhs=new ArrayList<String>();
		lhs.add("Varma");
		lhs.add("Sarma");
		lhs.add("Raju");
		
		lhs.add("Varma");
		lhs.add("Sarma");
		lhs.add("Raju");
		lhs.add("Arun");
		
		System.out.println(lhs);
		
		Collections.sort(lhs);
		System.out.println(lhs);
		
		
		
	
		

	}

}
