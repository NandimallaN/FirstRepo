package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet4
 */
@WebServlet("/Servlet4")
public class Servlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		System.out.println(" DoPost methods.....");
		PrintWriter out=response.getWriter();
		out.println("<h1> Do post Method</h1>");
		String uname=request.getParameter("uname");
		String pswd=request.getParameter("pswd");
		out.println(uname+"             "+pswd);
		
		if(uname.equals(pswd))
			out.println("Login is Success...........");
		else 
			out.println("Login Fail...........");
			
		
	}

}
