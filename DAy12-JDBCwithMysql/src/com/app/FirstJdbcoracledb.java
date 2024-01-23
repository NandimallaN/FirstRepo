package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;





public class FirstJdbcoracledb {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver is esablished.........");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			
		    Statement st=con.createStatement();
		    ResultSet rs=st.executeQuery("select * from employees where salary >10000 ");
		    ResultSetMetaData rsdm= rs.getMetaData();
		    
		    for (int i = 1; i < rsdm.getColumnCount(); i++) {
	    		 System.out.print(rsdm.getColumnName(i)+"       ");
		    }
		
		    System.out.println("================================================");
		   
		    while(rs.next())
		    {
		    	 for (int i = 1; i < rsdm.getColumnCount(); i++) {
		    		 System.out.print(rs.getString(i)+"  ");
					
				}
		    	System.out.println();
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
