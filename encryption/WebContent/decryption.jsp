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
String key = request.getParameter("dekey");
Decryption de= new Decryption();
%>
<body>
<form action="decryption.jsp">
<table>
<tbody>
<tr>
<td>Encrypted msg was: </td>
<td><%= enmsg %></td>
</tr>
<tr></tr>
<tr>
<td>Decryption is done and your msg is: </td>
<td><%= de.decryptionModule(enmsg,Integer.parseInt(key)) %></td>
</tr>
</tbody>
</table>
</form>
<hr>
<form action="index.jsp">
<input value="Back" type="submit">
</form>
<br>
<hr>
</body>
</html>