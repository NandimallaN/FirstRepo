package com.app.Service;

import com.app.dao.UserDao;
import com.app.dao.UserDaoImpl;

public class UserLogin {
	
	public String getRole(String uname,String pswd)
	{
		UserDao userdao=new UserDaoImpl();
		String role=userdao.getRoleFromDB(uname, pswd);
		return role;
	}

}
