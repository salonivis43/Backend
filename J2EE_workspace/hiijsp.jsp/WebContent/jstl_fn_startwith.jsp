<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL fn:startWith example</title>
</head>
<body>
<c:set var="str" value="This is exaple of JSTL function "/>


The String str starts with "This" :"${fn:startsWith(str,"This")}
<br>
The String str starts with "Function" :"${fn:startsWith(str,"Function")}


</body>
</html>