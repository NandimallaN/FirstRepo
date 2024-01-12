package com.app.microproject;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeService {
	
	
	Scanner s=new Scanner(System.in);
	
	
	public ArrayList<Employee> insertRcord(ArrayList<Employee> list)
	{
		Employee e=new Employee();
		System.out.println("Enter Employee no");
		e.setEmpNo(s.nextInt());
		System.out.println("Enter Employee Name");
		e.setEmpName(s.next());
		System.out.println("Enter Employee Salary");
		e.setSalary(s.nextDouble());
		System.out.println("Enter Employee email");
		e.setEmail(s.next());
		list.add(e);
		
		
		return list;
		
	}
	public void viewAllRcords(ArrayList<Employee> list)
	{
		System.out.println(" *******LIST OF EMPLOYEES ******");
		
		if(list.isEmpty())
		{
			System.out.println("No records fourd");
		}
		else
		{
			for (Employee employee : list) {
			System.out.println(employee);
			}
		}
	}
	public ArrayList<Employee> updateRcord(ArrayList<Employee> list)
	{
		System.out.println("Enter Employee no index value to Update");
		int x=s.nextInt();
		if(x>list.size())
		{
			System.out.println(x+ " index value is beyaound the existing LIST");
		}
		else
		{
			Employee e=new Employee();
			System.out.println("Enter Employee no");
			e.setEmpNo(s.nextInt());
			System.out.println("Enter Employee Name");
			e.setEmpName(s.next());
			System.out.println("Enter Employee Salary");
			e.setSalary(s.nextDouble());
			System.out.println("Enter Employee email");
			e.setEmail(s.next());
			list.remove(x);
			list.add(x,e);	
		}
		return list;
	}
	public void deleteRcord(ArrayList<Employee> list)
	{
		
		System.out.println("Enter Employee no index value to detete");
		int x=s.nextInt();
		list.remove(x);
	}

}
