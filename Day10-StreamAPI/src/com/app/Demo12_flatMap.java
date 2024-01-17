package com.app;

import java.util.Arrays;
import java.util.List;

public class Demo12_flatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<List<Integer>> listOfLists = Arrays.asList(
				  Arrays.asList(1, 2, 3),
				  Arrays.asList(4, 5,2),
				  Arrays.asList(6, 7, 8)
				);

		System.out.println(listOfLists);
		
		List<Integer> list=listOfLists.stream().flatMap(p->p.stream()).toList();
		System.out.println(list);
	}

}
