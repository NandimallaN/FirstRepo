package com.app.map;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
	
		TreeMap<Integer, String>  tm=new TreeMap<Integer, String>();
		
		tm.put(101, "KPMG");
		tm.put(1022, "E&y");
		tm.put(103, "Deloitte");
		tm.put(1044, "Invesco");
		
		System.out.println(tm);

	}

}
