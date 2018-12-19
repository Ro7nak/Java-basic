<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.decryption.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
String enmsg = session.getAttribute("enmsg").toString();
%>
<body>
<form action="decryption.jsp">
<table>
<tbody>
<tr>
<td>
Encrypted msg: 
</td><td><%= enmsg %></td></tr>
<tr><td>Enter key to decrypt msg:</td>
<td><input type="number" value="" name="key"></td></tr>
</tbody>
</table>
<input type="submit" value="click to decrypt"/>
</form>
<br>
<% 
Decryption de= new Decryption();
String key = request.getParameter("key");
%>
<h1>Decryption is done and your msg is: <%= de.decryptionModule(enmsg,Integer.parseInt(key)) %></h1>
</body>
</html>