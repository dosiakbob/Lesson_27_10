<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>




<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="resources/style.css">
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

	<%-- ${ingredients} --%>

	<%-- 	<c:forEach var="ing" items="${ingredients}"> --%>
	<%-- 		${ing.name} --%>
	<!-- 		<br> -->
	<%-- 	</c:forEach> --%>



<div class="input-group input-group-lg">
  <span class="input-group-addon" id="sizing-addon1"></span>
  <input type="text" class="form-control" placeholder="IngredientName" aria-describedby="sizing-addon1">
</div>

 

<div class="input-group input-group-lg">
  <span class="input-group-addon" id="sizing-addon1"></span>
  <input type="text" class="form-control" placeholder="Password" aria-describedby="sizing-addon1">
</div>


	<c:forEach var="ing" items="${ingredients}">
		${ing.name} ${ing.amount}<a href="del/${ing.id }"> delete</a>
		<a href="update/${ing.id}"> update</a>
		<br>
	</c:forEach>

	<div style="text-align: center; margin-top: 20%">

		<form action="newIngredient" method="post">
			<input name="ingredientName" placeholder="ingredient name"> <br>

			<input name="ingredientAmount" placeholder="ingredientAmount">
			<br>
			<button>save ingredient</button>
		</form>
</body>
</html>