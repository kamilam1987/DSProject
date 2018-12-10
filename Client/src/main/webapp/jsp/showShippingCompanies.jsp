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
<title>List of Shipping Companies</title>
</head>
<body>
	<h1>Shipping Companies</h1>
	<table>
		<tr>
			<th>Name</th>
			<th>Home Port</th>
			<th>Balance</th>
			<th>Ships</th>
		</tr>
		<c:forEach items="${shippingCompany}" var="shippingCompanies">
			<tr>
				<td>${shippingCompanies.name}</td>
				<td>${shippingCompanies.homePort}</td>
				<td>${shippingCompanies.balance}</td>
				<td>
					<ul>
						<c:forEach items="${shippingCompanies.ships}" var="ship">
							<li>${ship.name}&nbsp${ship.metres}&nbsp${ship.cost}</li>

						</c:forEach>
					</ul>
				</td>
			</tr>
		</c:forEach>
	</table>
	<a href="/">Home</a>
</body>
</html>