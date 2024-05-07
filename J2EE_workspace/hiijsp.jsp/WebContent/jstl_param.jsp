<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL c:param tag</title>
</head>
<body>
<c:url var="theurl" value="/display.jsp">

<c:param name="myname" value="Saloni"/>

<c:param name="mycollege" value="BIT"/>

</c:url>
<a href="${theurl}">Click</a>

</body>
</html>