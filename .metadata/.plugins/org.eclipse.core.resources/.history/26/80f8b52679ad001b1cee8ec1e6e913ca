<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head><meta charset="UTF-8"><title>Add Appointment</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"></head>
<body>
<h1 align="center">Add Appointment is Created Successfully</h1>
<div class="col-md-10 text-right"><a class="btn btn-danger" href="home">Home</a></div><hr/>
   
	<table class ="col-md-6 table table-primary table-striped mx-auto">
	     <tr><th>Patient Name</th>
	        <th>Contact No</th>
	        <th>Age</th>
	        <th>Date of appointment</th>
	     </tr>
	    <c:forEach items="${requestScope.applist}" var="a"><tr>
			<td>${a.patientName}</td>
			<td>${a.contactNo}</td>
			<td>${a.age}</td>
			<td>${a.dateOfApp }</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>