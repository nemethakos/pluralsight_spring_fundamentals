<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Goal</title>

<style>
.error {
	color: #f00
}

.errorblock {
	color: #000;
	background-color: #fee;
	border: 3px solid #f00;
	padding: 8px;
	margin: 16px;
}
</style>

</head>
<body>
	<!--In the course 'commandName="goal"' is used 
		(instead of modelAttribute="goal"), but this 
		does not seem to work with Spring Web 5.0.7 -->
	<form:form modelAttribute="goal">
		<form:errors path="*" cssClass="errorblock" element="div"/>
		<table>
			<tr>
				<td>Enter minutes:
				<td><form:input path="minutes" cssErrorClass="error"/>
				<td><form:errors path="minutes" cssClass="error"/>
			<tr>
				<td colspan="3"><input type="submit" value="Enter Goal Minutes">
		</table>
	</form:form>
</body>
</html>