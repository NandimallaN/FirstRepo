package com.app.bean;

public class Employee {
	
	private int empno;
	private String empName;
	private double salary;
	
	public Employee(int empno, String empName, double salary) {
		super();
		this.empno = empno;
		this.empName = empName;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", empName=" + empName + ", salary=" + salary + "]";
	}
	
	

}
