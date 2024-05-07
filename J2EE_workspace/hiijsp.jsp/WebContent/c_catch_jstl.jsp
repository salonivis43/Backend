<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
int n1=10;
int n2=5;

%>

<c:catch var="errmsg">
<%=n1/n2 %>
</c:catch>

<c:if test="${errmsg!=null }">
	<p>There is a division error : ${errmsg } </p>
	

</c:if>





</body>
</html>