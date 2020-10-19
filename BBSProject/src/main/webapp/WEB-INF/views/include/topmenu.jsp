<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <nav class="navbar navbar-inverse navbar-sticky-top">
    	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle"
				data-toggle="collapse" data-target="#myNavbar">
				<span class="icon-bar"></span>	
				<span class="icon-bar"></span>	
				<span class="icon-bar"></span>	
			</button>
			<a class="navbar-brand" href="/${path}">HOME</a>
		</div>
		<div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					
				
					<li class="dropdown">
						<a class="dropdown-toggle" data-toggle="dropdown" href="#">
							Controller Practice <span class="caret"></span>
						</a>
						<ul class="dropdown-menu">
    						<li><a href="${path}/gugu.dan">구구단</a></li>
    						<li><a href="${path}/gugu.dan?temp=8">구구단</a></li>
    						<li><a href="${path}/test.do">Test</a></li>
    						<li><a href="${path}/test/testA">TestA</a></li>
    						<li><a href="${path}/test/testB">TestB</a></li>
    						<li><a href="${path}/test/testC">TestC</a></li>
    						<li><a href="${path}/test/testD">TestD</a></li>
    					</ul>
    					
    				</li>
    				
    				<li class="dropdown">
						<a class="dropdown-toggle" data-toggle="dropdown" href="#">
							Board Management <span class="caret"></span>
						</a>
							<ul class="dropdown-menu">
								<li><a href="${path}/board/insert">Board Register</a></li>
								<li><a href="${path}/board/list">Board List</a></li>
							</ul>
						</li>
    			</ul>
    		</div>
    	</div>
    </div>
    </nav>