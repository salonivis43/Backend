<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<%out.println( "----------AIRTHMATIC OPERATOTRS UDING =>SCRIPTLET TAG---------" );%>
		<br>
		<%out.println("<b style='color:red'>SCRIPTLET TAG :</b> you canwrite multiline java code in scriptlet tag. to print output you have to use out.println()method ");%>
       
        10+20:<%out.println(10+20);%>
        <br>
        10-20:<%out.println(10-20);%>
        <br>
        10*20:<%out.println(10*20);%>
        <br>
        10/20:<%out.println(10/20); %>
        <br>
         10%20:<%out.println(10%20); %>
         <br><br>

        <%out.println( "----------LOOP THROUGH UDING =>SCRIPTLET TAG---------" );%>
        <br>
        <ul type="circle">
 		<% for(int i=1;i<=5;i++){
        	   out.println("<li/> I love JSP : "+i+"</li>");
         }
         %>
         </ul>
         <br>
         <%="---------RELATIONAL OPERATOR USING => EXPRESSION TAG---------"%>
         <br><br>
 		<%out.println("<b style='color:red'>EXPRESSION TAG :</b> you canwrite single line java code in expression tag. to print output by default ");%>    
        
		10>20:<%=10>20 %>
        <br/>
        10<20:<%=10<20 %>
        <br/>
        10<=20:<%=10<=20 %>
        <br/>
        10>=20:<%=10>=20 %>
        <br/>
        10%20:<%=10%20 %>
        <br/>
        
        10!=20:<%=10!=20 %>
        <br/>
        10==20:<%=10==20 %>
        <br/>

</body>
</html>