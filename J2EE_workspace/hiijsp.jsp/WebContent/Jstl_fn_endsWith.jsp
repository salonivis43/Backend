<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL fn:endWith example</title>
</head>
<body>
<c:set var="str" value="This is exaple of JSTL function "/>


The String str ends with "This" :"${fn:endsWith(str,"This")}
<br>
The String str ends with "Function" :"${fn:endsWith(str,"function")}


</body>
</html>