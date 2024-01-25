package com.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertEmpServlet
 */
@WebServlet("/InsertEmpServlet")
public class InsertEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is esablished.........");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "Nageswara@123");
			
			PreparedStatement psmt=con.prepareStatement("insert into emp values(?,?,?,?)");
			
			String empno=request.getParameter("empno");
			String empname=request.getParameter("empname");
			String salary=request.getParameter("salary");
			String deptno=request.getParameter("deptno");
			
			psmt.setInt(1, Integer.parseInt(empno));
			psmt.setString(2, empname);
			psmt.setInt(3,Integer.parseInt(salary));
			psmt.setInt(4, Integer.parseInt(deptno));
			
			int x=psmt.executeUpdate();
		    
			if(x>0)
				out.println(x+ "  Recods are Inserted.....");
			else
				out.println("No Recod Inserted");
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
