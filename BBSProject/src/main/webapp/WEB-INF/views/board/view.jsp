<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Board Detail</title>
	<%@ include file="../include/header.jsp" %>
</head>
<body>
<%@ include file="../include/topmenu.jsp" %>
<div class="container">
	<form class="form-horizontal" method="post" action="/board/update">
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-6">
				<h2 align="center">Board Detail</h2>
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2">Title</label>
			<div class="col-sm-6">
				<input class="form-control" type="text" name="b_title" value="${boardDTO.b_title}"/>
			</div>
		</div>
		<div class="form-group" >
			<label class="control-label col-sm-2">Writer</label>
			<div class="col-sm-2">
				<input class="form-control" type="text" name="writer" 
					value="${boardDTO.b_writer}" readonly="readonly"/>
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2">Date</label>
			<div class="col-sm-2">
				<input class="form-control" type="text" name="regDate" value="<fmt:formatDate value='${boardDTO.b_date}' pattern='yyyy-MM-dd'/>" 
	 					readonly="readonly" />

			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2">Context</label>
			<div class="col-sm-6">
				<textarea rows="10" cols="100" name="b_detail">${boardDTO.b_detail}</textarea>
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-3">
			<input type="hidden" name=b_no value="${boardDTO.b_no}"/>
				<a href="/board/delete?b_no=${boardDTO.b_no}">Delete</a>
				<button type="submit"   class="btn btn-info">Revise</button>
			</div>
		</div>
	</form>
</div>
<%@ include file="../include/footer.jsp" %>
</body>
</html>














