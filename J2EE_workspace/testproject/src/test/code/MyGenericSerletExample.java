package test.code;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class MyGenericSerletExample
 */
@WebServlet("/MyGenericSerletExample")
public class MyGenericSerletExample extends GenericServlet {
	
   
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.getWriter().println("<b>Hello from Generic servlet</b>");
	}

}
