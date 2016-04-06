<%-- 
    Document   : contact-us
    Created on : 4 Apr, 2016, 8:44:07 PM
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
    <title>Contact Us</title>
    
    <!-- core CSS -->
    <link href="${pageContext.request.contextPath}/CSS/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/CSS/css/font-awesome.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/CSS/css/prettyPhoto.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/CSS/css/animate.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/CSS/css/main.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/CSS/css/responsive.css" rel="stylesheet">
    
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
    <% out.print(new HeaderGenerator().getHeader(session, "contact-us")); %>
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
                        <li><a href="index.jsp">Home</a></li>
                        <li><a href="about-us.html">Our Team</a></li>
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
                        <li class="active"><a href="contact-us.html">Contact</a></li>
                    </ul>
                </div>
            </div><!--/.container--><!----------
        </nav><!--/nav--><!----------
    </header><!--/header--><!----------
    ---------->

    <section id="contact-info">
        <div class="center">                
            <h2>How to Reach Us?</h2>
            <p class="lead">You can contact us at the following locations:</p>
        </div>
        <div class="gmap-area">
            <div class="container">
                <div class="row">
                    <div class="col-sm-5 text-center">
                        <div class="gmap">

                            <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3771.942993741691!2d72.85398031444765!3d19.02223348711873!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3be7cf268c5e833d%3A0xd2be7bbd1ee0e0a1!2sVeermata+Jijabai+Technological+Institute!5e0!3m2!1sen!2sin!4v1459366488482" width="600" height="450" frameborder="0" style="border:0" allowfullscreen></iframe>
                        </div>
                    </div>

                    <div class="col-sm-7 map-content">
                        <ul class="row">
                            <li class="col-sm-6">
                                <address>
                                    <h3 style="color: #0f0f0f">Head Office</h3>
                                    <p>VJTI College, Matunga </p>
                                    <p>Phone:+91 9619432999 <br>
                                    Email Address:info@events.com</p>
                                </address>


                            </li>


                            <li class="col-sm-6">
                                <address>
                                    <h3 style="color: #0f0f0f">Zonal Office</h3>
                                    <p>Canteen, VJTI college</p>
                                    <p>Phone:+91 8855994448 <br>
                                    Email Address:info@events.com</p>
                                </address>


                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </section>  <!--/gmap_area -->

    <section id="contact-page">
        <div class="container">
            <div class="center">        
                <h2>Drop Your Message</h2>
            </div>
            <div class="row contact-wrap"> 
                <div class="status alert alert-success" style="display: none"></div>
                <form id="main-contact-form" class="contact-form" name="contact-form" method="post" action="sendemail.php">
                    <div class="col-sm-5 col-sm-offset-1">
                        <div class="form-group">
                            <label>Name *</label>
                            <input type="text" name="name" class="form-control" required="required">
                        </div>
                        <div class="form-group">
                            <label>Email *</label>
                            <input type="email" name="email" class="form-control" required="required">
                        </div>
                        <div class="form-group">
                            <label>Phone</label>
                            <input type="number" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Company Name</label>
                            <input type="text" class="form-control">
                        </div>                        
                    </div>
                    <div class="col-sm-5">
                        <div class="form-group">
                            <label>Subject *</label>
                            <input type="text" name="subject" class="form-control" required="required">
                        </div>
                        <div class="form-group">
                            <label>Message *</label>
                            <textarea name="message" id="message" required="required" class="form-control" rows="8"></textarea>
                        </div>                        
                        <div class="form-group">
                            <button type="submit" name="submit" class="btn btn-primary btn-lg" required="required">Submit Message</button>
                        </div>
                    </div>
                </form> 
            </div><!--/.row-->
        </div><!--/.container-->
    </section><!--/#contact-page-->


    <footer id="footer" class="midnight-blue">
        <div class="container">
            <div class="row">
                <div class="col-sm-6">
                    &copy; 2016 <a target="_blank" href="http://itunes.com/" >Entertainment Management System</a>. All Rights Reserved.
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
    <script src="${pageContext.request.contextPath}/JS/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/JS/js/jquery.prettyPhoto.js"></script>
    <script src="${pageContext.request.contextPath}/JS/js/jquery.isotope.min.js"></script>
    <script src="${pageContext.request.contextPath}/JS/js/main.js"></script>
    <script src="${pageContext.request.contextPath}/JS/js/wow.min.js"></script>
</body>
</html>