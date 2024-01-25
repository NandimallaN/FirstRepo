package com.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.model.LoginDAO;

/**
 * Servlet implementation class Servlet5
 */
@WebServlet("/UpdateEmpServlet")
public class UpdateEmpServlet extends HttpServlet  {
	private static final long serialVersionUID = 1L;
	String updateQuery="update emp set empname=?,salary=? where empno=?";
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is esablished.........");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "Nageswara@123");
			PreparedStatement pstmt=con.prepareStatement(updateQuery);
			String empno=request.getParameter("empno");
			String empname=request.getParameter("empname");
			String salary=request.getParameter("salary");
			
			pstmt.setString(1, empname);
			pstmt.setInt(2,Integer.parseInt(salary));
			
			pstmt.setInt(3, Integer.parseInt(empno));
			
			
			int x=pstmt.executeUpdate();
		    
			if(x>0)
				out.println(x+ "  Recods are Inserted.....");
			else
				out.println("No Recod Inserted");
			
			out.print("<a href='empCrud.html'>CRUD PAGE</a>");
		    pstmt.close();
		    con.close();
			
			
		}
	catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
