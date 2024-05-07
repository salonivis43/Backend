<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
         <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL fn:split Example</title>
</head>
<body>

	<c:set var="str" value="We are learning JSTL Programming"/>
	
	<c:set var="arrayofstr" value="${fn:split(str,' ')}"/>
	
	
	
	<c:forEach var="im" begin="0" end="4">
	arrayofstr[${i}]:${arrayofstr[i]}<br>
	</c:forEach>
	
	

</body>
</html>