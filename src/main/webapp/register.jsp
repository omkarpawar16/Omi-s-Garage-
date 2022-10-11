<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
<link rel="stylesheet" href="register.css">
</head>
<body>
	<form action="registerController">
        <div class="form">
            <h2>Sign Up</h2>
            <input type="text" name="name" placeholder="Enter Your name"><br>
            <input type="text" name="mbNo" placeholder="Mobile Number"><br>
            <input type="text" name="addr" placeholder="Address"><br>
            <input type="text" name="eMail" placeholder="Email"><br>
            <input type="password" name="pass" placeholder="Enter Password"><br>
            <input type="password" name="rPass" placeholder="Repeat Passward"><br>
            <button class="btnn"><a href="login.jsp">Login</a></button>

            <p class="link">Already have an account<br>
            <a href="login.jsp">Login</a> here</a></p>
        </div>
    </form>
</body>
</html>