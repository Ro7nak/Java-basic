<html>
<head>
<title>Confirmation</title>
</head>
<%
// read form data
String favlang = request.getParameter("favlang");

//create the cookie
Cookie theCookie = new Cookie("myApp.favlang", favlang);

//set the life span
theCookie.setMaxAge(60*60*24*365);

//send cookie to browser
response.addCookie(theCookie);

%>
<body>

Thanks! we set your favorite language to: ${param.favlang}

<br><br>

<a href="cookies_homepage.jsp">Return to homepage.</a>

</body>
</html>