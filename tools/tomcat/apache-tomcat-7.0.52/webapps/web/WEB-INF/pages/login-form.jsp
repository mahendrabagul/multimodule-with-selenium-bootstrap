<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Log-In Page</title>
<style type="text/css">
	h1 {
		margin: 30px 0;
		padding: 0 200px 15px 0;
		border-bottom: 1px solid #E5E5E5;
	}

	.bs-example {
		margin: 20px;
	}
	 

	  .form-signin {
		max-width: 300px;
		padding: 19px 29px 29px;
		margin: 0 auto 20px;
		background-color: #fff;
		border: 1px solid #e5e5e5;
		-webkit-border-radius: 5px;
		   -moz-border-radius: 5px;
				border-radius: 5px;
		-webkit-box-shadow: 0 1px 2px rgba(0,0,0,.05);
		   -moz-box-shadow: 0 1px 2px rgba(0,0,0,.05);
				box-shadow: 0 1px 2px rgba(0,0,0,.05);
	  }
	  .form-signin .form-signin-heading,
	  .form-signin .checkbox {
		margin-bottom: 10px;
	  }
	  .form-signin input[type="text"],
	  .form-signin input[type="password"] {
		font-size: 16px;
		height: auto;
		margin-bottom: 15px;
		padding: 7px 9px;
	  }
	</style>
<meta name="viewport" content="width=device-width,initial-scale=1.0" />
<link href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body >
	<div class="navbar navbar-inverse navbar-static-top">
		<div class="container">
			<a href="${pageContext.request.contextPath}/index.html" class="navbar-brand">Neova Solution's Base Project</a>
			<button class="navbar-toggle" data-toggle="collapse"
				data-target=".navHeaderCollapse">
				<span class="icon-bar"></span> 
				<span class="icon-bar"></span> 
				<span class="icon-bar"></span>
			</button>
			<div class="collapse navbar-collapse navHeaderCollapse">
				<ul class="nav navbar-nav navbar-right">
					<li class="active"><a href="${pageContext.request.contextPath}/index.html">Home</a></li>
					<li><a href="#">Blog</a></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">Social Media <b class="caret	"></b></a>
						<ul class="dropdown-menu">
							<li>
								<a href="#">Twitter</a> <a href="#">Facebook</a> 
								<a href="#">Google+</a> <a href="#">Instagram</a>
							</li>
						</ul>
					</li>
					<li><a href="#">About</a></li>
					<li><a href="#">Contact</a></li>
				</ul>
			</div>
		</div>
	</div>

	<!-- Error Block -->

	<c:if test="${error == true}">
		<div class="alert alert-danger alert-dismissable">
			<button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
			<strong><center>Your Login Attempt was not Successful, Please Try Again.</center>
		</div>
	</c:if>

	<!--End of Error Block -->


	<!-- Login Form  -->

	<div class="container">
			<div class="container" >
			<form class="form-signin" method="post" action="<c:url value='j_spring_security_check'/>">
				<h2 class="form-signin-heading">Sign-In</h2>
					<input type="text" name="j_username" id="j_username" maxlength="40" class="input-block-level" placeholder="UserName">
				<input type="password" name="j_password" id="j_password" class="input-block-level" placeholder="Password">
				<button class="btn btn-large btn-primary" id="a-submit" type="submit" >Sign in</button>
				<button class="btn btn-warning" id="reset" type="reset">Clear</button>		
			</form>
		</div> 
	</div>

	<!-- End of Login Form -->

	
	
	<!--Bottom(Footer) Content -->

	<div class="navbar navbar-default navbar-fixed-bottom">
		<div class="container">
			<p class="navbar-text pull-left">Designed by Neova Solution's
				JAVA Team</p>
			<a href="http://www.neovasolutions.com/"
				class="navbar-btn btn-danger btn pull-right">Visit To Neova
				Solutions</a>
		</div>
	</div>
	<!-- End of Bottom(Footer) Content -->

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
	<script
		src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>

</body>
</html>
