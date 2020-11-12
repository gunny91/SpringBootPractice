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
<title>Member Info Revision</title>
</head>
<body>
	<h1>Member Update</h1>

	<div class="container">

		<form class="form-horizontal" method="post"
			action="/member/memberUpdate">


			<div class="form-group">
				<div class="col-sm-2"></div>
				<div class="col-sm-6">
					<h2 align=left>Member Update</h2>
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2">ID</label>
				<div class="col-sm-2">
					<input type="text" class="form-control" id="userid"
						value="${member.userid}" readonly="readonly" name="userid"
						placehoder="ID" maxlength=16>
				</div>
			</div>

			<!-- Password -->
			<div class="form-group">
				<label class="control-label col-sm-2">PW</label>
				<div class="col-sm-2">
					<input type="text" class="form-control" id="userpw" name="userpw"
						value="${member.userpw}" maxlength=16>
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2">Name</label>
				<div class="col-sm-2">
					<input type="text" class="form-control" id="name" name="name"
						value="${member.name}">
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

</body>
	</html>

</layoutTag:layout>