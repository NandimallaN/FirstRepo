package com.app.bean;


import java.util.Objects;

public class Employee1{
	
	private int empno;
	private String empName;
	private double salary;
	
	public Employee1(int empno, String empName, double salary) {
		super();
		this.empno = empno;
		this.empName = empName;
		this.salary = salary;
	}
	

	public int getEmpno() {
		return empno;
	}


	public void setEmpno(int empno) {
		this.empno = empno;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	@Override
	public int hashCode() {
		return Objects.hash(empno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee1 other = (Employee1) obj;
		return empno == other.empno;
	}


	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", empName=" + empName + ", salary=" + salary + "]";
	}


}
