package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDaoImpl  implements UserDao{

	String role="abc";
	@Override
	public String getRoleFromDB(String uname, String pswd) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is esablished.........");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "Nageswara@123");
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setString(1,uname);
			pstmt.setString(2, pswd);
			
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())
			{
				role=rs.getNString(1);
			System.out.println("Role............."+role);
			}
		}
	catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return role;
	}

}
