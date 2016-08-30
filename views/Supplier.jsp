<%@include file="Header1.jsp" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta name="viewport" content="width=device-width, initial scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<title>Supplier Page</title>
<style>
body
{
  background-image:url(resources/images/bg10.jpg);

   background-repeat:repeat;

}
</style>
</head>
<body>

<center> 
<form action="addSupplier" method="post">



<div class="container">
<br>
<br>

<center>
<h1 style="color:black"><u>Supplier Details</u></h1><br>

<table>
<tr>
<td>
<h3 style="color:black">Supplier id : </td>
<td> <input type="text" name="sid"></td></tr>
<tr>
<td>
<h3 style="color:black">  Name: </td><td> <input type="text" name="sname"></td>
</tr>
<tr>
<td>
<h3 style="color:black"> Email : </td>
<td> <input type="text" name="semail"></td>

</tr>

<tr>
<td>
<h3 style="color:black">Phone number :</td> <td> <input type="text" name="sphno"></td>
</tr>
<tr>
<td>
 <h3 style="color:black"> Address:</td> <td> <textarea rows="4" cols="50"  name="saddress"> 

</textarea>

</td>
</tr>



<tr>
<td>
<h4 style="color:blue"><input type="submit" value="submit">

 <input type="reset" value="Cancel"></h4>
</td>
</tr>
</table>
</form>

</body>
</html>