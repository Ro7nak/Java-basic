<html>
<head>
<title></title>
</head>

<body>
<h3>Training Portal</h3>
<%
// the default
String favlang= "JAVA";

// get the cookies from browser
Cookie[] theCookies = request.getCookies();

//find out fav language
if(theCookies!=null){
	for(Cookie temp:theCookies){
		if("myApp.favlang".equals(temp.getName())){
			favlang = temp.getValue();
		}
	}
}

%>

<h4>New Books for <%=favlang %></h4>
<ul>
<li>blah blah</li>
<li>blah blah</li>
</ul>

<h4>Latest News Report for <%=favlang %></h4>
<ul>
<li>blah blah</li>
<li>blah blah</li>
</ul>

<h4>Hot Jobs for <%=favlang %></h4>
<ul>
<li>blah blah</li>
<li>blah blah</li>
</ul>
<hr>
<a href="cookies_personalize_form.html">Personalize this Page</a>
</body>
</html>