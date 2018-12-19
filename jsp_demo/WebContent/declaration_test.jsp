<html>
<body>
<%!
String s = "HELLO WORLD";

String makeItLower (String data){
	return data.toLowerCase();
}
%>

Lower case <%= s %>: <%= makeItLower(s) %>

</body>
</html>