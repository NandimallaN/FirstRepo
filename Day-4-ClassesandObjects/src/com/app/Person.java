package com.app;

public class Person {
private int pno;
private String name;
private Address add1;
public Person(int pno, String name, Address add1) {
	super();
	this.pno = pno;
	this.name = name;
	this.add1 = add1;
}
@Override
public String toString() {
	return "Person [pno=" + pno + ", name=" + name + ", add1=" + add1 + "]";
}


}


	
	
	
