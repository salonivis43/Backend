package com.saloni;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(filterName="FilterExample",urlPatterns= {"/setCookies"})
public class FilterExample implements Filter {


	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	 response.setContentType("text/html");
	 PrintWriter out=response.getWriter();
	 
	 
	 //check your hacker 
	 
	 String username=request.getParameter("username");
	 
	 if(!"hacker".equalsIgnoreCase(username)) {
		 
		 chain.doFilter(request, response);
	 }
	 else
	 {
		out.println("<html>"
				+ "<head><title>Cookie Example"
				+"</title></head><body>"
				+"<h1>We don't  entertain users with name hacker......</h1>"
				+"</body>"+
				"</html>"); 
		 
	 }
	 
	
	 
	 
	}


	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
