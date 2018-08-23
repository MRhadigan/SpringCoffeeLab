<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Form Data2</title>

<link href="css/style.css" rel="stylesheet">

</head>
<body background= https://d2t598j62c97z4.cloudfront.net/wp-content/uploads/2017/12/cup-of-coffee.jpg >

<center>
	<br>
<table border="1">
	<c:forEach var="cust" items="${users}">
		<tr>
			<td>${cust.firstName}</td>
			<td>${cust.lastName}</td>
			<td>${cust.emailName}</td>
			<td>${cust.userName}</td>
			<td>${cust.passName}</td>
			<td>${cust.phone}</td>
			<td><a href="update?id=${cust.emailName}">Update</a></td>
			<td><a href="delete?id=${cust.emailName}">Delete</a></td>
					
		</tr>
	
	</c:forEach>

</table>
</center>
	
</body>
</html>