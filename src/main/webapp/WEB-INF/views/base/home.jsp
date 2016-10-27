<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div style="text-align: center; margin-top: 20%">
		<sec:authorize access="hasRole('ROLE_ADMIN')">
			<a href="ingredient">ingredient</a>
			<br>
			<a href="dish">dish</a>
		</sec:authorize>
		<br> <a href="registration">registration</a> <br>
		<sec:authorize access="!isAuthenticated()">
			<a href="Login">Login</a>
		</sec:authorize>
		<sf:form action="Logout" method="post">
			<button>logout</button>
		</sf:form>
		
		
		<a href="getOrder">by dish</a>
		
</body>


</html>