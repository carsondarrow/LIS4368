<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="My online portfolio that illustrates skills acquired while working through various project requirements.">
	<meta name="author" content="Carson Darrow">
	<link rel="icon" href="favicon.ico">

	<title>Advanced Web Application Development</title>

	<%@ include file="/css/include_css.jsp" %>		

<!-- Carousel styles -->
<style type="text/css">

 body {
      background-image: linear-gradient(to right, #222222, #66AAFF, #222222);
    }

h2
{
	color: #387d84;
    font-variant: small-caps slashed-zero;
	margin-top: auto;
    margin-left: 370px;
    margin-right: 500px;
	font-size: 50px;
	font-family: "trebuchet ms", sans-serif;    
}

h3
{
	color: #387d84;
    font-variant: small-caps slashed-zero;
    align: center;
	margin: auto;
	font-size: 50px;
	font-family: "trebuchet ms", sans-serif;    
}
.btn
{
	 margin-top: 15px;
    padding: 3px 5px;
    font-size: 19px;
    border-radius: 8px;
    border: none;
    cursor: pointer;
    color: #fff;
    background-color: #387d84;
			 }

.item{
      border-radius: 8px;
      padding: 20px;
	  height: 500px;
      background: rgba( 255, 255, 255, 0.2 );
      border: solid 1px rgba(255,255,255,.3);
      backgroud-clip: padding-box;
      backdrop-filter: blur(10px );
    }

.container
{
  color: #33DD88;
}
.carousel
{
  margin: 20px 0px 20px 0px;}
.bs-example
{
  margin: 20px;}
</style>

</head>


<body>
	
	<%@ include file="/global/nav_global.jsp" %>	
	
	<div class="container">
		 <div class="starter-template">
						<div class="page-header">
						<%@ include file="/global/header.jsp" %>							
						</div>

<!-- Start Bootstrap Carousel  -->
<div class="bs-example">
	<div
      id="myCarousel"
		class="carousel"
		data-interval="2000"
		data-pause="hover"
		data-wrap="true"
		data-keyboard="true"			
		data-ride="carousel">
		
    	<!-- Carousel indicators -->
        <ol class="carousel-indicators">
            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
            <li data-target="#myCarousel" data-slide-to="1"></li>
            <li data-target="#myCarousel" data-slide-to="2"></li>
        </ol>   
       <!-- Carousel items -->
        <div class="carousel-inner">

				 <div class="active item" style="background: url(img/linkedin.png) no-repeat left center; background-size: cover;">
					 <div class="container">
					 <h2>Linkedin</h2>
						 <div class="carousel-caption">
								<a href="https://www.linkedin.com/in/carson-darrow-280823199" class="btn">Learn More</a>
						</div>
					 </div>
				 </div>					

         <div class="item" style="background: url(img/github.png) no-repeat left center; background-size: cover;">
                <h3>Github</h3>
                <div class="carousel-caption">
                <a href="https://github.com" class="btn">Learn More</a>
                </div>
            </div>

         <div class="item" style="background: url(img/bitbucket.png) no-repeat left center; background-size: cover;">
                <h3>Bitbucket</h3>
                <div class="carousel-caption">
                   <a href="https://bitbucket.org/cbd19a/lis4368/src/" class="btn">Learn More</a>						
                </div>
            </div>

        </div>
        <!-- Carousel nav -->
        <a class="carousel-control left" href="#myCarousel" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left"></span>
        </a>
        <a class="carousel-control right" href="#myCarousel" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right"></span>
        </a>
    </div>
</div>


<!-- End Bootstrap Carousel  -->

 	<%@ include file="/global/footer.jsp" %>

	</div> <!-- end starter-template -->
</div> <!-- end container -->

 	<%@ include file="/js/include_js.jsp" %>
	
</body>
</html>
