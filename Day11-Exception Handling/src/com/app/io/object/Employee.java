package com.app.io.object;

import java.io.Serializable;
import java.time.LocalDate;

public class Employee implements Serializable{
	
	
private int empno;
private String empname;
private LocalDate DOJ;

// NOt storing secondary memory
private transient String description;


public Employee(int empno, String empname, LocalDate dOJ, String description) {
	super();
	this.empno = empno;
	this.empname = empname;
	DOJ = dOJ;
	this.description = description;
}
@Override
public String toString() {
	return "Employee [empno=" + empno + ", empname=" + empname + ", DOJ=" + DOJ + "]";
}





}
