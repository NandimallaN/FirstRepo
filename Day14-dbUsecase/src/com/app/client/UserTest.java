package com.app.client;

import java.util.Scanner;

import com.app.Service.UserLogin;
import com.app.dao.UserDao;
import com.app.dao.UserDaoImpl;

public class UserTest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter username");
		String uname=scanner.next();
		System.out.println("Enter Password");
		String pswd=scanner.next();
		
		UserLogin ulogin=new UserLogin();
		String role=ulogin.getRole(uname,pswd);
	
		
		if(role.equals("hr"))
		{
			System.out.println(" Login successfull ............to hr webpage");
		}
		else if(role.equals("Manager"))
		{
			System.out.println(" Login successfull ............to Manager webpage");
		}
		else if(role.equals("Employee"))
		{
			System.out.println(" Login successfull ............to Employees webpage");
		}
		else
		{
			System.out.println("Login fail ... Relogin");
		}
	}

}
