<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
		<meta name="description" content="My online portfolio that illustrates skills acquired while working through various project requirements.">
		<meta name="author" content="Carson Darrow.">
    <link rel="icon" href="favicon.ico">

	<title>LIS4368 - Assignment2</title>

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
					<div class="page-header">
						<%@ include file="global/header.jsp" %>
					</div>

					<h4>Hello Home:</h4>
					<img src="img/HelloHome.png" class="img-responsive center-block" alt="Hello Home" />

					<h4>Hello Servlet:</h4>
					<img src="img/HelloServlet.png" class="img-responsive center-block" alt="Hello Servlet" />

					<h4>Index HTML:</h4>
					<img src="img/IndexHtml.png" class="img-responsive center-block" alt="Hello Home" />

					<h4>Query HTML:</h4>
					<img src="img/QueryHtml.png" class="img-responsive center-block" alt="Hello Servlet" />

					<h4>Query Result:</h4>
					<img src="img/QueryResults.png" class="img-responsive center-block" alt="Hello Home" />

	<%@ include file="/global/footer.jsp" %>

	</div> <!-- end starter-template -->
 </div> <!-- end container -->

 	<%@ include file="/js/include_js.jsp" %>	

</body>
</html>
