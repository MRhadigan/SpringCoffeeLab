<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body style="background-color: gray;">
	

		<h4 style="color:blue">Please fill the form to register!</h4>


	<form action="userinfo" onsubmit="return validateInfo();">
		<font color="green"> First Name: <input id="firstname"
			type="text" name="firstName">
		</font> <br> <font color="blue"> Last Name: <input id="lastname"
			type="text" name="lastName">
		</font> <br>


		<!--  <form action="userinfo2"> -->
		<font color="purple">
		Email: <input id="text" name="emailName">
		</font>
	 	<br>
	
		<font color="orange">
		Username: <input type="text" name="userName">
		</font>
		<br> 
		<font color="yellow">
		Password: <input type="password" name="passName">
		</font>
		<br> 
		<font color="red">  
		Phone Number: <input type="tel" id="phone" name="lastname"
			placeholder="123-456-7890" pattern="[0-9]{3}-[0-9]{3}-[0-9]{4}"
			required /> 
		</font>
		<br>
			<input type="submit" value="Register">
		
	</form>

	<script src="js/script.js">
		
	</script>

</body>
</html>