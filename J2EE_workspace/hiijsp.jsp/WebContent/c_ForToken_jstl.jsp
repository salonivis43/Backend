 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL forToken tag in JSTL</title>
</head>
<body>

<c:forTokens items="hhhp://.www.micronsol.com" delims="." var="x">
<c:out value="${x}"/><br>

</c:forTokens>

</body>
</html>










