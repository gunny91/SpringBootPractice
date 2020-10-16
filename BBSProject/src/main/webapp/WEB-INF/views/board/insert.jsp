<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false" %>
<html>
<head>
    <title>Board</title>
    <%@ include file="../include/header.jsp" %>
</head>
<body>
	
	    <%@ include file="../include/topmenu.jsp" %>

<h1>
    Board Registration 
</h1>
	    
    <form action="/board/insert" method="POST">
        <div class="createForm">
            <label >Title</label>
            <input type="text" name="b_title" class="createForm" placeholder = "Board Title">
        </div>
        <div class="createForm">
            <label >Context</label>
            <textarea rows="10" cols="100" name="b_detail" class="createForm" placeholder = "Board Context"></textarea>
        </div>
        <div class="createForm">
            <label >Writer</label>
            <input type="text" name="b_writer" class="createForm" placeholder = "Writer">
        </div>
        
        <div class="Formfooter">
                <button type="submit" class="btn_button">Submit</button>
        </div>            
        
    </form>
     <%@ include file="../include/footer.jsp" %>
    
</body>
</html>