package com.app.examples;

public class Employee {
	
	private int empno;
	private String empname;
	private double salary;
	
	private static String orgName="ExcelonSoluations..";
	
	{
		  System.out.println(" This is NoName block is executed when object is created ");
	  }
	
	public Employee(int empno, String empname, double salary) {
		super();
		this.empno = empno;
		this.empname = empname;
		this.salary = salary;
	}

	public static String getOrgName() {
		return orgName;
	}

	public static void setOrgName(String orgName) {
		Employee.orgName = orgName;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", empname=" + empname + ", "
				+ "salary=" + salary +", OrgName ="+ orgName +"]" ;
	}
	
	

}
