package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class FirstJdbc {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is esablished.........");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "Nageswara@123");
			
		    Statement st=con.createStatement();
		    ResultSet rs=st.executeQuery("select * from student");
		    
		    
		    while(rs.next())
		    {
		    	System.out.println(rs.getString(1)+"     "+rs.getString(2)+"     "+rs.getString(2));
		    }
			
		    rs.close();
		    st.close();
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
