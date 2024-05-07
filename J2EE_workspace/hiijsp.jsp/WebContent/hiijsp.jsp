<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Time on Server</title>
    </head>
    <body>
       
        
        <!-- Scriptlet Tag -->
        10+20:<%out.println(10+20); %>
        <br/>
        <!-- Expression -->
        <%="----------airthmatic operator------" %>
        10+20:<%=10+20 %>
        <br/>
        10-20:<%=10-20 %>
        <br/>
        10*20:<%=10*20 %>
        <br/>
        10/20:<%=10/20 %>
        <br/>
        <%= "----------RELATIONAL OPERATOR---------" %>
           <br/>
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