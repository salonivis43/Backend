<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
         <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL fn:IndexOf Example</title>
</head>
<body>

${fn:indexOf("My Company Name is Micronsol ","Micronsol")}
${fn:indexOf("My Company Name is Micronsol ","is")}
${fn:indexOf("My Company Name is Micronsol ","Kanak Solution")}

</body>
</html>