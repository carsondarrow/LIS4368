<!DOCTYPE html>
<html lang="en">
<head>

<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="My online portfolio that illustrates skills acquired while working through various project requirements.">
	<meta name="author" content="Carson Darrow">
	<link rel="icon" href="favicon.ico">

	<title>LIS4368 - Assignment3</title>

	<%@ include file="/css/include_css.jsp" %>		

	<style>

		html
		{
			height: 100%;
		}
			body 
		{
			background-image: linear-gradient(to right, #222222, #66AAFF, #222222);
		}
		
		p
		{
			font-size: 20px;
		}

		h4
		{
			color: #000;
		}

		</style> 
	
</head>
<body>

<!-- display application path -->
<% //= request.getContextPath()%>
	
<!-- can also find path like this...<a href="${pageContext.request.contextPath}${'/a5/index.jsp'}">A5</a> -->

	<%@ include file="/global/nav.jsp" %>	

	<div class="container">
		<div class="starter-template">
			<div class="row">
				<div class="col-sm-8 col-sm-offset-2">
					
					<div class="page-header">
						<%@ include file="global/header.jsp" %>
					</div>

					<br /> <br />
					<b>MySQL Workbench and SQL Files:</b><br />
					<a href="docs/a3.mwb">Petstore MySQL Workbench File</a>
				<br />
					<a href="docs/a3.sql">Petstore SQL File</a>	
					<br />
					<br />
					<br />			

					<b>Petstore Database (Entity Relationship Diagram):</b><br />
					<img src="img/a3_erd.png" class="img-responsive" alt="A3 ERD" />
					<b> </b>

					<b>Pet Store:</b><br />
					<img src="img/petstore_erd.png" class="img-responsive" alt="A3 Pet Store" />
					<b> </b>

					<b>Pet:</b><br />
					<img src="img/pet_erd.png" class="img-responsive" alt="A3 Pet" />
					<b> </b>

					<b>Customer:</b><br />
					<img src="img/cust_erd.png" class="img-responsive" alt="A3 Customer" />

				</div>
			</div>

	<%@ include file="/global/footer.jsp" %>

	</div> <!-- end starter-template -->
 </div> <!-- end container -->

 	<%@ include file="/js/include_js.jsp" %>		
 
</body>
</html>