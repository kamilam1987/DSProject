<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Booking</title>
</head>
<body>
	<h1>Add Booking</h1>
	<form:form modelAttribute="booking">
		<table>
			<tr>
				<td>Time:</td>
				<td><form:input path="time"></form:input></td>
				<td><form:errors path="time" cssStyle="color: #ff0000;" /></td>
			</tr>

			<tr>
				<td>Customer id:</td>
				<td><form:input path="customer"></form:input></td>
				<td><form:errors path="customer" cssStyle="color: #ff0000;" /></td>
			</tr>

			<tr>
				<td>Booking from:</td>
				<td><form:input path="bookingfrom"></form:input></td>
				<td><form:errors path="bookingfrom" cssStyle="color: #ff0000;" /></td>
			</tr>
			<tr>
				<td>Booking to:</td>
				<td><form:input path="bookingto"></form:input></td>
				<td><form:errors path="bookingto" cssStyle="color: #ff0000;" /></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Add" /></td>
			</tr>

		</table>
	</form:form>
</body>
</html>