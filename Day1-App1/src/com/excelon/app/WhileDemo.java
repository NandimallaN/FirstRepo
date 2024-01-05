package com.excelon.app;

public class WhileDemo {

	public static void main(String[] args) {
		int i=0,sum=0;
		while (i<=10) 
		{
			System.out.println("----------------> "+i);
			sum=sum+i;
			i++;
		}
		System.out.println("----Total------------> "+sum);
	}
}


//  find the sum of Odd and even numbers