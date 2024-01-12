package com.app.microproject;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	 static Scanner scanner = new Scanner(System.in);
	  static int choice = 0;
	  
	  //Main method is created here
	  public static void main(String[] args) {
		  ArrayList<Employee> list=new ArrayList<Employee>();
		  while(true)
		  {
	      //Here we are asking the user to make a choice
	      System.out.println("Enter 1 for Insert Record");
	      System.out.println("Enter 2 for ViewAll Records");
	      System.out.println("Enter 3 for Update a Record");
	      System.out.println("Enter 4 for Delete a Record");
	      System.out.println("Enter 9 to Quit");
	      choice = scanner.nextInt();

	      EmployeeService es=new EmployeeService();
	      //Switch block is created here
	      switch (choice) {

	          case 1:
	             list= es.insertRcord(list);
	              break;
	          case 2:
	              es.viewAllRcords(list);
	              break;
	          case 3:
	              list=es.updateRcord(list);
	              break;
	          case 4:
	              es.deleteRcord(list);
	              break;   
	          case 9:
	        	  System.out.println("Exit from MENU");
	              System.exit(0);
	          default:
	              System.out.println("You have inputted the invalid choice\n");
	      }
		  }
	
	  }

}
