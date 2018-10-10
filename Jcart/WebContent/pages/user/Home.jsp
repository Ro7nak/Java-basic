<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JCart - User Home</title>
<link href=../../page-resources/styles/style.css media="screen"
	rel="stylesheet">
	<f:loadBundle var="lable" basename="com.infy.jcart.resources.Lang"/>
</head>
<body>
<%
	if(session.getAttribute("userId")==null || session.getAttribute("role").toString().charAt(0)!='U'){
		response.sendRedirect("../../faces/pages/errorPage.jsp");
	}
 %>

<f:view>



		<jsp:include page="../header.jsp"></jsp:include>
	<h:form prependId="false">
		<center>
	
				<div id="container">
				
				<!-- Left navigation pane links -->
				<div id="menu1">
			<jsp:include page="UserLeftToc.jsp"></jsp:include>
		</div>
		<!-- Right navigation pane links -->
		<div id="menu2">
			<jsp:include page="UserRightToc.jsp"></jsp:include>
		</div>
				<!-- Main body page for displaying details -->
				<div id="page">
				<H3><h:outputText value="#{lable.User_Home}"></h:outputText></H3>

				User Home</div>
				</div>
	
				
		</center>
		
	</h:form>
	<jsp:include page="../footer.jsp"></jsp:include>
</f:view>

</body>
</html>



