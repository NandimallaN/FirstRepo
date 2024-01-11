package com.app;

import java.util.ArrayList;
import java.util.HashSet;

import com.app.bean.Employee;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		Employee e1=new Employee(101,"Ramama",10000);
		Employee e2=new Employee(102,"Ramama",10000);
		Employee e3=new Employee(103,"Ramama",10000);
		Employee e4=new Employee(104,"Ramama",10000);
		Employee e5=new Employee(105,"Ramama",10000);
		
		Employee e11=new Employee(101,"Ramama",10000);
		Employee e22=new Employee(102,"Ramama",10000);
		Employee e33=new Employee(103,"Ramama",10000);
		Employee e44=new Employee(104,"Ramama",10000);
		Employee e55=new Employee(105,"Ramama",10000);
		
		
		ArrayList<Employee> list=new ArrayList<Employee>();
		
		list.add(e1);
		list.add(e5);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e11);
		list.add(e55);
		list.add(e22);
		list.add(e33);
		list.add(e44);
		HashSet<Employee> hs=new HashSet<Employee>(list);
		
		for (Employee e : hs) {
			System.out.println(e);
		}
		
		
		
	}

}
