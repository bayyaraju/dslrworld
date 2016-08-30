<%@include file="Header.jsp" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC>
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
.itm{
width:70%;
margin: auto;
}
</style>

		<title>Manage Product</title>
	</head>
<body>
<div align="center">
        <form:form action="productupdate" method="post" commandName="products" modelAttribute="product" enctype="multipart/form-data">
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Manage Product</h2></td>
                </tr>
                <tr>
                    <td><form:label path="pname"><font size="05">Product Name:</font></form:label></td>
                    <td><form:input path="pname" /></td>
                </tr>
               <br>
                <tr>
                    <td><form:label path="pdescription"><font size="05">Product Description:</font></form:label></td>
                    <td><form:input path="pdescription" /></td>
                </tr><br>
             	<tr><br>
                    <td><form:label path="price"><font size="05">Product Price:</font></form:label></td>
                    <td><form:input path="price" /></td>
                </tr>  
                <tr><br>
                    <td><form:label path="pquantity"><font size="05">Product Quantity:</font></form:label></td>
                    <td><form:input path="pquantity" /></td>
                </tr>
               
<tr>
<td><form:label path="img"><font size="05">Image Upload:</font></form:label></td>
 <td><form:input type="file" path="img"  /></td>
                </tr>   <br>
                   <td colspan="2" align="center" ><font size="05"><input type="submit" value="AddProduct" /></font></td>
                    
                </tr>
            </table>
        </form:form><br><br>
    </div><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
	<%@include file="Footer.jsp" %>	
	
				
 	


