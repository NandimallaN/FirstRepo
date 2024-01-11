package com.app;


import java.util.TreeSet;

import com.app.bean.Employee;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		Employee e1=new Employee(101,"Ramama",10000);
		Employee e2=new Employee(102,"Varma",10000);
		Employee e3=new Employee(103,"Arun",10000);
		Employee e4=new Employee(104,"Lakpa",10000);
		Employee e5=new Employee(105,"Pavan",10000);
		
		Employee e11=new Employee(101,"Ramama",10000);
		Employee e22=new Employee(102,"Varma",10000);
		Employee e33=new Employee(103,"Arun",10000);
		Employee e44=new Employee(104,"lakpa",10000);
		Employee e55=new Employee(105,"pavan",10000);
		
		
		TreeSet<Employee> lhs=new TreeSet<Employee>();
		lhs.add(e3);
		lhs.add(e1);
		lhs.add(e2);
		lhs.add(e5);
		lhs.add(e4);
		lhs.add(e22);
		
		lhs.add(e11);
		
		lhs.add(e33);
		lhs.add(e44);
		lhs.add(e55);
		
		for (Employee e : lhs) {
			System.out.println(e);
		}
		
		

	}

}
