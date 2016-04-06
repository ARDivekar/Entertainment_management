<%-- 
    Document   : home
    Created on : 4 Apr, 2016, 7:47:14 PM
    Author     : Abhishek Divekar
--%>

<%@page import="InterfaceClasses.HeaderGenerator"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" >
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Home</title>
	
	<!-- core CSS -->
    <link href="${pageContext.request.contextPath}/CSS/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/CSS/css/font-awesome.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/CSS/css/animate.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/CSS/css/prettyPhoto.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/CSS/css/main.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/CSS/css/responsive.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <script src="${pageContext.request.contextPath}/JS/js/html5shiv.js"></script>
    <script src="${pageContext.request.contextPath}/JS/js/respond.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/JS/js/move-top.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/JS/js/easing.js"></script>
    <![endif]-->       
    <link rel="shortcut icon" href="images/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
    <style>
        .btn1 {
            background: #e03d31;
            background-image: -webkit-linear-gradient(top, #e03d31, #ff4a4a);
            background-image: -moz-linear-gradient(top, #e03d31, #ff4a4a);
            background-image: -ms-linear-gradient(top, #e03d31, #ff4a4a);
            background-image: -o-linear-gradient(top, #e03d31, #ff4a4a);
            background-image: linear-gradient(to bottom, #e03d31, #ff4a4a);
            -webkit-border-radius: 10;
            -moz-border-radius: 10;
            border-radius: 10px;
            text-shadow: 1px 1px 5px #2b2a2b;
            font-family: Georgia;
            color: #ffffff;
            font-size: 15px;
            padding: 5px 10px 5px 10px;
            text-decoration: none;
        }

        .btn1:hover {
            background: #f53942;
            background-image: -webkit-linear-gradient(top, #f53942, #990202);
            background-image: -moz-linear-gradient(top, #f53942, #990202);
            background-image: -ms-linear-gradient(top, #f53942, #990202);
            background-image: -o-linear-gradient(top, #f53942, #990202);
            background-image: linear-gradient(to bottom, #f53942, #990202);
            text-decoration: none;
        }
        .shadow{
            text-shadow:
                    -1px -1px 0 #000,
                    1px -1px 0 #000,
                    -1px 1px 0 #000,
                    1px 1px 0 #000;
        }
        #toTop {
            display: none;
            text-decoration: none;
            position: fixed;
            bottom: 14px;
            right: 3%;
            overflow: hidden;
            width: 40px;
            height: 40px;
            border: none;
            text-indent: 100%;
            background: url("images/to-top1.png") no-repeat 0px 0px;
            scrollSpeed: 20;
            transition-duration: 1s;

        }
        #toTopHover {
            width: 40px;
            height: 40px;
            display: block;
            overflow: hidden;
            float: right;
            opacity: 0;
            -moz-opacity: 0;
            filter: alpha(opacity=0);
        }
    </style>
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
    <script type="text/javascript">
        $(window).load(function() {
            $(".loader").fadeOut("slow");
        })

        $(document).ready(function() {
            $().UItoTop({ easingType: 'easeOutQuart' });

        });

    </script>

</head><!--/head-->

<body class="homepage">

    <% out.print(new HeaderGenerator().getHeader(session, "home")); %>
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
                        <li class="active"><a href="index.jsp">Home</a></li>
                        <li><a href="about-us.jsp">Our Team</a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Discover<i class="fa fa-angle-down"></i></a>
                            <ul class="dropdown-menu">
                                <li ><a href="discovermovies.html">Movies</a></li>
                                <li class="active"><a href="discoverbooks.html">Books</a></li>
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

    <section id="main-slider" class="no-margin">
        <div class="carousel slide">
            <ol class="carousel-indicators">
                <li data-target="#main-slider" data-slide-to="0" class="active"></li>
                <li data-target="#main-slider" data-slide-to="1"></li>
                <li data-target="#main-slider" data-slide-to="2"></li>
            </ol>
            <div class="carousel-inner">

                <div class="item active" style="background-image: url(images/slider/b3.jpg)">
                    <div class="container">
                        <div class="row slide-margin">
                            <div class="col-sm-6">
                                <div class="carousel-content">
                                    <h1 class="animation animated-item-1 shadow">Discover latest Releases</h1>
                                    <a class="btn-slide animation animated-item-3" href="#">Discover</a>
                                </div>
                            </div>



                        </div>
                    </div>
                </div><!--/.item-->

                <div class="item" style="background-image: url(images/slider/b5.jpg)">
                    <div class="container">
                        <div class="row slide-margin">
                            <div class="col-sm-6">
                                <div class="carousel-content">
                                    <h1 class="animation animated-item-1 shadow">Most Popular Movies</h1>
                                    <a class="btn-slide animation animated-item-3" href="#">Discover</a>
                                </div>
                            </div>


                        </div>
                    </div>
                </div><!--/.item-->

                <div class="item" style="background-image: url(images/slider/b6.jpg)">
                    <div class="container">
                        <div class="row slide-margin">
                            <div class="col-sm-6">
                                <div class="carousel-content">
                                    <h1 class="animation animated-item-1 shadow">Top Rated TV Shows and Albums</h1>
                                    <a class="btn-slide animation animated-item-3" href="#">Discover</a>
                                </div>
                            </div>

                        </div>
                    </div>
                </div><!--/.item-->
            </div><!--/.carousel-inner-->
        </div><!--/.carousel-->
        <a class="prev hidden-xs" href="#main-slider" data-slide="prev">
            <i class="fa fa-chevron-left"></i>
        </a>
        <a class="next hidden-xs" href="#main-slider" data-slide="next">
            <i class="fa fa-chevron-right"></i>
        </a>
    </section><!--/#main-slider-->


    <section id="recent-works">
        <div class="container">
            <div class="center wow fadeInDown">
                <h2>Our services at a glance..</h2>
            </div>

            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <div class="recent-work-wrap">
                        <img class="img-responsive" src="images/portfolio/recent/item1.png" alt="">
                        <div class="overlay">
                            <div class="recent-work-inner">
                                <h3><a href="#">Check item ratings</a> </h3>
                                <p>We have a huge collection, simply login to check the best items</p>
                                <a class="preview" href="images/portfolio/full/item1.png" rel="prettyPhoto"><i class="fa fa-eye"></i> View</a>
                            </div> 
                        </div>
                    </div>
                </div>   

                <div class="col-xs-12 col-sm-4 col-md-3">
                    <div class="recent-work-wrap">
                        <img class="img-responsive" src="images/portfolio/recent/item2.png" alt="">
                        <div class="overlay">
                            <div class="recent-work-inner">
                                <h3><a href="#">Write to us</a></h3>
                                <p>Feel free to write to us, nothing makes us happier than customer satisfaction</p>
                                <a class="preview" href="images/portfolio/full/item2.png" rel="prettyPhoto"><i class="fa fa-eye"></i> View</a>
                            </div> 
                        </div>
                    </div>
                </div> 

                <div class="col-xs-12 col-sm-4 col-md-3">
                    <div class="recent-work-wrap">
                        <img class="img-responsive" src="images/portfolio/recent/item3.png" alt="">
                        <div class="overlay">
                            <div class="recent-work-inner">
                                <h3><a href="#">Keep urself up-to-date</a></h3>
                                <p>Never miss a movie or an album release again, just login and enjoy</p>
                                <a class="preview" href="images/portfolio/full/item3.png" rel="prettyPhoto"><i class="fa fa-eye"></i> View</a>
                            </div> 
                        </div>
                    </div>
                </div>   

                <div class="col-xs-12 col-sm-4 col-md-3">
                    <div class="recent-work-wrap">
                        <img class="img-responsive" src="images/portfolio/recent/item4.png" alt="">
                        <div class="overlay">
                            <div class="recent-work-inner">
                                <h3><a href="#">Now also on the App store </a></h3>
                                <p>Help us grow, follow us on the App Store as well. Download the app</p>
                                <a class="preview" href="images/portfolio/full/item4.png" rel="prettyPhoto"><i class="fa fa-eye"></i> View</a>
                            </div> 
                        </div>
                    </div>
                </div>   
                
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <div class="recent-work-wrap">
                        <img class="img-responsive" src="images/portfolio/recent/item5.png" alt="">
                        <div class="overlay">
                            <div class="recent-work-inner">
                                <h3><a href="#">Watch movie trailers!</a></h3>
                                <p>Watch movie and tv show teasers and trailers and set the mood for their release</p>
                                <a class="preview" href="images/portfolio/full/item5.png" rel="prettyPhoto"><i class="fa fa-eye"></i> View</a>
                            </div> 
                        </div>
                    </div>
                </div>   

                <div class="col-xs-12 col-sm-4 col-md-3">
                    <div class="recent-work-wrap">
                        <img class="img-responsive" src="images/portfolio/recent/item6.png" alt="">
                        <div class="overlay">
                            <div class="recent-work-inner">
                                <h3><a href="#">Our collection </a></h3>
                                <p>Check out our collection, as we guarantee it would amaze you</p>
                                <a class="preview" href="images/portfolio/full/item6.png" rel="prettyPhoto"><i class="fa fa-eye"></i> View</a>
                            </div> 
                        </div>
                    </div>
                </div> 

                <div class="col-xs-12 col-sm-4 col-md-3">
                    <div class="recent-work-wrap">
                        <img class="img-responsive" src="images/portfolio/recent/item7.png" alt="">
                        <div class="overlay">
                            <div class="recent-work-inner">
                                <h3><a href="#">Upcoming Events </a></h3>
                                <p>Dont miss the oppurtunity to follow your favourite content as soon as it hits the market. Keep track of upcoming events</p>
                                <a class="preview" href="images/portfolio/full/item7.png" rel="prettyPhoto"><i class="fa fa-eye"></i> View</a>
                            </div> 
                        </div>
                    </div>
                </div>   

                <div class="col-xs-12 col-sm-4 col-md-3">
                    <div class="recent-work-wrap">
                        <img class="img-responsive" src="images/portfolio/recent/item8.png" alt="">
                        <div class="overlay">
                            <div class="recent-work-inner">
                                <h3><a href="#">Reviews</a></h3>
                                <p>Share your expertise with others by writing item and event reviews and help others decide</p>
                                <a class="preview" href="images/portfolio/full/item8.png" rel="prettyPhoto"><i class="fa fa-eye"></i> View</a>
                            </div> 
                        </div>
                    </div>
                </div>   
            </div><!--/.row-->
        </div><!--/.container-->
    </section><!--/#recent-works-->







    <section id="conatcat-info">
        <div class="container">
            <div class="row">
                <div class="col-sm-8">
                    <div class="media contact-info wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="600ms">
                        <div class="pull-left">
                            <i class="fa fa-phone"></i>
                        </div>
                        <div class="media-body">
                            <h2>Have a question?</h2>
                            <p>Feel free to reach out to us by visiting our <button type="submit" value="Contact Us" class="btn1" >Contact Us</button> page</p>
                        </div>
                    </div>
                </div>
            </div>
        </div><!--/.container-->    
    </section><!--/#conatcat-info-->



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
    <a href="#" id="toTop" style="display: block; "> <span id="toTopHover" style="opacity: 2;"> </span></a>

    <script src="${pageContext.request.contextPath}/JS/js/jquery.js"></script>
    <script src="${pageContext.request.contextPath}/JS/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/JS/js/jquery.prettyPhoto.js"></script>
    <script src="${pageContext.request.contextPath}/JS/js/jquery.isotope.min.js"></script>
    <script src="${pageContext.request.contextPath}/JS/js/main.js"></script>
    <script src="${pageContext.request.contextPath}/JS/js/wow.min.js"></script>

</body>
</html>
