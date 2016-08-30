<%@include file="Header.jsp" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html lang="en">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="resources/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="resources/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="resources/bootstrap/js/jquery-1.9.1.mini.js"></script>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<script type="text/javascript" src="resources/bootstrap/js/jquery-1.10.2.min.js"></script>
<script type="text/javascript" src="resources/bootstrap/js/bootstrap.min.js"></script>


<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
<link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet' type='text/css'>
<style>
#myCarousel
{
width:100%;
height:50%;
}
</style>

<style>
.dropdown-menu {
min-width: 200px;
}
.dropdown-menu.columns-2 {
min-width: 400px;
}
.dropdown-menu.columns-3 {
min-width: 600px;
}
.dropdown-menu li a {
padding: 5px 15px;
font-weight: 300;
}
.multi-column-dropdown {
list-style: none;
}
.multi-column-dropdown li a {
display: block;
clear: both;
line-height: 1.428571429;
color: #333;
white-space: normal;
}
.multi-column-dropdown li a:hover {
text-decoration: none;
color: #262626;
background-color: #f5f5f5;
}

@media (max-width: 767px) {
.dropdown-menu.multi-column {
min-width: 240px !important;
overflow-x: hidden;
}
</style>
<link rel="stylesheet"
href="<c:url value="resources/css/bootstrap.min.css" />" />
<script src="<c:url value="resources/js/jquery-2.2.4.js" />"></script>
<script src="<c:url value="resources/js/bootstrap.min.js" />"></script>
<style>
.carousel-inner > .item > img,
.carousel-inner > .item > a > img {
width: 100%;
margin: auto;
height: 680px;
}
</style>
<style>
.navbar-default {
background-color:red;
background-image: none;
background-repeat: no-repeat;
color:red;
}
<style>
body {
background-color:red;
}
</style>
</style>
</head>

<div class="container">

    <div class="navbar-collapse collapse">
      <ul class="nav navbar-nav navbar-center">
      <li class="active"><a href="adminlogin"><b>Admin Home</b></a></li>             
          
        <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown"><b>Manage</b><b class="caret"></b></a>
            <ul class="dropdown-menu multi-column columns-3">
                <div class="row">
                    <div class="col-sm-4">
                        <ul class="multi-column-dropdown">
                            <li><b>Products</b></li>                          
                            <li class="divider"></li>
                            <li><a href="add" target="_self">Add</a></li>
                            <li><a href="viewitem" target="_self">View ProductTable</a></li>
                            <li><a href="angularjs" target="_self">Remove</a></li>
                             <li class="dropdown">
          
                            
                        </ul>
                    </div>
                    
   
                    
                    <div class="col-sm-4">
                        <ul class="multi-column-dropdown">
                            <li><b>Category</b></li>
                            <li class="divider"></li>
                            <li><a href="DAD" target="_self">Add</a></li>
                            
                        </ul>
                    </div>
                     
                    <div class="col-sm-4">
                        <ul class="multi-column-dropdown">
                            <li><b>Suppliers</b></li>
                            <li class="divider"></li>
                            <li><a href="Daddd" target="_self">Add</a></li>
                           
                        </ul>
                    </div>
                </div>
            </ul>
        </li>
          
      </ul>         
    </div>
  </div>
</div>

<br><br><br><br><br><br>
<b><center><font face="Comic Sans MS"><h1>Welcome Adminlogin</h1></font></center></b>

<br> <br><br><br><br><br><br><br><br><br><br><br><br>
<!-- 
<ul><b>
<li>To change your password, go to Change Password.</li>
<li>To manage the categories, products and suppliers, go to Manage.</li>
<li>To change the terms and conditions of the website, go to Change T&C.</li> -->

</b></ul><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
<%@include file="Footer.jsp" %>