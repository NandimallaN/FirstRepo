package com.app;

public class Person {
private int pno;
private String name;
private Address padd,tadd,ladd;
public Person(int pno, String name, Address padd, Address tadd, Address ladd) {
	super();
	this.pno = pno;
	this.name = name;
	this.padd = padd;
	this.tadd = tadd;
	this.ladd = ladd;
}
@Override
public String toString() {
	return "Person [pno=" + pno + ", name=" + name + ", padd=" + padd + ", tadd=" + tadd + ", ladd=" + ladd + "]";
}



}


	
	
	
