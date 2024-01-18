package com.app;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Runtime Exceptions ( Unchecked Exceptions)
		int aa[]= {10,10};
		int a=100;
		int b=10;
		try
		{
		System.out.println(" a/b value is "+ (a/b));
		System.out.println(" a[5]"+ aa[10]);
		}
		catch (ArithmeticException e) {
			System.out.println("Arithemetic Eceptions + "+ e.getMessage());
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException + "+ e.getMessage());
		}
		finally {
			System.out.println("Allways executed........................");
		}

	}

}
