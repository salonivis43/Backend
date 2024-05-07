<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL c:redirect Tag example</title>
</head>
<body>
<c:set var="myurl" value="6"/>
<c:if test="${myurl<5}">
<c:redirect url="https://micronsol.com"/>
</c:if>
<c:if test="${myurl>5}">
<c:redirect url="https://google.com"/>
</c:if>

</body>
</html>