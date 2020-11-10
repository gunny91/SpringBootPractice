<%@ page session="true"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="layoutTag" tagdir="/WEB-INF/tags"%>
<layoutTag:layout>

	<!DOCTYPE html>
	<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>

	<div class="container">
		<form class="form-horizontal" method="post" action="/member/login"
			id="loginForm">
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
						<input type="text" class="form-control" id="userid" name="userid"
							maxlength=16 placeholder="Enter the ID" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2">PW</label>
					<div class="col-sm-2">
						<input type="password" class="form-control" id="userpw"
							name="userpw" maxlength="16" placeholder="Enter PW." />
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
					<h2>${member.userid}님환영합니다.</h2>
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
				location.href="/member/logout";
				
			});


			//when sign up btn pressted
			$("#memberRegisterBtn").on("click",function(){
				location.href="/member/register";
			});

			//when pressed the revision btn
			$("#memberUpdateBtn").on("click",function(){
				location.href="/member/memberUpdate";
			});

			//when pressed the revision btn
			$("#memberDeleteBtn").on("click",function(){
				location.href="/member/memberDelete";
			});
		})
	</script>

</body>
	</html>
</layoutTag:layout>












