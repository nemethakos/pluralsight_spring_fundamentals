
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Minutes Exercised</title>
<script src="https://code.jquery.com/jquery-3.3.1.js"
	integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
	crossorigin="anonymous"></script>
<script>
$(document).ready(()=>{
	$.getJSON('<spring:url value="activities.json"/>', {
		ajax: 'true'
	}, (data)=>{

		let html='<option value="">--Please select one--</option>';

		for (let item of data) {
			html += `<option value='\${item.desc}'>\${item.desc}</option>`;
		}
		$('#activities').html(html);
	});
});
</script>
<style>
.exerciseTable {
	width: 300px;
}

.exerciseTable, 
.exerciseTable th, 
.exerciseTable td {
	border: 1px solid grey;
	border-collapse: collapse;
}
</style>
</head>
<body>
	<h1>Add Minutes Exercised</h1>

	Language:
	<a href="?language=en">English</a> |
	<a href="?language=es">Spanish</a>

	<form:form modelAttribute="exercise">
		<table>
			<tr>
				<td><spring:message code="goal.text" /></td>
				<td><form:input path="minutes"></form:input></td>
				<td><form:select id="activities" path="activity"></form:select>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="Enter Exercise" /></td>
			</tr>
		</table>
	</form:form>
	<h1>Our goal for the day: ${goal.minutes}</h1>
	<a href="addGoal.html">Set new Goal!</a>

	<c:if test="${not empty exerciseList}">
		<table class="exerciseTable">
			<thead>
				<tr>
					<th>Activity
					<th>Minutes
			<tbody>
				<c:forEach items="${exerciseList}" var="exercise">
					<tr>
						<td>${exercise.activity}
						<td>${exercise.minutes}
				</c:forEach>
		</table>
	</c:if>

</body>
</html>