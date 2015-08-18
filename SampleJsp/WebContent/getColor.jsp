<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%! String color; %>
 <%color=request.getParameter("col");%>
  <%!char x=color.charAt(0); %>
 <%switch(x){
 case 'r' : %> <h1>Color is Red</h1> <%break;
 case 'b' : %> <h1>Color is Blue</h1> <%break; 
 
 }
 %>

</body>
</html>