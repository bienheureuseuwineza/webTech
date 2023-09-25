package com.example.servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter pw = response.getWriter();
//		String s = request.getParameter("t1");
//		pw.println("<h1>Hello," +s);
//		pw.close();
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		
		   String username = request.getParameter("username");
	        String password = request.getParameter("password");

	        if ("Uwineza".equals(username) && "password1".equals(password)) {

           	response.sendRedirect("welcome.html"); 
	        } else {
	           
	            response.sendRedirect("forgotPassword.html"); 
	        }
	
	}
}
