package com.app;


import java.util.TreeSet;

import com.app.bean.EmpNoSorting;
import com.app.bean.Employee1;
import com.app.bean.EmployeeName;

public class TreeSetDemo2
{

	public static void main(String[] args) {
		Employee1 e1=new Employee1(101,"Ramama",10000);
		Employee1 e2=new Employee1(102,"Varma",10000);
		Employee1 e3=new Employee1(103,"Arun",10000);
		Employee1 e4=new Employee1(104,"Lakpa",10000);
		Employee1 e5=new Employee1(105,"Pavan",10000);
		
		Employee1 e11=new Employee1(101,"Ramama",10000);
		Employee1 e22=new Employee1(102,"Varma",10000);
		Employee1 e33=new Employee1(103,"Arun",10000);
		Employee1 e44=new Employee1(104,"lakpa",10000);
		Employee1 e55=new Employee1(105,"pavan",10000);
		
		//EmployeeName e=new EmployeeName();
		
		EmpNoSorting e=new EmpNoSorting();
		TreeSet<Employee1> lhs=new TreeSet<Employee1>(e);
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
		
		for (Employee1 e10 : lhs) {
			System.out.println(e10);
		}
		
		

	}

}
