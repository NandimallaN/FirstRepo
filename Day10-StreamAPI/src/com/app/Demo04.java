package com.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Stream<Integer> stream=Stream.of(new Integer[] {34,45,67,43,45,63,72,72,82,82});
       stream.forEach(p-> System.out.print(p+" "));
       System.out.println();
       Stream<String> stream1=Stream.of("Ramana","Raju","Venkat","Jphn","Alex","Joe");
       stream1.sorted().forEach(p-> System.out.print(p+" "));
       
       System.out.println();
       List<Integer> list=new ArrayList<Integer>();
       
       for (int i = 0; i < 10; i++) {
		list.add(i);
       		}
       
       Stream<Integer> stream2=list.stream();
       stream2.forEach(p-> System.out.print(p+" "));
       System.out.println();
       
	}

}
