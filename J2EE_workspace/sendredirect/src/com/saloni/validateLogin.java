package com.saloni;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/validateLogin")
public class validateLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public validateLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("username");
		String upass=request.getParameter("password");
		
		if("admin".equals(uname)&&"admin".equals(upass)) {
			response.getWriter().print("<b style='color:green'>Welcome To DashBoard !</b>");
	}
		else {
			response.sendRedirect("login.html");
		}

}
