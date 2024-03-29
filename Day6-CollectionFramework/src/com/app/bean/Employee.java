package com.app.bean;

import java.util.Comparator;
import java.util.Objects;

public class Employee implements Comparable<Employee>{
	
	private Integer empno;
	private String empName;
	private double salary;
	
	public Employee(int empno, String empName, double salary) {
		super();
		this.empno = empno;
		this.empName = empName;
		this.salary = salary;
	}
	
	
	


	public Integer getEmpno() {
		return empno;
	}





	public void setEmpno(Integer empno) {
		this.empno = empno;
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
		Employee other = (Employee) obj;
		return empno == other.empno;
	}


	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", empName=" + empName + ", salary=" + salary + "]";
	}


	@Override
	public int compareTo(Employee e) {
		return this.getEmpName().compareTo(e.getEmpName());
	}





	public String getEmpName() {
		return empName;
	}





	public void setEmpName(String empName) {
		this.empName = empName;
	}


	
	
	

}
