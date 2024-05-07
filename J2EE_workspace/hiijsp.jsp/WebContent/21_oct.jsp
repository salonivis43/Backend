<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% out.println("------AIRTHMATIC OPERATORS USING =>SCRIPTLET TAG-------"); %>
<br/>
<br/>
 <% out.println("<b style='color:red'>DECLATION  TAG :<b/> you can write multiline java code in scriptlet tag. Toprint  output you have touse out.println method."); %>
        <br/>
        
        10+20:<%out.println(10+20);%>
        <br/>
        10-20:<%out.println(10-20);%>
        <br/>
        10*20:<%out.println(10*20);%>
        <br/>
        10/20:<%out.println(10/20); %>
        <br/>
         10%20:<%out.println(10%20); %>
         
       
        
        <br/>
        <%out.println( "----------LOOP THROUGH UDING =>SCRIPTLET TAG---------" );%>
           <br/>
           <br/>
           <ul>
           <% for(int i=1;i<=5;i++){
        	   out.println("<li/> I love JSP : "+i+"</li>");
           }
           %>
          
          </ul type="circle">
          <br/><br/>
          
          
          
           <% out .println("<b style='color:red'>DECLATION  TAG :<b/> you can define function and variable etc in declaration"); %>
        <br/>
        <%="---------DECALARATION TAG---------"%>
        <br>
        
        <br/>
        <%!
        String sayHello(){
        	return"Hello From Declation Tag";
        	
        }
        
        
        
        %>
        Declaration Tag's Greeting 
        
        
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