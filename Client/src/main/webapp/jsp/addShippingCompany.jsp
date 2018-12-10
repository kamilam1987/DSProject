<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
				<td>Firstname:</td>
				<td><form:input path="firstname"></form:input></td>
			</tr>
			<tr>
				<td>Lastname:</td>
				<td><form:input path="lastname"></form:input></td>
			</tr>
			<tr>
				<td>Balance:</td>
				<td><form:input path="balance"></form:input></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Add" /></td>
			</tr>
		</table>
	</form:form>
	<a href="/">Home</a>
</body>
</html>