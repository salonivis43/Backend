package com.saloni;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/validateLogin")
public class validateLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			String uname=request.getParameter("username");
			String upass=request.getParameter("password");
			
			if(upass.equals("1234")) {
				//CREATE A COOKIE
				Cookie ck=new Cookie("username",uname);
				
				response.addCookie(ck); //Default
				response.sendRedirect("Welcome");
				
		
			}
			
	}

}
