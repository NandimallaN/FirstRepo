package com.app;

import java.util.Random;
import java.util.stream.Stream;

public class Demo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<Integer> randamNumber=Stream.generate(()->(new Random().nextInt(100)));
		
		//randamNumber.forEach(p-> System.out.print(p+" "));
		System.out.println();
		randamNumber.limit(20).forEach(p-> System.out.print(p+" "));

	}

}
