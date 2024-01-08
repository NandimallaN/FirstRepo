package com.app;

public class Address
{
	private String add1;
	private String add2;
	public Address(String add1, String add2) {
		super();
		this.add1 = add1;
		this.add2 = add2;
	}
	@Override
	public String toString() {
		return "Address [add1=" + add1 + ", add2=" + add2 + "]";
	}
}