package com.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Demo09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> memberNames = new ArrayList<String>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		System.out.println(memberNames);
		boolean m=memberNames.stream().allMatch((s)-> s.startsWith("A"));
		
		System.err.println(m);
		
boolean m1=memberNames.stream().anyMatch((s)-> s.startsWith("A"));
		
		System.err.println(m1);
		
boolean m2=memberNames.stream().noneMatch((s)-> s.startsWith("E"));
		
		System.err.println(m2);
		
long count=memberNames.stream().filter((s)-> s.startsWith("S")).count();
		
		System.err.println(count);
		
		Optional<String> reduced=memberNames.stream().reduce((s1,s2)-> s1 +" @@ " +s2);
		
		System.out.println(reduced);
		
		String firstemeber=memberNames.stream().filter((s)-> s.startsWith("S")).findFirst().get();
		System.out.println(firstemeber);
		
		
		
	}

}
