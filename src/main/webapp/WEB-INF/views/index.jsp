<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Coffee Shop</title>
</head>
<body background= https://d2t598j62c97z4.cloudfront.net/wp-content/uploads/2017/12/cup-of-coffee.jpg >

<center>

<font color= "red">
<h1 style="text-align:center;"> Welcome to</h1>

<h1 style="text-align:center;">Matthew's Coffee Shop!</h1>
</font>
<br>
<font color= "yellow">
<h1>HOT COFFEE! </h1>
</font>
<br>
<font color= "white">
<h3>Red Velvet - 4.00</h3>
<h3>Chocolate - 3.50</h3>
<h3>Strawberry - 3.00</h3>
<h3>Vanilla - 3.75</h3>
<h3>Coffee Crumble - 3.50</h3>
<br><br>
<font color= "yellow">
<h1>PASTRIES! </h1>
</font>
<br>
<h3>Glazed Donut - 4.00</h3>
<h3>Apple Pie - 4.75</h3>
<h3>Birthday Cake - 2.50</h3>
<h3>Cinnamon Bun - 3.00</h3>
<h3>Churros - 2.00</h3>
</font>

<br><br>

<font color="yellow">Would you like to Register for discounts?</font>

<a href="/coffee">Register</a>
<br><br><br>

 <form action="addnewcust">
Order Number: <input type="text" name="itemID"> <br>
Name: <input type="text" name="Name"> <br>
Description: <input type="text" name="id"> <br>
Quantity: <input type="text" name="id"> <br>
Price: <input type="text" name="id"> <br>
</form>

<table border="1">
	<c:forEach var="item" items="${items}">
		<tr>
			<td>${item.itemID}</td>
			<td>${item.Name}</td>
			<td>${item.description}</td>
			<td>${item.quantity}</td>
			<td>${item.price}</td>
			<td><a href="update?id=${item.Name}">Update</a></td>
			<td><a href="delete?id=${item.Name}">Delete</a></td>
					
		</tr>
	
	</c:forEach>

</table>
<br><br><br><br><br><br>




</center>
	
	
	<script src="js/script.js"></script>

</body>
</html>