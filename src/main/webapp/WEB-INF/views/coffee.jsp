<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body background= https://d2t598j62c97z4.cloudfront.net/wp-content/uploads/2017/12/cup-of-coffee.jpg >
	
<center>
<br><br><br><br><br>
	<h2 style="color:blue">Some quick information...</h2>
<br><br><br>
 <form action="addnewcust" onsubmit="return validateInfo();">
		<font color="purple"> 
		<!--  First Name: <input id="firstname" type="text" name="firstName"> -->
First Name: <input type="text" name="id"> <br>
		</font> <br><br> <font color="blue"> 
		<!-- Last Name: <input id="lastname" type="text" name="lastName"> -->
Last Name: <input type="text" name="contName"> <br>
		</font> <br><br>
		<font color="green">
		<!--  Email: <input id="text" name="emailName"> -->
Email: <input type="text" name="compName"> <br>
		</font>
	 	<br><br>
		<font color="yellow">
		<!--  Username: <input type="text" name="userName"> -->
Username: <input type="text" name="title"> 
		</font>
		<br><br><br> 
		<font color="orange">
		<!-- Password: <input type="password" name="passName">-->
Password: <input type="password" name="passName"> 	
		</font>
		<br><br><br> 
		<font color="red">  
		<!--  Phone Number: <input type="tel" id="phone" name="userPhone"-->
Phone Number: <input type="text" name="phone" 
			placeholder="123-456-7890" pattern="[0-9]{3}-[0-9]{3}-[0-9]{4}"
			required /> 
		</font>
		<br><br><br><br>
			<input type="submit" value="Register">
	</form> 
</center>
	<script src="js/script.js">
		
	</script>

</body>
</html>