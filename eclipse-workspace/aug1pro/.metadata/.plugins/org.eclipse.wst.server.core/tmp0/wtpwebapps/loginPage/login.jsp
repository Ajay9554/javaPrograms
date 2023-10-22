<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	
 
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/login.css">
</head>
<body>
	<div class="container">
		<form id="signin-form">
			<h2>Sign In</h2>
			<div class="form-group">
				<label for="email">Email:</label> <input type="email" id="email"
					name="email" required>
			</div>
			<div class="form-group">
				<label for="password">Password:</label> <input type="password"
					id="password" name="password" required>
			</div>
			 
			<button type="submit">Sign In</button>
			<button type="submit"><a href="registration.jsp">Sign Up</a></button>
			
		</form>
	</div>

	<script src="js/login.js"></script>
</body>
</html>