package com.app.map;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, Integer> ht=new Hashtable<String, Integer>();
		//HashMap<String,Integer> ht=new HashMap<String, Integer>();
		ht.put("java", 101);
		ht.put(".Net", 102);
		ht.put("C__", 102);
		ht.put("html", 101);
		ht.put("js", 102);
		ht.put("bootstrap", 101);
		ht.put(".Net", 102);
		//ht.put(null, null);
		//ht.put("React", null);
		//ht.put(null, 102);
		System.out.println(ht);
		
		System.out.println(ht.get("java"));
		
		Enumeration<String> e= ht.keys();
		
		while(e.hasMoreElements())
		{
			System.out.println("Key => "+e.nextElement() + "Value" + ht.get(e.nextElement()));
		}
	}

}
