package com.app;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> number=Arrays.asList(23,34,45,2,45,23,5476,21,53,63,55);
		
		Stream<Integer> stream=number.stream();
		//List<Integer> en= stream.filter(i-> i%2==0).toList();
		///System.out.println(en);
		
		List<Integer> en1= stream.filter(i-> i%2==0).collect(Collectors.toList());
		System.out.println(en1);
		
		

	}

}
