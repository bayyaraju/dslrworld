<%@include file="Header.jsp" %>
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
body{

background-image:url("resources/images/images33.jpg") ;
background-size:cover;
}
</style>

</head>
<body bgcolor="lightblue">


  
<div class="container"><center>
  <h1><B><font style="color:#55ACEE";> World of DSLR Camera's</font></B></h1></center>
  </div><br>
  <center>
  <img src="resources/images/image3.jpg" width="900" height="150"></img>
  </center><br><br>
<br><br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
    <li data-target="#myCarousel" data-slide-to="3"></li>
    <li data-target="#myCarousel" data-slide-to="4"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner" >
    <div class="item active"><center>
      <img src="resources/images/image1.jpg" alt="image1" height="400"></center>
    </div>

    <div class="item"><center>
      <img src="resources/images/image2.jpg" alt="image2" height="400"></center>
    </div>

    <div class="item"><center>
      <img src="resources/images/image4.jpg" alt="image4" height="400"></center>
    </div>

    <div class="item"><center>
      <img src="resources/images/image7.jpg" alt="image7" height="400"></center>
    </div>
  </div>

  <!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div><br>
<br><br><a href="">
<img hspace="200" src="resources/images/image9.png" class="img-rounded" alt="Cinque Terre" width="304" height="236" class="thumbnail"></img></a>
<a href="prod">
<img  hspace="108" src="resources/images/image10.jpg" class="img-rounded" alt="Cinque Terre" width="304" height="236" class="thumbnail" style="float:middle"></img></a>
<a href="Brands">
<img hspace="180" src="resources/images/image11.png" class="img-rounded" alt="Cinque Terre" width="304" height="236" class="thumbnail" style="float:right" hspace="200"></img>
</a><br><br><br><br><br>
<%@include file="Footer.jsp" %>
