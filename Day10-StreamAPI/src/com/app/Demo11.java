package com.app;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> number=Arrays.asList(23,34,45,2,45,23,5476,21,53,63,55);
		
		System.out.println(number);
		List<Integer> newList= number.stream().skip(5).collect(Collectors.toList());
		
		System.out.println(newList);
		
		number.stream().skip(5).forEach(s->System.out.println(s));
		
		
			

	}

}
