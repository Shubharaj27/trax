<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All the leads</title>
</head>
<body>
     <h2>Search Result....</h2>
     <table border="1">
			<tr>
			    <th>Id</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Lead Source</th>
				<th>Email</th>
				<th>Number</th>
			</tr>
			<c:forEach items="${leads}" var="lead">
				<tr>
					<td>${lead.id}</td>
					<td>${lead.firstName}</td>
					<td>${lead.lastName}</td>
					<td>${lead.leadSource}</td>
					<td>${lead.email}</td>
					<td>${lead.number}</td>
					<td><a href="delete?id=${lead.id}">Delete</a></td>
				</tr>
			</c:forEach>
     </table>
</body>
</html>