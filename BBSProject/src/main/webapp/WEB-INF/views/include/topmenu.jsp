<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <nav class="navbar navbar-inverse navbar-sticky-top">
    	<div class="container-fluid">
    		<div class="navbar-header">
    			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
    				<span class="icon-bar"></span>
    				<span class="icon-bar"></span>
    				<span class="icon-bar"></span>
    			</button>			
    			<a class="navbar-brand" href="${path}">HOME</a>
    		</div>
    	</div>
    	<div>
    		<div class="collapse navbar-collapse" id="myNavbar">
    			<ul class="nav navbar-nav">
    				<li class="dropdown">
    					<a class="dropdown-toggle" data-toggle="dropdown" href="#">
    						컨트롤러 연습 <span class="caret"></span>
    					</a>
    					<ul class="dropdown-menu">
    						<li><a href="${path}/gugu.dan">구구단</a></li>
    						<li><a href="${path}/gugu.dan?temp=8">구구단</a></li>
    					</ul>
    					
    				</li>
    			</ul>
    		</div>
    	</div>
    
    </nav>