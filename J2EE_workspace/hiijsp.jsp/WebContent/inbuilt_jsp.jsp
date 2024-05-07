<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>JSP Built-In Objects - request</h3>
Request user agent : <%=request.getHeader("User-Agent")%>

<br>
Request Language : <%=request.getLocale() %>

</body>
</html>