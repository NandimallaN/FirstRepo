package com.app;

public class Employee {

	public int empNO;
	public String empName;
	public double salary;
	
	// Default Constuctors
	public Employee()
	{
		System.out.println(" This is constructor.........");
	}
  // Argument Constructor
	public Employee(int empNO, String empName, double salary) {
		super();
		this.empNO = empNO;
		this.empName = empName;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empNO=" + empNO + ", empName=" + empName + ", salary=" + salary + "]";
	}
	
	
}
