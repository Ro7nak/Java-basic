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

<form action="decryption.jsp">
<input type="submit" name="submit" value="Decryption">
</form>
</body>
</html>