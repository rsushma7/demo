<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
int no=Integer.parseInt(request.getParameter("no"));
Class.forName("oracle.jdbc.OracleDriver");
String url="jdbc:oracle:thin:@localhost:1521:orcl";
Connection con=DriverManager.getConnection(url,"scott","tiger");
String s="select empno from employee";
Statement st=con.createStatement();
ResultSet rs=st.executeQuery(s);
while(rs.next())
{
if(rs.getInt(1)==no)
{
 %>
 	<h1>Already present</h1>
 <%}else{
 %>
	<h1>Insert</h1>
<%} 
}%>
</body>
</html>