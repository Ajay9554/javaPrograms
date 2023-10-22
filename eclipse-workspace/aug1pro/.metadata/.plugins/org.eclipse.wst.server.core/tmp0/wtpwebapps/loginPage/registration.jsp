<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="css/registration.css">
</head>
<body>
    <div class="container">
        <form id="signup-form" action="register" method="post">
            <h2>Sign Up</h2>
            <div class="form-group">
                <label for="username">Username:</label>
                <input type="text" id="username" name="name" required>
            </div>
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" required>
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" id="password" name="password" required>
            </div>
            <div class="form-group">
                <label for="confirm-password">Confirm Password:</label>
                <input type="password" id="confirm-password" name="confirm-password" required>
            </div>
            <div class="form-group">
                <label for="confirm-password"> Contact No:</label>
                <input type="text" id="confirm-password" name="contact" placeholder="Contact no" required>
            </div>
            <button type="submit">Sign Up</button>
        </form>
    </div>
    
    <script src="js/registrati.js"></script>
</body>
</html>


