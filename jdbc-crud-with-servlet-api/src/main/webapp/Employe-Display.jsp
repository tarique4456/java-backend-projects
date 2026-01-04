
<%@page import="com.servlet.jdbc_crud_with_servlet_api.dto.Employe"%>
<%@page import="com.servlet.jdbc_crud_with_servlet_api.dao.EmployeDao"%>
<%@ page import="java.util.List" %> 

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<h2 style=color:green align="center">Welcome To Display Page</h2>
	
	<%
		List<Employe> employees=new EmployeDao().fetchAllEmployDataDao();	
	%>
	
	<div>
		<table border="4"  style=padding:8px align="center">
			<tr style=color:blue  align="center" >
				<th >ID</th>
				<th>NAME</th>
				<th>EMAIL</th>
				<th>PHONE</th>
				<th>DOJ</th>
				<th>DESIGNATION</th>
				<th>GENDER</th>
				<th colspan="2">ACTION</th>
			</tr>
				
				<%for(Employe employe:employees){ %>
				
				<tr align="center">
				
					<td style=padding:8px><%=employe.getId() %></td>
					<td style=padding:8px><%=employe.getName() %></td>
					<td style=padding:8px><%=employe.getEmail() %></td>
					<td style=padding:8px><%=employe.getPhone() %></td>
					<td style=padding:8px><%=employe.getDoj() %></td>
					<td style=padding:8px><%=employe.getDesignation() %></td>
					<td style=padding:8px><%=employe.getGender()%></td>
					<td  ><a style=color:red href="delete?id=<%=employe.getId()%>" onclick="return confirm('Are you sure you want to delete this employee?');">DELETE</a></td>
					<td ><a style=color:green href="edit">EDIT</a></td>
		
				</tr>
				<%} %>
				
		</table>
	
	</div>

</body>
</html>