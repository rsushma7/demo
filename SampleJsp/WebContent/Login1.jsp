<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./Update">
  Enter your account number : <input type="text" name="num"> <br>
  Select the transaction type:
<select name="type">
  <option value="Deposit">Deposit</option>
  <option value="Withdraw">Withdraw</option>
</select><br>
  Enter the amount : <input type="text" name="amt"> <br>
  <input type="submit">
 </form>
</body>
</html>