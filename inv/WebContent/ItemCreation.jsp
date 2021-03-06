<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create User</title>
</head>
<body>
	<h1>Fill the User Details</h1>
	<form action="addItem" method="post">
		<table>
			<tr>
				<td>Item Name:</td>
				<td><input type="text" name="itemName" required="true" size="20" required="true"></td>
			</tr>
			<tr>
				<td>Item Image:</td>
				<td><input type="text" name="itemImage" size="20" required="true"></td>
			</tr>

			<tr>
				<td>Item Category:</td>
				<td><select name="itemCategory">
						<option value="Electronic">Electronic</option>
						<option value="Pantry">Pantry</option>
						<option value="Medicine">Medicine</option>
				</select></td>
			</tr>

			<tr>
				<td>Item Quantity:</td>
				<td><input type="number" name="itemQuantity" required="true"></td>
			</tr>

			<tr>
				<td>Item Unit:</td>
				<td><input type="number" name="itemUnit" required="true"></td>
			</tr>

			<tr>
				<td>Item Unit Price:</td>
				<td><input type="number" name="itemUnitPrice" required="true"></td>
			</tr>


			<tr>
				<td>Item Status:</td>
				<td><select name="itemStatus">
						<option value="1">AWAITING_APPROVAL</option>
						<option value="2">APPROVED</option>
				</select></td>
			</tr>

		</table>
		<input type="submit" value="Add Item"  />
	</form>
	
</body>
</html>