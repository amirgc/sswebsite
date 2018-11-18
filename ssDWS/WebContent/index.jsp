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
<link rel="stylesheet" type="text/css" href="static/css/site.css" />
<link rel="stylesheet" href="static/css/font-awesome.min.css">
<link rel="stylesheet" href="static/css/bootsnav.css">


</head>
<body data-spy="scroll" data-target=".navbar-collapse"
	data-gr-c-s-loaded="true">
	<div class="wrapper">

		<div class="culmn">

			<!--Header-->
			<!--Home page style-->
			<nav class="navbar navbar-default bootsnav navbar-fixed on no-full">
				<div class="navbar-top bg-grey fix">
					<div class="container">
						<div class="row">
							<div class="col-md-8">
								<div class="navbar-callus text-left sm-text-center">
									<ul class="list-inline">
										<li><i class="fa fa-map-marker"></i> Gairidhara,
											Kathmandu, Nepal</li>&nbsp; &nbsp;
										<li><i class="fa fa-phone"></i> Call us: 977-1-4429829</li>
										<li><a href="mailto:info@gapsco.com" target="_blank"><i
												class="fa fa-envelope-o"></i> Contact us: info@gapsco.com</a></li>
									</ul>
								</div>
							</div>
							<div class="col-md-4">
								<div class="navbar-socail text-right sm-text-center">
									<ul class="list-inline">
										<li><a href="https://www.facebook.com/gapsco"
											target="_blank"><i class="fa fa-facebook"></i></a></li>
										<li><a href="https://www.linkedin.com/company/gapsco"
											target="_blank"><i class="fa fa-linkedin"></i></a></li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="container">

					<!-- Start Header Navigation -->
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse"
							data-target="#navbar-menu">
							<i class="fa fa-bars"></i>
						</button>

						<!--<a class="navbar-brand" href="#brand">
                            <img src="images/logo-gapsco.png" class="logo" alt="">
                        </a>-->

						<span class="hidden-xs hidden-sm visible-md visible-lg"
							style="margin: 5px 0 0 0"> <a href="index.php"
							title="Gapsco"> <img src="static/images/sewasoft.png"
								alt="Gapsco"></a>
						</span> <span class="visible-xs visible-sm hidden-md hidden-lg"
							style="margin: 10px 0 10px 0"> <a href="index.php"
							title="Gapsco"> <img
								src="static/images/logo-gapsco-small.png" alt="Gapsco"></a>
						</span>
					</div>
					<!-- End Header Navigation -->

					<!-- navbar menu -->
					<div class="collapse navbar-collapse" id="navbar-menu">
						<ul class="nav navbar-nav navbar-right">
							<li><a href="index.php" title="gapsco">Home</a></li>
							<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown" role="button" aria-haspopup="true"
								aria-expanded="false" title="a little bit about us">Company</a>
								<ul class="dropdown-menu animated">
									<li><a href="introduction.php">Introduction</a></li>
									<li><a href="our_strength_successes.php">Our Strength
											&amp; Successes</a></li>
									<li><a href="key_strength.php">Key Strength</a></li>
									<li><a
										href="software_development_methology_Human_Resources.php">Software
											Development &amp; Human Resource</a></li>
									<li><a href="technical_experties.php">Technical
											Experties</a></li>
									<li><a href="software_development_methology.php">Software
											Development Methodology</a></li>
									<li><a href="client_tele.php">Valued Client</a></li>
									<li><a href="events_activities.php">Events &amp;
											Activities</a></li>
									<li><a href="news.php">News</a></li>
									<li><a href="#">Team</a></li>
								</ul></li>
							<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown" role="button" aria-haspopup="true"
								aria-expanded="false" title="what we've been up to">Portfolio</a>
								<ul class="dropdown-menu animated"
									style="display: none; opacity: 1;">
									<li><a href="software_development.php">Software
											Development</a></li>
									<li><a href="mobile_apps.php">Mobile Apps</a></li>
									<li><a href="website_solutions.php">Website Solutions</a></li>
								</ul></li>
							<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown" role="button" aria-haspopup="true"
								aria-expanded="false" title="what we can do for you">Services</a>
								<ul class="dropdown-menu animated">
									<li><a href=".NET_Software_Development.php">.NET
											Software Development</a></li>
									<li><a href="#">Android App Development</a></li>
									<li><a href="#">iOS App Development</a></li>
									<li><a href="PHP_Development.php">PHP Development</a></li>
									<li><a href="website_design.php">Website Design</a></li>
									<li><a href="social_media_branding.php">Social Media
											Branding</a></li>
									<li><a href="SEO.php">Search Engine Optimization</a></li>
								</ul></li>
							<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown" role="button" aria-haspopup="true"
								aria-expanded="false" title="what we have">Products</a>
								<ul class="dropdown-menu animated">
									<li><a href="gapsco-premium-one.php">Gapsco®
											Premium-One BI</a></li>
									<li><a href="variantInet.php">VariantInet</a></li>
									<li><a href="myInvestment.php">MyInvestment 1.0</a></li>
									<li><a href="#">CSLog</a></li>
									<li><a href="#">Vital Care</a></li>
								</ul></li>
							<li><a href="CSR.php" title="we are for">Social
									Initiatives</a></li>
							<li><a href="jobs.php" title="career">Jobs</a></li>
							<li><a href="testimonials.php" title="what others say">Testimonials</a></li>
							<li><a href="contact-us.php" title="how to reach us">Contact
									Us</a></li>
						</ul>
					</div>
					<!-- /.navbar-collapse -->
				</div>

			</nav>

			<section id="home" class="home bg-black fix">
				<jsp:include page="views/home.jsp" /></section>


		</div>

		<script src="static/lib/jquery/dist/jquery.js"></script>
		<script src="static/lib/bootstrap/dist/js/bootstrap.js"></script>

	</div>
</body>


</html>