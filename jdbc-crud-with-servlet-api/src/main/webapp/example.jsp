
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="color:red">
	<%
		int a=10;
		
		if(a%10==0){
			System.out.println("Even Number");
			out.print("Even Number");
		}else{
			System.out.println("Odd Number");
			out.print("Odd Number");
		}
	%>
	
	<%for (int i=9;i<=20;i++) {
		if(i%2==0){
	%>
	<h2 style="color:green;"><%=i %></h2>
	
	<%}else {%>
	
	<h2 style="color:blue;"><%=i %></h2>
	
	<%}} %>
	
	<%!
	public int addTwoNumber(int a ,int b){
		
		return a+b;
	}
	%>
	
	<%int sum=addTwoNumber(15,40); %>
	<h2>Sum of two Number=<%=sum %></h2>
	<h2>sum of two number=<%=addTwoNumber(40,20) %></h2>
	



</body>
</html>