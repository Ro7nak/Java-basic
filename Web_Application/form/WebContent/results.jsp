<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
String firstName = request.getParameter("first");
String lastName = request.getParameter("last");
String emailAddress = request.getParameter("email");
String gender = request.getParameter("gender");
String stateBorn = request.getParameter("state");

%>
<body>
<h1>User Information</h1>

<table border="1">
<tbody>

<tr>
<td>First Name:</td>
<td><%= firstName %></td>
</tr>

<tr>
<td>Last Name:</td>
<td><%= lastName %></td>
</tr>

<tr>
<td>Email:</td>
<td><%= emailAddress %></td>
</tr>

<tr>
<td>Gender:</td>
<td><%= gender %></td>
</tr>

<tr>
<td>State Born:</td>
<td><%= stateBorn %></td>
</tr>

</tbody>
</table>

</body>
</html>