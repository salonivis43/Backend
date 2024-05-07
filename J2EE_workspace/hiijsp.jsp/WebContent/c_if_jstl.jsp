<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="age" value="26"/>
<c:if test="${age<=18 }">
<c:out value="you are not eligible for DL"/>

</c:if>
<c:if test="${age>18 }">
<c:out value="you are eligible for DL"/>

</c:if>

</body>
</html>