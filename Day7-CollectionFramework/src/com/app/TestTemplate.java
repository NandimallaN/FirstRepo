package com.app;

public class TestTemplate {

	public static void main(String[] args) {
		
		Template<Integer> t=new Template<>();
		System.out.println(t.showData(1000));
		
		Template<String> t1=new Template<String>();
		System.out.println(t1.showData("Welcome to excelon"));
		
		
	}

}
