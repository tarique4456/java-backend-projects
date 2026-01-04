<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employe-Login</title>
</head>
<body>
		<h4>Employe-Login</h4>
		
		<div>
			<form action="empLogin" method="get">
			<label>USER-EMAIL</label><br>
			<input type="email" placeholder="enter your email" name="empEmail"><br>
			
			<label>USER-PASSWORD</label><br>
			<input type="password" placeholder="enter your password" name="empPassword"><br>
			
			<input type="submit" value="LOGIN"><br>
			</form>
		</div>

</body>
</html>