<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>
</head>


<body>




	<sf:form modelAttribute="dish" action="newDish" method="post">

		<sf:input path="name" />
		<sf:input path="weight" />


		<select name="choosenIngredients" multiple="multiple">
			<option>choose ingredient</option>

			<c:forEach var="ingredient" items="${ingredients }">
				<option value="${ingredient.id}">${ingredient.name }${ ingredient.amount}</option>
			</c:forEach>
		</select>

		<sf:input path="name" />
		<button>save dish</button>

	</sf:form>

	<c:forEach var="dishRun" items="${dishes }">
	
		${dishRun }
		
		<c:forEach var="ing" items="${ dishRun.ingredients}">
		
		${ing.name}${ing.amount}
		</c:forEach>

		<br>
	</c:forEach>













	<!-- 	<form action="newDish" method="post"> -->
	<!-- 	<br><br> -->
	<!-- 		<input name="dishName" placeholder="dish name">  -->
	<!-- 		<input	name="dishWeight" placeholder="dish weight">  -->
	<!-- 		<select	name="choosenIngredients"> -->
	<!-- 			<option>choose ingredient</option> -->

	<%-- 			<c:forEach var="ingredient" items="${ingredients }"> --%>
	<%-- 				<option value="${ingredient.id}">${ingredient.name }${ ingredient.amount}</option> --%>

	<%-- 			</c:forEach> --%>



	<!-- 		</select> -->

	<!-- 	<button>save dish</button> -->
	<!-- 	</form> -->




</body>
</html>