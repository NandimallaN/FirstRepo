package com.app.model;

public interface LoginDAO {
	
	
String query="select role from user where username=? and password=?";



	
	String getRoleFromDB(String uname,String pswd);

}
