package com.excelon.app;

import java.util.Scanner;

public class Condition1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" Enter a value ");
		int accoutBalance=s.nextInt();
		System.out.println(" a value is "+ accoutBalance);
		
		if(accoutBalance>0)
		{
			System.out.println(" Valid account");
		}
		else
		{
			System.out.println(" InValid account");
		}
 
		
		// x value > travel  100$  < 100$ no travel
	}

}
