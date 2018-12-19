<html>
<head><title>Student confirmation</title></head>
<body>
The student is confirmed: ${param.firstName} ${param.lastName}
<br><br>
Favorite Programming language: <%= request.getParameter("favlang") %>

<!-- Favorite Programming language: ${param.favlang} -->

</body>
</html>