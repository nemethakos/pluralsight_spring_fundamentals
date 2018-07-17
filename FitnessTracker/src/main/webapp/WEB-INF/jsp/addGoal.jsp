<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Goal</title>
</head>
<body>
	<!--In the course 'commandName="goal"' is used 
		(instead of modelAttribute="goal"), but this 
		does not seem to work with Spring Web 5.0.7 -->
	<form:form modelAttribute="goal">
		<table>
			<tr>
				<td>Enter minutes:
				<td><form:input path="minutes" />
			<tr>
				<td colspan="2"><input type="submit" value="Enter Goal Minutes">
		</table>
	</form:form>
</body>
</html>