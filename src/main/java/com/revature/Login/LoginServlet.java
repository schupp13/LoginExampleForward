package com.revature.Login;
//First java servlet that calls another resource 
import java.io.*; 
import javax.servlet.*; 
import javax.servlet.http.*; 

public class LoginServlet extends HttpServlet { 

	public void doPost(HttpServletRequest req, 
					HttpServletResponse res) 
throws ServletException, IOException 
	{ 
		// The method to receive client requests 
		// which are sent using 'post' 

		//res.setContentType("text/html"); 
		res.setContentType("application/json"); 
		PrintWriter out = res.getWriter(); 

		// fetches username 
		String n = req.getParameter("userName"); 

		// fetches password 
		String p = req.getParameter("userPass"); 
	if(p.equals("Thanos")){ 
			RequestDispatcher rd = req.getRequestDispatcher("servlet2"); 
			// Getting RequestDispatcher object 
			// for collaborating with servlet2 

			// forwarding the request to servlet2 
			rd.forward(req, res); 
	} 
	else{ 
			out.print("Password mismatch"); 
			RequestDispatcher rd = req.getRequestDispatcher("html/login.html"); 
		
		rd.include(req, res); 
						
		} 
	} 
	
} 
