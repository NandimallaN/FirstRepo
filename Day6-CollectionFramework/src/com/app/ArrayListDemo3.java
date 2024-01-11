package com.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		
      System.out.println(list);
      list.remove(1);
      System.out.println(list);
      
      list.add(1, 2000);
      System.out.println(list);
      
      
      /* Convert arry List in to Array*/
     Object[] x= list.toArray();
     
     
     for (int i = 0; i < x.length; i++) {
    	 System.out.println(x[i]);
     }
    	 
     /* Convert Array into List Object*/
    	 Integer[] arr= {34,45,56,56,34,34};
    	 List<Integer> list1=Arrays.asList(arr);
    	 
    	 System.out.println(list1);
		
	}

}
