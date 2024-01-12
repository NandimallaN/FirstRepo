package com.app.microproject;

public class Employee {

	private Integer empNo;
	private String empName;
	private double salary;
	private String email;
	
	public Employee()
	{	
	}

	public Employee(Integer empNo, String empName, double salary, String email) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
		this.email = email;
	}



	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", salary=" + salary + ", email=" + email + "]";
	}
	
	
	
}
