<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>transfer</title>
</head>
<body>
	<form action="http://localhost:8011/BankApp/Transfer">
	<table>
		<tr>
			<td><label>Third Party Account No</label></td>
			<td><input type="text" name="TPAC"></td>
		</tr>
		<tr>
			<td><label>Amount</label></td>
			<td><input type="text" name="AMT"></td>
		</tr>
		<tr>
			<td><input type="submit" value="SUBMIT"></td>
		</tr>
	</table>
	</form>
</body>
</html>