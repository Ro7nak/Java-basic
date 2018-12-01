<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Encryption module</title>
</head>
<body>
<h1>Encryption module</h1>
<form name ="encryptionModule" action="result.jsp" method="post">
<table>
<tbody>
<tr>
<td>Enter message to encrypt:</td>
<td><input type="text" size="50" name = "msg" value=""></td>
</tr>
<tr>
<td>Enter key to encrypt:</td>
<td><input type="number" size="50" name = "key" value=""></td>
</tr>
</tbody>
</table>
<input type="submit" value="Encrypt" name="submit" />
</form>
</body>
</html>