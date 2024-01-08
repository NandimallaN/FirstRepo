package com.app.test;

import com.app.Employee2;

public class EmployeeSetterGettterTest {
	public static void main(String[] args) {
		
		Employee2 e=new Employee2();
		
		e.setEmpNO(101);
		e.setEmpName("Venkat");
		e.setSalary(1000);
		
		System.out.println(e.getEmpNO() +"  | "+ e.getEmpName()+" | "+ e.getSalary());

	}
}
