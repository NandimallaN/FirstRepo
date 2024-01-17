package com.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo08 {

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
		
		//memberNames.stream().limit(2).filter((s)-> s.startsWith("S")).forEach(k->System.out.println(k));
		
		/*memberNames.stream().sorted().
		filter((s)-> s.startsWith("S"))
		.map(String::toUpperCase)
		.forEach(k->System.out.println(k));
		
		memberNames.stream().sorted()
		.map(String::toUpperCase)
		.forEach(k->System.out.println(k));

		
		memberNames.stream().sorted()
		.map(String::toUpperCase)
		.forEach(System.out::println);
// Method Ref ::
*/
		List<String> list=memberNames.stream().sorted()
		.map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println(memberNames);
		System.out.println(list);
		
	}

}
