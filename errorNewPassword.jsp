<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Password and Confirm Password fields does not match. Try again!!!</h1>
<form action="http://localhost:8011/BankApp/NewPassword">
<table>
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
</body>
</form>
</body>
</html>