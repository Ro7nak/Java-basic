<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Simple form demo</title>
</head>
<body>
<h1>Simple form demo</h1>
<form name="myForm" action="results.jsp" method="post">
<table>
<tbody>

<tr>
<td>First name:</td>
<td><input type="text" name="first" value="" size="50"></td>
</tr>

<tr>
<td>Last name:</td>
<td><input type="text" name="last" value="" size="50"></td>
</tr>

<tr>
<td>Email Address:</td>
<td><input type="text" name="email" value="" size="50"></td>
</tr>

<tr>
<td>Gender:</td>
<td>
<input type="radio" name = "gender" value = "Male"/>Male
<input type="radio" name = "gender" value = "Female"/>Female
</td>
</tr>

<tr>
<td>Where were you born?:</td>
<td>
<select name="state">
<option value="">choose a option</option>
<option value="MH">Maharashtra</option>
<option value="MP">MP</option>
<option value="other">Other</option>
</select>
</td>
</tr>

</tbody>
</table>

<input type="reset" value = "Clear" name="clear"/>
<input type="submit" value = "Submit" name="submit"/>

</form>
</body>
</html>