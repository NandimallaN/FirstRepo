package com.app;

public class Demo03 {

	public static void main(String[] args) throws AgeException {
		
		int age=19;
		
       if(age>18)
       {
    	   System.out.println("Eligable for votar ID");
       }
       else
       {
    	   throw new AgeException("Nageswara",age);
       }
	}

}
