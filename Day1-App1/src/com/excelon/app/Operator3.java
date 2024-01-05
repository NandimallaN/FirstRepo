package com.excelon.app;

public class Operator3 {

	public static void main(String[] args) {
		
		//syntax  (  expression ?  true result : false result)
		int a=10,b=50,c;
		
		//a>b ? System.out.println("A is > B") : System.out.println("A is < b");
		c= a>b ? a: b;
		
		System.out.println("Greatest value is "+ c) ;
	}

}

//Find the greatest three numbers using Ternary operator