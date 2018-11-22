<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="static/lib/bootstrap/dist/css/bootstrap.css" />
<link rel="stylesheet" type="text/css" href="static/css/site.css" />

</head>
<body>
	<div class="mainContainer">
		<div class="row">
			<div class="col-sm-6">

				<div id="myCarousel" class="carousel slide" data-ride="carousel">
					<!-- Indicators -->
					<ol class="carousel-indicators">
						<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
						<li data-target="#myCarousel" data-slide-to="1"></li>
						<li data-target="#myCarousel" data-slide-to="2"></li>
					</ol>

					<!-- Wrapper for slides -->
					<div class="carousel-inner">
						<div class="item active">
							<img src="static/images/a.jpg" alt="Nepal">
							<div class="carousel-caption">
								<h2>News Titles</h2>
								<p>Descriptions</p>
							</div>
						</div>

						<div class="item">
							<img src="static/images/b.jpg" alt="device">
							<div class="carousel-caption">
								<h2>News Titles</h2>
								<p>Descriptions</p>
							</div>
						</div>

						<div class="item">
							<img src="static/images/c.jpg" alt="Jhonson">
							<div class="carousel-caption">
								<h2>News Titles</h2>
								<p>Descriptions</p>
							</div>
						</div>
					</div>

					<!-- Left and right controls -->
					<a class="left carousel-control" href="#myCarousel"
						data-slide="prev"> <span
						class="glyphicon glyphicon-chevron-left"></span> <span
						class="sr-only">Previous</span>
					</a> <a class="right carousel-control" href="#myCarousel"
						data-slide="next"> <span
						class="glyphicon glyphicon-chevron-right"></span> <span
						class="sr-only">Next</span>
					</a>
				</div>

			</div>

			<div class="col-sm-6">
				<h1>Latest News</h1>

				<c:if test="${not empty myNews}">
					<c:forEach items="${myNews}" var="item">
						<div class="newsList">
							<h3>
								<c:out value="${item.title}" default="Default value" />
							</h3>
							 
							<div>
								<c:out value="${item.description}" default="Default value" />
							</div>
						</div>
						</br>
					</c:forEach>
				</c:if>
			</div>
		</div>
	</div>
</body>
</html>
