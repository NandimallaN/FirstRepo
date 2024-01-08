package com.app;

public class Employee1 {

	// Abstraction
   private int empNO;
	private String empName;
	private double salary;
	
	// Default Constuctors
	public Employee1()
	{
		System.out.println(" This is constructor.........");
	}
  // Argument Constructor
	public Employee1(int empNO, String empName, double salary) {
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
