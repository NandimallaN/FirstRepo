package com.app;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> number=Arrays.asList(1,23,34,45,2,45,23,5476,21,53,63,55);
		
		Optional<Integer> min=number.stream().min((i,j)->i.compareTo(j));
		System.out.println(min);
		
		Optional<Integer> max=number.stream().max((i,j)->i.compareTo(j));
		System.out.println(max);
	}

}
