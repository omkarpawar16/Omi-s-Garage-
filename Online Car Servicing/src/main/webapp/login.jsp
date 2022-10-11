<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link rel="stylesheet" href="login.css">
</head>
<body>
	<form action="loginController">
        <div class="form">
            <h2>Login Here</h2>
            <input type="text" name="email" placeholder="Enter Email here"><br>
            <input type="password" name="pass" placeholder="Enter Password here"><br>
            <button class="btnn"><a href="home.jsp">Login</a></button>

            <p class="link">Don't have an account<br>
            <a href="register.jsp">Sign up </a> here</a></p>
            <p class="liw">Log in with</p>

            <div class="icons">
                <a href="https://www.facebook.com/login/"><ion-icon name="logo-facebook"></ion-icon></a>
                <a href="https://www.instagram.com/accounts/login/"><ion-icon name="logo-instagram"></ion-icon></a>
                <a href="https://twitter.com/i/flow/login"><ion-icon name="logo-twitter"></ion-icon></a>
                <a href="https://accounts.google.com/"><ion-icon name="logo-google"></ion-icon></a>
                <a href="https://www.skype.com/en/"><ion-icon name="logo-skype"></ion-icon></a>
            </div>
        </div>
    </form>
    <script src="https://unpkg.com/ionicons@5.4.0/dist/ionicons.js"></script>
</body>
</html>