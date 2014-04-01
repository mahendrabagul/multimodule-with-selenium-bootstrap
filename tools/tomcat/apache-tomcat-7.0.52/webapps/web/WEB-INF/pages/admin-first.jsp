<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>First Admin page</title>

<meta name="viewport" content="width=device-width,initial-scale=1.0" />
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css"
	rel="stylesheet">
<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>

<script type="text/javascript">

$(function(){
  var hash = window.location.hash;
  hash && $('ul.nav a[href="' + hash + '"]').tab('show');

  $('.nav-tabs a').click(function (e) {
    $(this).tab('show');
    var scrollmem = $('body').scrollTop();
    window.location.hash = this.hash;
    $('html,body').scrollTop(scrollmem);
  });
});	
</script>

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
	-webkit-box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
	-moz-box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
	box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
}

.form-signin .form-signin-heading,.form-signin .checkbox {
	margin-bottom: 10px;
}

.form-signin input[type="text"],.form-signin input[type="password"] {
	font-size: 16px;
	height: auto;
	margin-bottom: 15px;
	padding: 7px 9px;
}
</style>
</head>
<body>
	<div class="navbar navbar-inverse navbar-static-top">
		<div class="container">
			<a href="${pageContext.request.contextPath}/index.html"
				class="navbar-brand">Neova Solution's Base Project</a>
			<button class="navbar-toggle" data-toggle="collapse"
				data-target=".navHeaderCollapse">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<div class="collapse navbar-collapse navHeaderCollapse">
				<ul class="nav navbar-nav navbar-right">
					<li class="active"><a id="a-home"
						href="${pageContext.request.contextPath}/index.html">Home</a></li>
					<li><a href="#">Blog</a></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">Social Media <b class="caret    "></b></a>
						<ul class="dropdown-menu">
							<li><a href="#">Twitter</a> <a href="#">Facebook</a> <a
								href="#">Google+</a> <a href="#">Instagram</a></li>
						</ul></li>
					<li><a href="#">About</a></li>
					<li><a href="#">Contact</a></li>
					<li><a id="a-logout-button"
						href="<c:url value="/j_spring_security_logout" />">Logout</a> <br /></li>
				</ul>
			</div>
		</div>
	</div>

	<!---------------------------------------------------------------------------->
	<div class="bs-example">
    <ul class="nav nav-tabs" id="myTab">
        <li class="active"><a href="#sectionA">Section A</a></li>
        <li><a href="#sectionB">Section B</a></li>
        <li class="dropdown">
            <a data-toggle="dropdown" class="dropdown-toggle" href="#">Dropdown <b class="caret"></b></a>
            <ul class="dropdown-menu">
                <li><a href="#dropdown1">Dropdown1</a></li>
                <li><a href="#dropdown2">Dropdown2</a></li>
            </ul>
        </li>
    </ul>
    <div class="tab-content">
        <div id="sectionA" class="tab-pane fade in active">
            <h3>Section A</h3>
            <p>Aliquip placeat salvia cillum iphone. Seitan aliquip quis cardigan american apparel, butcher voluptate nisi qui. Raw denim you probably haven't heard of them jean shorts Austin. Nesciunt tofu stumptown aliqua, retro synth master cleanse. Mustache cliche tempor, williamsburg carles vegan helvetica. Reprehenderit butcher retro keffiyeh dreamcatcher synth.</p>
        </div>
        <div id="sectionB" class="tab-pane fade">
            <h3>Section B</h3>
            <p>Vestibulum nec erat eu nulla rhoncus fringilla ut non neque. Vivamus nibh urna, ornare id gravida ut, mollis a magna. Aliquam porttitor condimentum nisi, eu viverra ipsum porta ut. Nam hendrerit bibendum turpis, sed molestie mi fermentum id. Aenean volutpat velit sem. Sed consequat ante in rutrum convallis. Nunc facilisis leo at faucibus adipiscing.</p>
        </div>
        <div id="dropdown1" class="tab-pane fade">
            <h3>Dropdown 1</h3>
            <p>WInteger convallis, nulla in sollicitudin placerat, ligula enim auctor lectus, in mollis diam dolor at lorem. Sed bibendum nibh sit amet dictum feugiat. Vivamus arcu sem, cursus a feugiat ut, iaculis at erat. Donec vehicula at ligula vitae venenatis. Sed nunc nulla, vehicula non porttitor in, pharetra et dolor. Fusce nec velit velit. Pellentesque consectetur eros.</p>
        </div>
        <div id="dropdown2" class="tab-pane fade">
            <h3>Dropdown 2</h3>
            <p>Donec vel placerat quam, ut euismod risus. Sed a mi suscipit, elementum sem a, hendrerit velit. Donec at erat magna. Sed dignissim orci nec eleifend egestas. Donec eget mi consequat massa vestibulum laoreet. Mauris et ultrices nulla, malesuada volutpat ante. Fusce ut orci lorem. Donec molestie libero in tempus imperdiet. Cum sociis natoque penatibus et magnis dis parturient.</p>
        </div>
    </div>
</div>



	 <div class="container">
	  <div class="row">
			 <div class="col-md-4">
				<form:form class="form-signin" method="POST" action="/web/admin/save.html" commandName="command">
					<fieldset>
						<legend>Add / Update User Data:</legend>
						<form:input path="id" placeholder="User ID" value="${user.id}" readonly="true" />
						<form:input path="firstName" placeholder="FirstName" value="${user.firstName}" />
						<form:input path="lastName" placeholder="Last Name" value="${user.lastName}" />
						<form:input path="login" placeholder="UserName" value="${user.login}" />
						<form:input path="emailId" placeholder="Email ID" value="${user.emailId}" />
						<form:input path="password" placeholder="Password" value="${user.password}" />
						<form:input path="password" placeholder="Confirm Password" value="${user.password}" />

						<form:input path="country" placeholder="Country" value="${user.country}" />
						<form:input path="mobileNo" placeholder="Mobile No" value="${user.mobileNo}" /><br/>
						<button class="btn btn-large btn-primary" value="Save" name = "save" id="a-submit" type="submit" >Save</button>
						&nbsp
						&nbsp
						&nbsp
						&nbsp
						&nbsp
						&nbsp
						&nbsp
						&nbsp
						&nbsp
						&nbsp
						<button class="btn btn-large btn-primary" value="Update" name = "update" id="update" type="submit">Update
						</button> 
				
				</fieldset>
			</form:form>
		</div>

		<div class="col-md-8">
			<div class="table-responsive">
				<c:if test="${!empty userList}">
					<table class="table table-bordered  table-hover">
						<tr>
							<th>User ID</th>
							<th>First Name</th>
							<th>Last Name</th>
							<th>UserName</th>
							<th>Email Id</th>
							<th>Country</th>
							<th>Mobile</th>
							<th>Operations</th>
						</tr>
						<c:forEach items="${userList}" var="user">
							<tr>
								<td>${user.id}</td>
								<td>${user.firstName}</td>
								<td>${user.lastName}</td>
								<td>${user.login}</td>
								<td>${user.emailId}</td>
								<td>${user.country}</td>
								<td>${user.mobileNo}</td>
								<td align="center"><a
							href="/web/admin/edit.html?id=${user.id}">Edit</a> | <a
							href="/web/admin/delete.html?id=${user.id}">Delete</a></td>
							</tr>
						</c:forEach>
					</table>
				</c:if>
			</div>
		</div>

	</div>

	<!---------------------------------------------------------------------------->

	<!--End of Contains of First Admin Page-->

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