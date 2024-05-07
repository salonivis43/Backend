<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
         <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL fn:contains Tag Example</title>
</head>
<body>

<c:set var="preEmail" value="Abdul.pre@gmail.com"/>
<c:set var="currEmail" value="abdul.pre@gmail.com"/>

<c:if test="${fn:containsIgnoreCase(currEmail,preEmail)}">
<c:out value="New Email Must Be Different Than Previous Email"/>
</c:if>

</body>
</html>