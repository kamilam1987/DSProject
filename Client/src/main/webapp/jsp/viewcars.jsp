<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="/css/style.css" rel="stylesheet"></link>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cars</title>
</head>
<body>
	<h1>Cars</h1>
	<table>
		<tr>
			<th>Id</th>
			<th>Model</th>
			<th>Make</th>
		</tr>
			<tr>
				<td>${car.id}</td>
				<td>${car.model}</td>
				<td>${car.make} </td>
			</tr>
	</table>
</body>
</html>