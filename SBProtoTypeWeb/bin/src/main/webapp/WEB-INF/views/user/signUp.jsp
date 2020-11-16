<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
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



	<div class="container">
		<h1>User Sign Up</h1>
		<br>
		<form class="form-horizontal" method="post"
			action="${path}/user/signIn">

			<div class="form-group">
				<label class="control-label col-sm-2">ID</label>
				<div class="col-sm-3">
					<input type="text" class="form-control" name="userId"
						maxlength="16" placeholder="Enter ID">
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2">Password</label>
				<div class="col-sm-3">
					<input type="password" class="form-control" name="userPw"
						maxlength="16" placeholder="Enter Password">
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2">Name</label>
				<div class="col-sm-3">
					<input type="text" class="form-control" name="userName"
						maxlength="10" placeholder="Enter Name">
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2">Address</label>
				<div class="col-sm-7">
					<input type="text" class="form-control" name="address"
						maxlength="100" placeholder="Enter Address">
				</div>
			</div>

			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-primary">Register</button>
				</div>
			</div>
		</form>
	</div>
</body>
</html>