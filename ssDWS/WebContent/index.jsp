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
<link href="static/css/slick/slick.css" rel="stylesheet" />
<link href="static/css/slick/slick-theme.css" rel="stylesheet" />
<link rel="stylesheet" href="static/css/iconfont.css">
<link rel="stylesheet" type="text/css" href="static/css/site.css" />
<link rel="stylesheet" href="static/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="static/css/bootsnav.css" />


</head>
<body data-spy="scroll" data-target=".navbar-collapse"
	data-gr-c-s-loaded="true">
	<div id="loading"></div>
	<div class="wrapper">

		<div class="culmn">

			<c:set var="role" value="${role}" />
			<c:set var="displayPage" value="${displayPage}" />
			<c:choose>

				<c:when test="${role=='admin'}">
					<jsp:include page="views/admin.jsp" flush="true" />
				</c:when>

				<c:otherwise>
					<jsp:include page="views/header.jsp" flush="true" />


					<c:choose>
						<c:when test="${displayPage=='home'}">
							<section id="home" class="home bg-black fix">
								<jsp:include page="views/home.jsp" flush="true" />
							</section>
							<section id="features" class="features roomy-60">
								<jsp:include page="views/product.jsp" flush="true" />
							</section>
							<section id="latest_news" class="latest_news bg-grey roomy-60">
								<jsp:include page="views/news.jsp" flush="true" />
							</section>
						</c:when>

						<c:when test="${displayPage=='contact'}">
							<section id="home" class="contact bg-black fix">
								<jsp:include page="views/contactUs.jsp" flush="true" />
							</section>
						</c:when>

						<c:when test="${displayPage=='login'}">
							<section id="home" class="login bg-black fix">
								<jsp:include page="views/login.jsp" flush="true" />
							</section>
						</c:when>

						<c:otherwise>
							<section id="home" class="home bg-black fix">
								<jsp:include page="views/home.jsp" flush="true" />
							</section>
							<section id="features" class="features roomy-60">
								<jsp:include page="views/product.jsp" flush="true" />
							</section>
							<section id="latest_news" class="latest_news bg-grey roomy-60">
								<jsp:include page="views/news.jsp" flush="true" />
							</section>
						</c:otherwise>
					</c:choose>
					<jsp:include page="views/footer.jsp" flush="true" />
				</c:otherwise>
			</c:choose>
		</div>

		<script src="static/lib/jquery/dist/jquery-1.11.2.min.js"></script>
		<script src="static/lib/bootstrap/dist/js/bootstrap.js"></script>
		<script src="static/css/slick/slick.js"></script>
		<script src="static/css/slick/slick.min.js"></script>
		<script type="text/javascript" src="static/js/script.js"></script>


	</div>
</body>


</html>