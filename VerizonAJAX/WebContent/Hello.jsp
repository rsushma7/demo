<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function showHint(str)
{
var xmlhttp;
if(str.length==0)
{
document.getElementById("t").innerHTML="";
return;
}
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
xmlhttp.open("GET","GetData.jsp?q="+str,true);
xmlhttp.send();




}
</script>
</head>
<body>
<form>
FirstName:<input type="text" id="txt1" name="put" onkeyup="showHint(this.value)">
<br>
suggestions:<span id="t" ></span>
</form>

</body>
</html>