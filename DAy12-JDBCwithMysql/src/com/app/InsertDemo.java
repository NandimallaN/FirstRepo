package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is esablished.........");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "Nageswara@123");
			
			PreparedStatement psmt=con.prepareStatement("insert into student values(?,?,?)");
			
			psmt.setInt(1, 106);
			psmt.setString(2, "Vikram");
			psmt.setString(3, "vikram@gmai.com");
			
			int x=psmt.executeUpdate();
		    
			if(x>0)
				System.out.println(x+ "  Recods are Inserted.....");
			else
				System.out.println("No Recod Inserted");
		    psmt.close();
		    con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
