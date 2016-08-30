<%-- <%@include file="Header.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="resources/bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<script type="text/javascript"
	src="resources/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="resources/bootstrap/js/jquery-1.9.1.mini.js"></script>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<link rel="stylesheet" type="text/css"
	href="font-awesome/css/font-awesome.min.css" />
<script type="text/javascript"
	src="resources/bootstrap/js/jquery-1.10.2.min.js"></script>
<script type="text/javascript"
	src="resources/bootstrap/js/bootstrap.min.js"></script>

<link href="font-awesome/css/font-awesome.min.css" rel="stylesheet"
	type="text/css">
<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700"
	rel="stylesheet" type="text/css">
<link href='https://fonts.googleapis.com/css?family=Kaushan+Script'
	rel='stylesheet' type='text/css'>
<link
	href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic'
	rel='stylesheet' type='text/css'>
<link
	href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700'
	rel='stylesheet' type='text/css'>
<style>
body {
	background-image: url("resources/images/images33.jpg");
	background-size: cover;
}
</style>

<style>
.itm {
	width: 70%;
	margin: auto;
}
</style>

<title>User Login</title>
</head>
<body>

	<div class="container">
		<div class="row main">
			<div class="panel-heading">
				<div class="panel-title text-center">
					<h1 class="title">
						<font color="#55ACEE">Login Page</font>
					</h1>
					<hr />
				</div>
			</div>
			<div class="main-login main-center">
				<form class="form-horizontal"
					action="<c:url value="j_spring_security_check"/>">
					<!-- <c:url var="loginUrl" value="/j_spring_security_check"></c:url> -->
					<!-- <form action="UserCheck" method="POST">
 -->
 <form name='loginForm'
		    action="<c:url value='j_spring_security_check' />" method='POST'>
						<div class="form-group">
							<label for="name" class="cols-sm-2 control-label"><font
								style="color: white; font-size: 30px">Enter UserName</font></label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa"
										aria-hidden="true"></i></span> <input type="text"
										class="form-control" name="username" id="username"
										placeholder="Enter your username" />
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="email" class="cols-sm-2 control-label"><font
								style="color: white; font-size: 30px">Enter password</font></label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i
										class="fa fa-envelope fa" aria-hidden="true"></i></span> <input
										type="password" class="form-control" name="upassword"
										id="upassword" placeholder="Enter your password" />
								</div>
							</div>
						</div>


						<div class="form-group ">
							<input type="submit" value="Login" class="btn btn-primary" />
							<!-- <a href="springregisteruserUpdate" >Register</a> -->
						</div>
						<center>
							<div class="login-register">
								<a href="registration"><font size="5" color="#55ACEE"><u>New
											User</font></a>
							</div>
						</center>
					</form>
			</div>
		</div>
	</div>

	<script type="text/javascript" src="assets/js/bootstrap.js"></script>

	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<%@include file="Footer.jsp"%> --%>
	
<%@include file="Header.jsp"%>	
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Login Page</title>
<style>
.error {
	padding: 15px;
	margin-bottom: 20px;
	border: 1px solid transparent;
	border-radius: 4px;
	color: #a94442;
	background-color: #f2dede;
	border-color: #ebccd1;
}

.msg {
	padding: 15px;
	margin-bottom: 20px;
	border: 1px solid transparent;
	border-radius: 4px;
	color: #31708f;
	background-color: #d9edf7;
	border-color: #bce8f1;
}

#login-box {
	width: 300px;
	padding: 20px;
	margin: 100px auto;
	background: #fff;
	-webkit-border-radius: 2px;
	-moz-border-radius: 2px;
	border: 1px solid #000;
}
</style>
</head>
<body onload='document.loginForm.username.focus();'>

	<h1>Spring Security Custom Login Form (Annotation)</h1>

	<div id="login-box">

		<h2>Login with Username and Password</h2>

		<c:if test="${not empty error}">
			<div class="error">${error}</div>
		</c:if>
		<c:if test="${not empty msg}">
			<div class="msg">${msg}</div>
		</c:if>

		<form name='loginForm'
		    action="<c:url value='j_spring_security_check' />" method='POST'>

		    <table>
			<tr>
				<td>User:</td>
				<td><input type='text' name='username' value=''></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='upassword' /></td>
			</tr>
			<tr>
			        <td colspan='2'>
                                <input name="submit" type="submit" value="submit" />
                                </td>
			</tr>
		   </table>

		   <input type="hidden"
                     name="${_csrf.parameterName}" value="${_csrf.token}" />
		</form>
	</div>

</body>
</html>