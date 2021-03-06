<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Items List</title>
</head>
<body>
	
<table border="1">
<tr>
<td>Item Id</td>
<td>Item Name</td>

</tr>
<%
try{
resultSet = request.getParameter("result");
while(resultSet.next()){
%>
<form action="item" method="post">
<tr>
<td><input type="text" id="itemId" name="itemId" value="<%=resultSet.getString("itemId") %>"></td>
<td><input type="text" id="itemName" name="itemName" value="<%=resultSet.getString("itemName") %>"></td>
<td><input type="submit" value="item" /></td> 
</tr>

</form>
<%
}
%>
</table>
	
</body>
</html>