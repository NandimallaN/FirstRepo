package com.app.array;

import java.util.Iterator;

public class ArrayDemo1 {
	public static void main(String[] args) {
		
		
		  int[] array1=new int[10];
		  
		  
		for (int i = 0; i < array1.length ; i++) {
			
			array1[i]=i*3;
		}
		
		for (int result : array1) {
			System.out.println(result);
		}

	}

}
