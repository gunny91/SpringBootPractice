<%@ page session="true"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Sign In</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="/">Sample WebSite</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="/">Home</a></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Page 1 <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="#">Page 1-1</a></li>
						<li><a href="#">Page 1-2</a></li>
						<li><a href="#">Page 1-3</a></li>
					</ul></li>
				<li><a href="#">Page 2</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="/user/signUp"><span
						class="glyphicon glyphicon-user"></span> Sign Up</a></li>
				<li><a href="/user/signIn"><span
						class="glyphicon glyphicon-log-in"></span> Login</a></li>
			</ul>
		</div>
	</nav>



	<div class="container center">
			<form class="form-horizontal" method="post" action="/user/logIn"
			id="loginForm">
		<h1>Sign In Page</h1>			
				<!-- 로그인을 하지 않고 들어온 경우 : 로그인할 자료를 입력을 할 수 있게 한다. -->
			<c:if test="${member == null}">
				<div class="form-group">
					<div class="col-sm-2"></div>
					<div class="col-sm-6">
						<h2 align="left">Login</h2>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2">ID</label>
					<div class="col-sm-2">
						<input type="text" class="form-control" id="userid" name="userId"
							maxlength=16 placeholder="Enter the ID" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2">PW</label>
					<div class="col-sm-2">
						<input type="password" class="form-control" id="userpw"
							name="userPw" maxlength="16" placeholder="Enter PW." />
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-4">
						<button class="btn btn-success" type="submit" id="submit">Login</button>
						<button class="cancel btn btn-danger" type="reset">Cancel</button>
						<button class="btn btn-info" type="button" id="memberRegisterBtn">Sing Up</button>
						
					</div>
				</div>
			</c:if>
			<!-- 세션을 체크하기 위해서는 상단에 page session을 true로 설정해야 한다. -->
			<!-- 정상적으로 로그인을 하여 세션값을 받아온 경우 -->
			<c:if test="${member != null}">
				<div>
					<p>
					<h2>${member.userId}님환영합니다.</h2>
					</p>
					<button id="memberUpdateBtn" type="button">Revise Info</button>
					<button id="logoutBtn" type="button">Log Out</button>
					<button class="btn btn-info" type="button" id="memberDeleteBtn">Sign Out</button>
				</div>
			</c:if>
			<c:if test="${msg == false}">
				<div class="form-group">
					<div class="col-sm-8">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-8">
						<div style="background-color: #CF0; color: red;">
							<h3>Login Failed</h3>
						</div>
					</div>
				</div>
			</c:if>
			</form>
		</div>
	</div>
	
	
		<script>
		$(document).ready(function() {
			// 로그인 버튼을 눌렀을 경우
			$("#submit").on("click", function() {
				if ($("#userid").val() == "") {
					alert("Enter ID");
					$("#userid").focus();
					return false;
				}
				if ($("#userpw").val() == "") {
					alert("enter Password");
					$("#userpw").focus();
					return false;
				}
				// document.getElementById("loginForm").submit();
				//return false; 이부분은 필요없다.
			});


			//when logout btn pressed
			$("#logoutBtn").on("click",function(){
				location.href="/user/logout";
				
			});


			//when sign up btn pressted
			$("#memberRegisterBtn").on("click",function(){
				location.href="/user/signUp";
			});

			//when pressed the revision btn
			$("#memberUpdateBtn").on("click",function(){
				location.href="/user/memberUpdate";
			});

			//when pressed the revision btn
			$("#memberDeleteBtn").on("click",function(){
				location.href="/user/memberDelete";
			});
		})
	</script>
	
</body>





</html>