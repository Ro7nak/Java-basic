<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.encrytion.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Encryption method</title>
</head>
<%
String msg = request.getParameter("msg");
int key = Integer.parseInt(request.getParameter("key"));
%>
<body>
<h1>you msg is: </h1>
<%
Encryption en = new Encryption();
String result = en.encryptionModule(msg, key);
session.setAttribute("enmsg", result);
out.print(result);
%>
<br><hr>
<form action="decryption.jsp">
<table><tbody>
<tr><td>Enter decryption key:</td>
<td><input type="number" value="" name = "dekey" size="50"></td></tr>
</tbody></table>
<input type="submit" name="submit" value="Decryption">
</form>
</body>
</html>