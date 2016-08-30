<%@include file="Header.jsp" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Sign Up!</title>
  	<meta name="viewport" content="width=device-width, initial-scale=1">
		<link href="resources/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="resources/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="resources/bootstrap/js/jquery-1.9.1.mini.js"></script>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<link rel="stylesheet" type="text/css" href="font-awesome/css/font-awesome.min.css" />
    <script type="text/javascript" src="resources/bootstrap/js/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="resources/bootstrap/js/bootstrap.min.js"></script>
    
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet' type='text/css'>
  
 <style>
 body{
 background-image:url('resources/images/images33.jpg');
 background-size:cover;
 }

.button {
    background-color: teal;
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
}

 </style>
  
</head>
<body>
<br>
<center><!-- <h2><font style="color:#55ACEE; font-size: 80px" >Register Here</font> </h2>--></center>

		<div class="container">
			<div class="row main">
				<div class="panel-heading">
	               <div class="panel-title text-center">
	               		<h1 class="title"><font color="#55ACEE">Register Here</font></h1>
	               		<hr />
	               	</div>

      <form:form action="register" commandName="user" modelAttribute="user" method="POST">
      <center>
<table>
<tr>
<td><font style="color:white; font-size: 30px" >First Name : </font></td>
<td><form:input path="ufirstname" /><form:errors path="ufirstname" style="color:red"></form:errors></td>
</tr>

<br>
<tr>
<td><font style="color:white; font-size: 30px" >Last Name :</font> </td>
<td><form:input path="ulastname" /><form:errors path="ulastname" style="color:red"></form:errors></td>
</tr><br>
<tr>
<td><font style="color:white; font-size: 30px" >User Name :</font> </td>
<td><form:input path="username" /><form:errors path="username" style="color:red"></form:errors></td>
</tr><br>
<td><font style="color:white; font-size: 30px" >Phone Number :</font> </td>
<td><form:input path="uphonenumber" /><form:errors path="uphonenumber" style="color:red"></form:errors></td>
</tr><br>
<tr>
<td><font style="color:white; font-size: 30px" >Email Id :</font></td>
<td><form:input path="uemail"/><form:errors path="uemail" style="color:red"></form:errors></td></tr>

<br>
<tr>
<td><font style="color:white; font-size: 30px" >Password :</font> </td>
<td><form:password path="upassword"/><form:errors path="upassword" style="color:red"></form:errors></td></tr>
<br><br>

<br>
<tr>
<td><font style="color:white; font-size: 30px" >Confirm Password :</font> </td>
<td><form:password path="confirmpassword"/><form:errors path="confirmpassword" style="color:red"></form:errors></td></tr>
<br><br>
</table><br><br>

<tr colspan="2">

<td><input type="submit" value="Register"  class="btn btn-primary" hspace="300"/></td>&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp

<td><input type="reset" value="Reset" class="btn btn-primary" /></td>
</tr>
</center>	<br><br><br><center>	<div class="login-register">
				            <a href="login"><font size="05" color="#55ACEE"><u>Existing User</font></a>
				         </div></center>
</form:form>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
  <%@include file="Footer.jsp" %>
      
