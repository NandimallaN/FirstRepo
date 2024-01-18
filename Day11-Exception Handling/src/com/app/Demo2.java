package com.app;

public class Demo2 {
	
	
		  public static void divideByZero() {
			  int a=100;
				int b=0;
				if(b>0)
				{
				System.out.println(" a/b value is "+ (a/b));
				}
				else
				{
		    throw new ArithmeticException("Trying to divide by 0...................");
				}
		  }

		  

	public static void main(String[] args) {
		divideByZero() ;

	}

}
