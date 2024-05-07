package com.saloni;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/setCookies")
public class setCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			//print out cookie
			String username=request.getParameter("username");
			
					Cookie c= new Cookie("user",username);
					
					c.setMaxAge(60*60*24);
					
					response.addCookie(c);
					
					
			out.println("<html>"
					+ "<head><title>Cookie Example"
					+"</title></head><body>"
					+"<h1>Cookie are set! visit our website again....</h1>"
					+"</body>"+
					"</html>");
			
			
	}

}
