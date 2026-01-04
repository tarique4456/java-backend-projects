<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employe-Register</title>
</head>
<body>
<div>
	<form action="employeRegister" method="get">
	<label>EMPID:</label><br>
	<input type="text" placeholder="Enter Emp id" name="empid"><br>
	
	<label>EMPNAME:</label><br>
	<input type="text" placeholder="Enter Emp Name" name="empName"><br>
	
	<label>EMPEMAIL:</label><br>
	<input type="email" placeholder="Enter Emp email" name="empEmail"><br>
	
	<label>EMPPASSWORD:</label><br>
	<input type="text" placeholder="Enter Emp password" name="empPassword"><br>
	
	<label>EMPPhone:</label><br>
	<input type="tel" placeholder="Enter Emp phone" name="empPhone"><br>
	
	<label>EMPDOJ:</label><br>
	<input type="date" name="empDOJ"><br>
	
	<label>EMPDesignation:</label><br>
	<input type="tel" placeholder="Enter Emp designation" name="empDesignation"><br>
	
	<label>GENDER:</label><br>
	<input type="radio" value="MALE" name="gender">MALE
	<input type="radio" value="FEMALE" name="gender">FEMALE
	<input type="radio" value="OTHER" name="gender">OTHER <br>	
	<input type="submit" value="Register">
	 
	</form>
</div>

</body>
</html>