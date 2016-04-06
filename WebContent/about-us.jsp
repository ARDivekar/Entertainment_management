<%-- 
    Document   : about-us
    Created on : 4 Apr, 2016, 8:37:53 PM
    Author     : Abhishek Divekar
--%>

<%@page import="InterfaceClasses.HeaderGenerator"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>About Us</title>
	
	<!-- core CSS -->
    <link href="${pageContext.request.contextPath}/CSS/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/CSS/css/font-awesome.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/CSS/css/prettyPhoto.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/CSS/css/animate.min.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/CSS/css/main.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/CSS/css/responsive.css" rel="stylesheet">
	<style>
		.img{

			border: 1px solid #000 ;
			-webkit-box-shadow: 5px 5px 5px #2c3e50;
			box-shadow: 1px 1px 1px black;
		}

		/*MORPH*/
		.morph {
			-webkit-transition: all 0.5s ease;
			-moz-transition: all 0.5s ease;
			-o-transition: all 0.5s ease;
			-ms-transition: all 0.5s ease;
			transition: all 0.5s ease;
		}

		.morph:hover {
			border-radius: 50%;
			-webkit-transform: rotate(360deg);
			-moz-transform: rotate(360deg);
			-o-transform: rotate(360deg);
			-ms-transform: rotate(360deg);
			transform: rotate(360deg);
		}
	</style>
    <!--[if lt IE 9]>
    <script src="${pageContext.request.contextPath}/JS/js/html5shiv.js"></script>
    <script src="${pageContext.request.contextPath}/JS/js/respond.min.js"></script>
    <![endif]-->       
    <link rel="shortcut icon" href="images/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
</head><!--/head-->

<body>
    <% out.print(new HeaderGenerator().getHeader(session, "about-us")); %>
    <!----------
    <header id="header">
        <div class="top-bar">
            <div class="container">
                <div class="row">
                    <div class="col-sm-6 col-xs-4">
                        <div class="top-number"><p><i class="fa fa-phone-square"></i>  +91 9619432999</p></div>
                    </div>
                    <div class="col-sm-6 col-xs-8">
                       <div class="social">
                            <ul class="social-share">
                                <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                                <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                                <li><a href="#"><i class="fa fa-linkedin"></i></a></li> 
                                <li><a href="#"><i class="fa fa-dribbble"></i></a></li>
                                <li><a href="#"><i class="fa fa-skype"></i></a></li>
                            </ul>
                            <div class="search">
                                <form role="form">
                                    <input type="text" class="search-form" autocomplete="off" placeholder="Search">
                                    <i class="fa fa-search"></i>
                                </form>
                           </div>
                       </div>
                    </div>
                </div>
            </div><!--/.container--><!----------
        </div><!--/.top-bar--><!----------

        <nav class="navbar navbar-inverse" role="banner">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.jsp"><img src="images/ems_logo.png" height="75" width="160" alt="logo"></a>
                </div>

				<div class="collapse navbar-collapse navbar-right">
					<ul class="nav navbar-nav">
						<li ><a href="index.jsp">Home</a></li>
						<li class="active"><a href="about-us.html">Our Team</a></li>
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown">Discover<i class="fa fa-angle-down"></i></a>
							<ul class="dropdown-menu">
								<li ><a href="discovermovies.html">Movies</a></li>
								<li><a href="discoverbooks.html">Books</a></li>
								<li><a href="discovertvshows">TVShows</a></li>
								<li><a href="discovermusic.html">Music</a></li>
							</ul>
						</li>
						<li><a href="calendar.html">Events</a></li>
						<li><a href="register.jsp">Register</a></li>
						<li><a href="login.jsp">Login</a></li>
						<li><a href="contact-us.jsp">Contact</a></li>
					</ul>
				</div>
            </div><!--/.container--><!----------
        </nav><!--/nav--><!----------
	</header><!--/header--><!----------
        ---------->

    <section id="about-us">
        <div class="container">



			<!-- our-team -->
			<div class="team">
				<div class="center wow fadeInDown">
					<h2>Our Team</h2>

				</div>

				<div class="row clearfix">
					<div class="col-md-4 col-sm-6">	
						<div class="single-profile-top wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="300ms">
							<div class="media">
								<div class="pull-left">
									<a href="#"><img class="media-object img-rounded img morph pic" src="images/demo.jpg" height="150" width="140"  alt=""></a>
								</div>
								<div class="media-body">
									<h4>Jay Doshi</h4>
									<h5>Founder and CEO</h5>
									<ul class="tag clearfix">
										<li class="btn"><a href="#">Web</a></li>
										<li class="btn"><a href="#">Ui</a></li>
										<li class="btn"><a href="#">Ux</a></li>
										<li class="btn"><a href="#">Photoshop</a></li>
									</ul>
									
									<ul class="social_icons">
										<li><a href="#"><i class="fa fa-facebook"></i></a></li>
										<li><a href="#"><i class="fa fa-twitter"></i></a></li> 
										<li><a href="#"><i class="fa fa-google-plus"></i></a></li>
									</ul>
								</div>
							</div><!--/.media -->
							<p>Can adapt to any situation. I thrive in a fluctuating environment and I transform unexpected obstacles into stepping stones for achievements.</p>
						</div>
					</div><!--/.col-lg-4 -->
					
					
					<div class="col-md-4 col-sm-6 col-md-offset-2">	
						<div class="single-profile-top wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="300ms">
							<div class="media">
								<div class="pull-left">
									<a href="#"><img class="media-object img-rounded img morph pic" src="images/person2.jpg" height="150" width="140" alt=""></a>
								</div>
								<div class="media-body">
									<h4>Abhishek Divekar</h4>
									<h5>Founder and CEO</h5>
									<ul class="tag clearfix">
										<li class="btn"><a href="#">Web</a></li>
										<li class="btn"><a href="#">Ui</a></li>
										<li class="btn"><a href="#">Ux</a></li>
										<li class="btn"><a href="#">Photoshop</a></li>
									</ul>
									<ul class="social_icons">
										<li><a href="#"><i class="fa fa-facebook"></i></a></li>
										<li><a href="#"><i class="fa fa-twitter"></i></a></li> 
										<li><a href="#"><i class="fa fa-google-plus"></i></a></li>
									</ul>
								</div>
							</div><!--/.media -->
							<p>Can adapt to any situation. I thrive in a fluctuating environment and I transform unexpected obstacles into stepping stones for achievements.</p>
						</div>
					</div><!--/.col-lg-4 -->					
				</div> <!--/.row -->
				<div class="row team-bar">
					<div class="first-one-arrow hidden-xs">
						<hr>
					</div>
					<div class="first-arrow hidden-xs">
						<hr> <i class="fa fa-angle-up"></i>
					</div>
					<div class="second-arrow hidden-xs">
						<hr> <i class="fa fa-angle-down"></i>
					</div>
					<div class="third-arrow hidden-xs">
						<hr> <i class="fa fa-angle-up"></i>
					</div>
					<div class="fourth-arrow hidden-xs">
						<hr> <i class="fa fa-angle-down"></i>
					</div>
				</div> <!--skill_border-->       

				<div class="row clearfix">   
					<div class="col-md-4 col-sm-6 col-md-offset-2">	
						<div class="single-profile-bottom wow fadeInUp" data-wow-duration="1000ms" data-wow-delay="600ms">
							<div class="media">
								<div class="pull-left">
									<a href="#"><img class="media-object img-rounded img morph pic" src="images/person1.jpg" height="150" width="140" alt=""></a>
								</div>

								<div class="media-body">
									<h4>Sahaj Gandhi</h4>
									<h5>Founder and CEO</h5>
									<ul class="tag clearfix">
										<li class="btn"><a href="#">Web</a></li>
										<li class="btn"><a href="#">Ui</a></li>
										<li class="btn"><a href="#">Ux</a></li>
										<li class="btn"><a href="#">Photoshop</a></li>
									</ul>
									<ul class="social_icons">
										<li><a href="#"><i class="fa fa-facebook"></i></a></li>
										<li><a href="#"><i class="fa fa-twitter"></i></a></li> 
										<li><a href="#"><i class="fa fa-google-plus"></i></a></li>
									</ul>
								</div>
							</div><!--/.media -->
							<p>Can adapt to any situation. I thrive in a fluctuating environment and I transform unexpected obstacles into stepping stones for achievements.</p>

						</div>
					</div>
					<div class="col-md-4 col-sm-6 col-md-offset-2">
						<div class="single-profile-bottom wow fadeInUp" data-wow-duration="1000ms" data-wow-delay="600ms">
							<div class="media">
								<div class="pull-left">
									<a href="#"><img class="media-object img-rounded img morph pic" src="images/person3.jpg" height="150" width="140" alt=""></a>
								</div>
								<div class="media-body">
									<h4>Advik Shetty</h4>
									<h5>Founder and CEO</h5>
									<ul class="tag clearfix">
										<li class="btn"><a href="#">Web</a></li>
										<li class="btn"><a href="#">Ui</a></li>
										<li class="btn"><a href="#">Ux</a></li>
										<li class="btn"><a href="#">Photoshop</a></li>
									</ul>
									<ul class="social_icons">
										<li><a href="#"><i class="fa fa-facebook"></i></a></li>
										<li><a href="#"><i class="fa fa-twitter"></i></a></li> 
										<li><a href="#"><i class="fa fa-google-plus"></i></a></li>
									</ul>
								</div>
							</div><!--/.media -->
							<p>Can adapt to any situation. I thrive in a fluctuating environment and I transform unexpected obstacles into stepping stones for achievements.</p>

						</div>
					</div>
				</div>	<!--/.row-->
			</div><!--section-->
		</div><!--/.container-->
    </section><!--/about-us-->
	


    <footer id="footer" class="midnight-blue">
        <div class="container">
            <div class="row">
                <div class="col-sm-6">
                    &copy; 2016 <a target="_blank" href="/home" >Entertainment Management System</a>. All Rights Reserved.
                </div>
                <div class="col-sm-6">
                    <ul class="pull-right">
                        <li><a href="/home">Home</a></li>
                        <li><a href="/about-us">About Us</a></li>
                        <li><a href="#">Faq</a></li>
                        <li><a href="/contact-us">Contact Us</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </footer><!--/#footer-->
    

    <script src="${pageContext.request.contextPath}/JS/js/jquery.js"></script>
    <script type="text/javascript">
        $('.carousel').carousel()
    </script>
    <script src="${pageContext.request.contextPath}/JS/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/JS/js/jquery.prettyPhoto.js"></script>
    <script src="${pageContext.request.contextPath}/JS/js/jquery.isotope.min.js"></script>
    <script src="${pageContext.request.contextPath}/JS/js/main.js"></script>
    <script src="${pageContext.request.contextPath}/JS/js/wow.min.js"></script>
</body>
</html>
