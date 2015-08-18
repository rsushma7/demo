<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  
  
  <%
  String user=request.getParameter("uname");
  String pward=request.getParameter("pwd");
  if(user.equals("") || pward.equals("")){
		 %><h1>User Name and password shouldn't be empty</h1>
		 <%} 
  else if(user.equals("admin") && pward.equals("admin")){
	 %> 
	  <%@ page session="true" %>
	  <%session.setAttribute("uname","admin"); %>
	  <jsp:forward page="AdminPage.jsp"></jsp:forward>
	 
	 <%}else if(user.equals("sushma") && pward.equals("sushma"))
		 {%>
		 <%@ page session="true" %>
		  <%session.setAttribute("uname","sushma"); %>
		 <jsp:forward page="UserPage.jsp"></jsp:forward>
		  
		 <% }else{%>
		 <%@ page session="true" %>
		 <jsp:forward page="InvalidPage.jsp"></jsp:forward>
		  
		 <% }%>

</body>
</html>