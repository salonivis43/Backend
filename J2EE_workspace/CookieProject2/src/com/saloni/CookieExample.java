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

@WebServlet("/validateLogin")
public class CookieExample extends HttpServlet {
	private static final long serialVersionUID = 1L;



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			
			//print out cookie
			Cookie[]cookie=request.getCookies();
			
			String name="";
			String value="Stringer";
			
			if(cookie!=null) {
				for(int i=0;i<cookie.length;i++) {
					Cookie c=cookie[i];
					
					name=c.getName();
					value=c.getValue();
					
				}
			}
			out.println("<html>"
					+ "<head><title>Cookie Example"
					+"</title></head><body>"
					+"<h1>Cookie Example</h1>"
					+ "<h3style=\"color:red\">Welcome Back "+value+"</h3>"
					+"<h3>Tell us your name to greet you the next time you visit out website</h3>"+
					"<form action=\"SetCookies\"methods=\"POST\">"
					+"Name : <input type=\"text\"name=\"username\"><br/>"+
					"<br/><input type=\"submit\"value=\"Tell my name!\">"
					+"</form"
					+"</body>"+
					"</html>");
			
			
	}

}
