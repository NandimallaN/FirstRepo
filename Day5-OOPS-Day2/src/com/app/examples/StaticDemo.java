package com.app.examples;



 public class StaticDemo {

	  static {
		  System.out.println(" This is static block before main fuction ");
	  }
	  
	  
	 
	public static void main(String[] args) {
		
		 
		
		
		Employee e1=new Employee(101,"Ramana1", 1000);
		Employee e2=new Employee(102,"Ramana2", 2000);
		
		
		//Employee.setOrgName("ProtoMinds.......");
		//Employee.orgName="";
		Employee e3=new Employee(103,"Ramana3", 3000);
		Employee e4=new Employee(104,"Ramana4", 4000);
		Employee e5=new Employee(105,"Ramana5", 5000);
         System.out.println(e1);
         System.out.println(e2);
         System.out.println(e3);
         System.out.println(e4);
         System.out.println(e5);
	}

}
