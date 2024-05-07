<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL fn:substring example</title>
</head>
<body>
<c:set var="str" value="This is Example of JSTL Function Tags"/>

<!-- ${fn:substring(str,10,26)} -->

<!-- ${fn:substring(str,"of")} -->


${fn:substringBefore(str,"of")}

<br>


</body>
</html>