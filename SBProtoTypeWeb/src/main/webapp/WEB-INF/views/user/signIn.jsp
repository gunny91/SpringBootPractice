<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
		<h1>Sign In Page</h1>

		<div class="modal-body" style="padding: 40px 50px;">
			<form class="form-horizontal" role="form" method="post"
				action="${path}/user/logedIn">
				
				<div class="form-group">
					<label for="username"><span class="glyphicon glyphicon-user"> </span> User ID</label> 
					
					<input type="text" class="form-control" name="userId" maxlength="10" placeholder="Enter Admin ID" />
				</div>
				<div class="form-group">
					<label for="pwd"><span class="glyphicon glyphicon-eye-open">
					</span> Password</label> <input type="password" class="form-control" name="userPw"
						maxlength="10" placeholder="Enter Password" />
				</div>


				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-4">
						<button type="submit" class="btn btn-success btn-success"
							id="submit">Login</button>
						<button class="cancel btn btn-danger" type="reset">Cancel</button>

					</div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>