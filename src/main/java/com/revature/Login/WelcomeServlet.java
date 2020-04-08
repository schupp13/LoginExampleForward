package com.revature.Login;

import java.io.*; 
import javax.servlet.*; 
import javax.servlet.http.*; 

public class WelcomeServlet extends HttpServlet { 

	public void doPost(HttpServletRequest request, 
					HttpServletResponse response) 
		throws ServletException, IOException 
	{ 

		response.setContentType("text/html"); 
		PrintWriter out = response.getWriter(); 

		// fetches username 
		String n = request.getParameter("userName"); 
		String p = request.getParameter("userPass");

		// prints the message 
		out.print("Welcome " + n + " " + p); 
	} 
} 
