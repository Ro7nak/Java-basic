<html>
<head><title>Student confirmation</title></head>
<body>
The student is confirmed: ${param.firstName} ${param.lastName}
<br><br>
Favorite Programming language:
<ul>
<% 
String[] lang = request.getParameterValues("favlang");

for(String temp: lang){
	out.print("<li>"+ temp + "</li>");
}
%>
</ul>

</body>
</html>