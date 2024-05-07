<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL fn:length() example</title>
</head>
<body>
<c:set var="str1" value="This is First String"/>
<c:set var="str2" value="Apple"/>
<c:set var="str3" value="Iron Man"/>

Length of str1 is:${fn:length(str1)}
<br>
Length of str2 is:${fn:length(str2)}
<br>
Length of str3 is:${fn:length(str3)}
<br>


</body>
</html>