<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="reg" method="post">
Name: <input type="text" name="name"><br><br>
Email:<input type="email" name="email"><br><br>
Password: <input type="password" name="password"><br><br>
Gender: <input type="radio" name="gender" value="Male">Male   <input type="radio" name="gender" value="Female">Female <br><br>
City: <select name="city">
<option>Select City</option>
<option>Delhi</option>
<option>Mumbai</option>
<option>Pune</option>
<option>Banglore</option>

</select><br><br>
<input type="submit" value="Register">
    

</form>



</body>
</html>