<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign In</title>
</head>
<body>
	<h1>Sign In Page</h1>

	<div class="container">

		<div class="modal-body" style="padding: 40px 50px;">
			<form class="form-horizontal" role="form" method="post"
				action="${path}/user/logedIn">
				<div class="form-group">
					<label for="username"><span
						class="glyphicon glyphicon-user"> </span> User ID</label> <input
						type="text" class="form-control" name="userId" maxlength="10"
						placeholder="Enter Admin ID" />
				</div>
				<div class="form-group">
					<label for="pwd"><span class="glyphicon glyphicon-eye-open">
					</span> Password</label> <input type="password" class="form-control"
						name="userPw" maxlength="10" placeholder="Enter Password" />
				</div>
				<button type="submit" class="btn btn-success btn-block">
					<span class="glyphicon glyphicon-off"></span> Login
				</button>

				<button type="reset" class="btn btn-danger pull-flef"
					data-dismiss="modal">
					<span class="glyphicon glyphicon-remove"></span> Cancel
				</button>
			</form>
		</div>
	</div>
</body>
</html>