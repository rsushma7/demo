<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script>
function checkEno( )
{

 var no=0;
no=Integer.parseInt(request.getParameter("empno"));
document.write(no);

if(window.XMLHttpRequest)
{
xmlhttp=new XMLHttpRequest();
}
else
{
xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
}
xmlhttp.onreadystatechange=function()
{
if(xmlhttp.readyState==4 && xmlhttp.status==200)
{
document.getElementById("t").innerHTML=xmlhttp.responseText;
}
}
xmlhttp.open("GET","validate.jsp?q="+no,true);
xmlhttp.send();

}


</script>
</head>
<body>
<form name=form1 >
Enter the employee number:<input type="text" name="empno">
Enter the employee name:<input type="text" name="empname">
Enter the salary:<input type="text" name="salary">
<input type ="submit" onclick="checkEno()">
</form>
</body>
</html>