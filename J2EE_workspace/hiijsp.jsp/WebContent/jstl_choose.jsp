<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL choose </title>
</head>
<body>

	<c:set var="pricr1" value="12"/>
	<c:set var="pricr2" value="10"/>
	<c:set var="pricr3" value="222"/>
	
	<c:choose>
		<c:when test="${price2<=price2}">
		${"price1 is less then equal to price2"}
		</c:when>
		<c:when test="${price1<=price3}">
		${"price1 is less then equal to price3"}
		</c:when>
		<c:otherwise>
		${"price1 is largest"}
		</c:otherwise>
	</c:choose>

</body>
</html>