package com.app.bean;

import java.util.Comparator;

public class EmployeeName implements Comparator<Employee1> {

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
	
		return o1.getEmpName().compareTo(o2.getEmpName());
	}

}
