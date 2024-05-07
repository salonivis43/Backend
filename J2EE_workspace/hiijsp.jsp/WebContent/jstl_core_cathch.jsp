<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL c:catch Tag</title>
</head>
<body>

	<c:catch var="err">
		<%
			int r=10/2;
			out.println("<span style='color:green'>Result is:"+r+"</span>");
		%>
	</c:catch>


	<c:if test="${err!=null}">
			<div style="color:red">Runtime exception Raised  :${err}</div>
	
	</c:if>
		<c:catch var="err">
		<%
			int r=10/0;
			out.println("<span style='color:green'>Result is:"+r+"</span>");
		%>
	</c:catch>


	<c:if test="${err!=null}">
			<div style="color:red">Runtime exception Raised  :${err}</div>
	
	</c:if>

</body>
</html>