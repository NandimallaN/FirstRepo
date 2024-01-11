package com.app.bean;

import java.util.Comparator;

public class EmpNoSorting implements  Comparator<Employee1>{

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		if(o1.getEmpno() == o2.getEmpno())
		return 0;
		else if(o1.getEmpno()> o2.getEmpno())
			return 1;
		else
			return -1;
	}

	
}
