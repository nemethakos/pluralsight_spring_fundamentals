<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Attendee Page</title>
<link rel="stylesheet" href="css/style.css">
<style>
.error {
	color: #f00;
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

	<!-- Change Interceptor looking for the request parameter "language" -->
	Language:
	<a href="?language=en">English</a> |
	<a href="?language=es">Spanish</a>
	<a href="?language=de">German</a>

	<!-- In the course the "commandName" is used to reference the "event" bean, but that is not
	works with Spring MVC 5, use "modelAttribute" instead -->
	<form:form modelAttribute="attendee">
		<form:errors path="*" cssClass="errorblock" element="div" />
		<label for="name"><spring:message code="attendee.name" /></label>
		<form:input id="name" path="name" cssErrorClass="error" />
		<form:errors path="name" cssClass="error" />
		<br>

		<label for="emailAddress"><spring:message
				code="attendee.email.address" /></label>
		<form:input id="emailAddress" path="emailAddress"
			cssErrorClass="error" />
		<form:errors path="emailAddress" cssClass="error" />
		<br>

		<label for="phone"><spring:message
				code="attendee.phone" /></label>
		<form:input id="phone" path="phone"
			cssErrorClass="error" />
		<form:errors path="phone" cssClass="error" />
		<br>

		<input type="submit" class="btn" value="Enter Event" />
	</form:form>
</body>
</html>