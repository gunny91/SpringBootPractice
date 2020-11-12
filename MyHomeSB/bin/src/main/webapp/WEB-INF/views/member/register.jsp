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
<title>Member Registration</title>
</head>
<body>
	<h1>Member Registration!</h1>

	<div class="container-fluid">
		<form class="form-horizontal" method="post" action="/member/register">
			<div class="form-group">
				<div class="col-sm-2"></div>
				<div class="col-sm-6">
					<h2 align=left>Sign Up</h2>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2">ID</label>
				<div class="col-sm-2">
					<input type="text" class="form-control" id="userid" name="userid"
						maxlength=16 placeholder="Enter the ID">
				</div>
				<div class="col-sm-2">
					<button class="btn btn-info idCheck" type="button" id="idCheck"
						onclick="dupCheck();" value="N">Check ID</button>
				</div>
			</div>

			<!-- Password -->
			<div class="form-group">
				<label class="control-label col-sm-2">PW</label>
				<div class="col-sm-2">
					<input type="password" class="form-control" id="userpw"
						name="userpw" maxlength=16 placeholder="Enter the PW">
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2">Name</label>
				<div class="col-sm-2">
					<input type="text" class="form-control" id="name" name="name"
						maxlength=16 placeholder="Enter the Name">
				</div>
			</div>

			<div class="form-group">
				<div class="col-sm-offset-2 col=sm-4">
					<button class="btn btn-success" id="submit" type="submit">Submit</button>
					<button class="btn btn-warning cancel" type="reset">Cancel</button>
				</div>
			</div>
		</form>
	</div>


	<script>
		$(document).ready(function() {
			//cancel buttion pressed
			//$(요소이름) .class #id
			$(".cancel").on("click", function() {
				//	alert("Hello! You pressed cancel button")}
				location.href = "/member/login";
			});
			//when pressed member singup button
			$("#submit").on("click", function() {
				if($("#userid").val() ==""){
					alert("Please enther the id");
					$("#userid").focus();
					return false;
				}
				if($("#userpw").val() ==""){
					alert("Please enther the pw");
					$("#userpw").focus();
					return false;
				}
				if($("#name").val() ==""){
					alert("Please enther the name");
					$("#name").focus();
					return false;
				}
			});
		});



		//아이디 중복검사
		//입력한 아이디에 해당하는 정보가 있는지 검사하고, 결과값(정수)을 리턴받는다
		function dupCheck(){
			if($("#userid").val() ==""){
				alert("Please enther the id");
				$("#userid").focus();
				return false;
			}
	//alert("중복확인중입니다.");
	$.ajax({
		url: "/member/idCheck",
		type: "post",
		dataType: "json",
		data: {"userid" : $("#userid").val() },
		success: function(data) {
			if(data == 1){
				alert("이미사용중인 아이디입니다. \n다른아이디를 입력하세요");
				} else if(data == 0){
				$("#idCheck").attr("value", "Y");
				alert("사용가능한 아이디입니다.");
				}
			}
		});
}
	</script>



</body>
	</html>


</layoutTag:layout>
