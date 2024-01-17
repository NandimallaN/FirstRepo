package com.app;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> number=Arrays.asList(23,34,45,2,45,23,5476,21,53,63,55);
		
		for (Integer i : number) {
			System.out.print(i + " ");
		}
		System.out.println("======================");
		
		List<Integer> evenNumber=number.stream().filter(n -> n<50).toList();
		
		System.out.println("Even numbers List"+ evenNumber);
		
		Stream<Integer> stream=number.stream();
		
		Integer[] arr=stream.toArray(Integer[]::new);
		
		for (Integer i : arr) {
			System.out.println(i);	
		}
			

	}

}
