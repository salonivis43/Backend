<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
         <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL fn:escapeXml Example</title>
</head>
<body>

<h3>Message 1:</h3>
<b>This is a simple message</b>
<hr>
<br>
<h3>Message 2:</h3>
<i>This is an excapeXml example</i>
<br>
<br>
<b>Meessage-1 with fn:escapeXml():</b>${fn:escapeXml("<b>This is a Simple Message</b>")}
<br>
<b>Meessage-2 with fn:escapeXml():</b>${fn:escapeXml("<b>This is an escapeXml Example</b>")}


</body>
</html>