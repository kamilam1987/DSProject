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
<title>Booking</title>
</head>
<body>
	<h1>Booking</h1>
	<table>
		<tr>
			<th>Id</th>
			<th>Booking Time</th>
			<th>Car</th>
			<th>Customer</th>
			<th>Booking From</th>
			<th>Booking To</th>
		</tr>
			<tr>
				<td>${booking.id}</td>
				<td>${booking.time}</td>
				<td>${booking.car.id} ${booking.car.model} ${booking.car.make}</td>
				<td>${booking.customer.firstname} ${booking.customer.lastname}</td>
				<td>${booking.bookingfrom}</td>
				<td>${booking.bookingto}</td>
			</tr>
	</table>
</body>
</html>