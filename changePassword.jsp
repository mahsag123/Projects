<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>change the password</title>
</head>
<body>
	<form action="http://localhost:8011/BankApp/ChangePassword">
	<table>
		<tr>
			<td><label>Old Password</label></td>
			<td><input type="password" name="OPW"/></td>
		</tr>
		<tr>
			<td><label>New Password</label></td>
			<td><input type="password" name="NPW"/></td>
		</tr>
		<tr>
			<td><label>Confirm New Password</label></td>
			<td><input type="password" name="CPW"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="SUBMIT"/></td>
		</tr>
	</table>
	</form>
</body>
</html>