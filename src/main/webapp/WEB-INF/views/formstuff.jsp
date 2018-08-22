<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Form Data2</title>

<link href="css/style.css" rel="stylesheet">

</head>
<body background= https://d2t598j62c97z4.cloudfront.net/wp-content/uploads/2017/12/cup-of-coffee.jpg >

<center>
<font color="red">
	<h1>Hello ${member}!</h1>
	<br>
	
	
	<form action="addnewcust">
First Name: <input type="text" name="id"> <br>
Last Name: <input type="text" name="contName"> <br>
Email: <input type="text" name="compName"> <br>
Username: <input type="text" name="title"> <br>
<!--  Password: <input type="text" name="passName"> <br>-->
Phone: <input type="text" name="phone"> <br>
<input type="submit" value="Add"> <br>
</form>
	
<table border="1">
	<c:forEach var="cust" items="${customers}">
		<tr>
			<td>${cust.firstName}</td>
			<td>${cust.lastName}</td>
			<td>${cust.emailName}</td>
			<td>${cust.userName}</td>
			<td>${cust.passName}</td>
			<td>${cust.phone}</td>
			<td><a href="update?id=${cust.customerID}">Update</a></td>
			<td><a href="delete?id=${cust.customerID}">Delete</a></td>
					
		</tr>
	
	</c:forEach>

</table>

<%-- <table border="1">
	<c:forEach var="cust" items="${customers}">
		<tr>
			<td>${cust.itemNum}</td>
			<td>${cust.itemName}</td>
			<td>${cust.itemDesc}</td>
			<td>${cust.itemQuan}</td>
			<td>${cust.itemPrice}</td>
			<td><a href="update?id=${cust.customerID}">Update</a></td>
			<td><a href="delete?id=${cust.customerID}">Delete</a></td>
					
		</tr>
	
	</c:forEach>

</table> --%>

</font>
</center>
	
</body>
</html>