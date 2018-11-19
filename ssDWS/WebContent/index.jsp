<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sewa Soft</title>

<link rel="stylesheet" type="text/css"
	href="static/lib/bootstrap/dist/css/bootstrap.css" />
<link rel="stylesheet" href="static/css/slick/slick-theme.css">
<link rel="stylesheet" href="static/css/slick/slick.css">
<link rel="stylesheet" type="text/css" href="static/css/site.css" />
<link rel="stylesheet" href="static/css/font-awesome.min.css">
<link rel="stylesheet" href="static/css/bootsnav.css">

</head>
<body data-spy="scroll" data-target=".navbar-collapse"
	data-gr-c-s-loaded="true">
	<div class="wrapper">

		<div class="culmn">
			<jsp:include page="views/header.jsp" />


			<c:set var="displayPage" value="${displayPage}" />

			<c:choose>
				<c:when test="${displayPage=='home'}">
					<section id="home" class="home bg-black fix">
						<jsp:include page="views/home.jsp" />
					</section>
				</c:when>

				<c:when test="${displayPage=='contact'}">
				<section id="home" class="contact bg-black fix">
					<jsp:include page="views/contactUs.jsp" />
				</section>
				</c:when>

				<c:otherwise>

				</c:otherwise>
			</c:choose>
			<jsp:include page="views/footer.jsp" />
		</div>

		<script src="static/lib/jquery/dist/jquery.js"></script>
		<script src="static/lib/bootstrap/dist/js/bootstrap.js"></script>


		<script src="static/css/slick/slick.js"></script>
		<script src="static/css/slick/slick.min.js"></script>
		<script type="text/javascript" src="static/js/script.js"></script>


	</div>
</body>


</html>