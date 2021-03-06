<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Users Udate</title>
</head>
<body>
	
<table border="1">
<tr>
<td>User Id</td>
<td>User Name</td>

</tr>
<%
try{
resultSet = request.getParameter("result");
while(resultSet.next()){
%>
<form action="user" method="post">
<tr>
<td><input type="text" id="userId" name="userId" value="<%=resultSet.getString("userId") %>"></td>
<td><input type="text" id="firstName" name="firstName" value="<%=resultSet.getString("firstName") %>"></td>
<td><input type="submit" value="user" /></td> 
</tr>

</form>
<%
}
%>
</table>
	
</body>
</html>