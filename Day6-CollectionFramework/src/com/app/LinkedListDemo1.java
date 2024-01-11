package com.app;

import java.util.HashSet;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
        list.add("Ramana1");
        list.add("Ramana2");
        list.add("Ramana3");
        list.add("4");
        list.add("Ramana5");
        list.add("Ramana1");
        list.add("Ramana2");
        list.add("Ramana3");
        list.add("4");
        list.add("Ramana5");
        System.out.println(list);
        HashSet<String> hs=new HashSet<String>(list);
        System.out.println(hs);	
}
}
