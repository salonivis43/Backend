<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
         <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL fn:join Example</title>
</head>
<body>

<%
String arr[]={"Abdul","Ravi","Anupam"};
session.setAttribute("names",arr);
%>
${fn:join(names,"&")}
</body>
</html>