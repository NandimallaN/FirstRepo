package com.app;

import java.util.Arrays;
import java.util.List;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> number=Arrays.asList(23,34,45,2,45,23,5476,21,53,63,55);
		
		for (Integer i : number) {
			System.out.print(i + " ");
		}
		System.out.println("======================");
		
		List<Integer> evenNumber=number.stream().filter(n -> n%2==0).toList();
		
		System.out.println("Even numbers List"+ evenNumber);

	}

}
