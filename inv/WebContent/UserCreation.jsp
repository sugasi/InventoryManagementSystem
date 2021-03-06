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
	<form action="addUser" method="post">
		<table>
			<tr>
				<td>Salutation:</td>
				<td><select name="salutation">
						<option value="Mr.">Mr.</option>
						<option value="Ms.">Ms.</option>
						<option value="Mrs.">Mrs.</option>
				</select></td>
			</tr>

			<tr>
				<td>First Name:</td>
				<td><input type="text" name="firstName" required="true" size="20" required="true"></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><input type="text" name="lastName" size="20" required="true"></td>
			</tr>

			<tr>
				<td>Gender:</td>
				<td><select name="gender">
						<option value="Male">Male</option>
						<option value="Female">Female</option>
						<option value="TransGender">TransGender</option>
				</select></td>
			</tr>

			<tr>
				<td>Mobile:</td>
				<td><input type="number" name="mobile" maxlength="10"  required="true"></td>
			</tr>

			<tr>
				<td>Email:</td>
				<td><input type="text" name="email" size="40" required="true"></td>
			</tr>

			<tr>
				<td>Address:</td>
				<td><input type="address" name="address" size="20" required="true"></td>
			</tr>

			<tr>
				<td>Role:</td>
				<td><select name="role">
						<option value="Admin">Admin</option>
						<option value="Customer">Customer</option>
						<option value="Retailer">Retailer</option>
				</select></td>
			</tr>

			<tr>
				<td>Status:</td>
				<td><select name="status">
						<option value="AWAITING_APPROVAL">AWAITING_APPROVAL</option>
						<option value="APPROVED">APPROVED</option>
				</select></td>
			</tr>

		</table>
		<input type="submit" value="Add User"  />
	</form>
	
</body>
</html>