package com.app;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntStream stream ="ExcelonSoluation".chars();
		
		stream.forEach(k-> System.out.print((char)k));

		System.out.println();
		Stream<String> stream1=Stream.of("Excel,on,soluation,hyd ltd".split(","));
		stream1.forEach(k-> System.out.println(k));
	}

}
