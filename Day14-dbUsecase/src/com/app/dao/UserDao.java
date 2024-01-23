package com.app.dao;

public interface UserDao {
	
	String query="select role from user where username=? and password=?";
	
	String getRoleFromDB(String uname,String pswd);

}
