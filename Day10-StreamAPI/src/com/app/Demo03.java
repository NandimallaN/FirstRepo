package com.app;

import java.util.Arrays;
import java.util.List;

public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> number=Arrays.asList(23,34,45,2,45,23,5476,21,53,63,55);
		
		for (Integer i : number) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("======================");
		
		List<Integer> sortNumber=number.stream().sorted().distinct().toList();
		
		System.out.println("sort numbers List"+ sortNumber);

	}

}
