<%@include file="Header.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Dslr Product</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <head>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
  <script>document.write('<base href="' + document.location + '" />');</script>
    <link href="./resources/css/bootstrap.min.css" rel="stylesheet" media="screen">
    <link href="./resources/css/style.css" rel="stylesheet" media="screen">
    <script data-require="angular.js@1.0.x" src="http://code.angularjs.org/1.0.7/angular.min.js" data-semver="1.0.7"></script>

  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }    
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: orange;
      padding: 25px;
    }
	.carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      margin: auto;
  </style>
</head>
<body>

<div>
<br><br><br><br><br>
<center></center>
</div>
<div>
<div class="container">
  <div ng-app="myApp" ng-controller="dataCtrl">
Enter Product Name:  <input type="text"  ng-model="search">&nbsp&nbsp<span class="glyphicon glyphicon-search"></span>
    <hr></hr>
    <table class="table table-striped">
    <tr>
    <th>Product/ProductId</th>
    <th>Product/Product Name</th>
    <th>Product /Product Description</th>
    
    <th>Product /Product Price</th>
     <th>Product /Product Quantity</th>
     <th >Present in Category</th>
	<th >Supplied By</th>
     
    <th>Product/Product Image</th>
    </tr>
        <tr ng-repeat="resource in names | filter:search">
             <td>{{resource.pid}}</td>
            <td>{{ resource.pname}}</td>
            <td>{{ resource.pdescription}}</td>
            
            <td>{{resource.price}}</td>
            <td>{{ resource.pquantity}}</td>
            <td>${resource.category.cname}</td>
			<td>${resource.supplier.sname}</td>
            
            <td>{{resouce.img}}</td>
          <td><img src="resource/images/resource.pname style="width:100px;height:100px" alt="car_image"></td>
        </tr>    
    </table>
</div>

<script>
angular.module('myApp',[]).controller('dataCtrl',function($scope)
		{
	
		$scope.names=${listofitem};
		$scope.orderByMe=function(x)
		{
			$scope.myOrderBy=x;
			}
		});
</script>
</body>

</html>
