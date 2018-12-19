<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.java.bean.SampleBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Bean class use sample</title>
</head>
<body>
<jsp:useBean id="sampleBean" class="com.java.bean.SampleBean" scope="session">
	<jsp:setProperty name="sampleBean" property="param1" value="value1"/>
</jsp:useBean>

Sample Bean:<%= sampleBean %>

param1:<jsp:getProperty property="param1" name="sampleBean"/>
param2:<jsp:getProperty property="param2" name="sampleBean"/>
</body>
</html>