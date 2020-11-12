<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.ghsoft.domain.LoginDTO" %>

<% 

	String id = request.getParameter("userId");
	String pw = request.getParameter("userPw");
	LoginDTO user = new LoginDTO();
	
	if(id.equals(user.getUserId()) || pw.equals(user.getUserPw())){
		String memberId = (String)session.getAttribute("userId");
	
%>
<html>
<head>
<meta charset="UTF-8">
<title>Login Check</title>
</head>
<body>
	
	<h1> You are in the member page!</h1>
    Welcome! 
</body>
</html>
<% }else {%>
<script>
	alert("Failed to Login");
</script>
history.go(-1);
<%} %>

