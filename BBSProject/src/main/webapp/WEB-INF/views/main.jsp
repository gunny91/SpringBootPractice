<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Main</title>
	<%@ include file="include/header.jsp" %>
</head>
<body data-spy="scroll" data-target=".navbar" data-offset="50">
	<%@ include file="include/topmenu.jsp" %>
	
	<h1> ${message}님  welcome!</h1>
	<h1>This is Main !!!!!</h1>
	
	<%@ include file="include/footer.jsp" %>
</body>
</html>