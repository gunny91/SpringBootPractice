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
					<button class="btn btn-primary signUpBtn" type="submit" disabled="disabled">SingUp(Ajax)</button>
					<button class="btn btn-warning cancel" type="reset">Cancel</button>
				</div>
			</div>

			<!-- Message Area -->
			<div class="from-group">
				<div class="col-sm-offset-2 col-sm-10">
					<input type="text" class="form-controll msg" name="msg" id="msg"
						placeholder="Message" />
				</div>
				<div id="msg2"></div>
			</div>
		</form>
	</div>


	<script>
		$(document).ready(function() {
			//when pressed cancel
			$(".cancel").on("click", function() {
				location.href = "/member/login";
			});

			//check simultaniously the id whether it is already exist or not.
			$("#userid").on("input", function() {
				//alert("You put the letters");

				var inputID = $("#userid").val();

				$.ajax({
					url : "/member/idCheck",
					type : "post",
					dataType : "json",
					data : {
						"userid" : $("#userid").val()
					}, //Transfer value
					success : function(data) { //return value
						if (inputID == "" && data == '0') {
							$(".singUpBtn").prop("disabled", true);
							$(".singUpBtn").css("background-color", "#AAAAAA");
							$("#idCheck").css("background-color", "#FFCECE");
							document.getElementById("msg2").innerHTML = "Please enter the ID";
							document.getElementById("msg").value = "Please enter the ID";
						}else if(inputID !="" && inputID.length < 4){
							$(".singUpBtn").prop("disabled", true);
							$(".singUpBtn").css("background-color", "#AAAAAA");
							$("#idCheck").css("background-color", "#FFCECE");
							document.getElementById("msg2").innerHTML = "ID must be more than 4 chracters";
							document.getElementById("msg").value = "ID must be more than 4 chracters";
						}else if(inputID != "" & inputID.length > 4 && data =='0'){
							$(".singUpBtn").prop("disabled", false);
							$(".singUpBtn").css("background-color", "#4CAF50");
							$("#idCheck").css("background-color", "#FFCECE");
							$("#msg").css("background-color", "#FFCECE");
							document.getElementById("msg2").innerHTML = "You can register with this ID";
							document.getElementById("msg").value = "You can register with this ID";
						}else if(data =='1'){
							$(".singUpBtn").prop("disabled", true);
							$(".singUpBtn").css("background-color", "#AAAAAA");
							$("#idCheck").css("background-color", "#FFCECE");
							$("#msg").css("background-color", "#FFCECE");
							document.getElementById("msg2").innerHTML = "Please enter the Another ID";
							document.getElementById("msg").value = "Please enter the Another ID";
						}

					}
				});
			});
		});
	</script>



</body>
	</html>


</layoutTag:layout>
