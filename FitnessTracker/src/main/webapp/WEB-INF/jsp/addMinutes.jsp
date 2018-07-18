
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Minutes Exercised</title>
</head>
<body>
	<h1>Add Minutes Exercised</h1>
	
	Language: <a href="?language=en">English</a> | <a href="?language=es">Spanish</a>
	
	<form:form modelAttribute="exercise">
		<table>
			<tr>
				<td><spring:message code="goal.text"/></td>
				<td><form:input path="minutes"></form:input></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Enter Exercise" /></td>
			</tr>
		</table>
	</form:form>
	<h1>Our goal for the day: ${goal.minutes}</h1>
	<a href="addGoal.html">Set new Goal!</a>
</body>
</html>