<%-- 
    Document   : events.jsp
    Created on : 7 Apr, 2016, 9:43:12 AM
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
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="">
	<meta name="author" content="">
	<title>Events</title>
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<link href="css/font-awesome.min.css" rel="stylesheet">
	<link href="css/prettyPhoto.css" rel="stylesheet">
	<link href="css/animate.min.css" rel="stylesheet">
	<link href="css/main.css" rel="stylesheet">
	<link href="css/responsive.css" rel="stylesheet">
	<!--[if lt IE 9]>
	<script src="js/html5shiv.js"></script>
	<script src="js/respond.min.js"></script>
	<![endif]-->
	<link rel="shortcut icon" href="images/ico/favicon.ico">
	<link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
	<link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
	<link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
	<link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
	
	<script type="text/javascript">

		var monthtext = ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sept', 'Oct', 'Nov', 'Dec'];

		function populatedropdown(monthfield, yearfield) {
			var today = new Date()
			var monthfield = document.getElementById(monthfield)
			var yearfield = document.getElementById(yearfield)
				//select today's day
			for (var m = 0; m < 12; m++)
				monthfield.options[m] = new Option(monthtext[m], monthtext[m])
			monthfield.options[today.getMonth()] = new Option(monthtext[today.getMonth()], monthtext[today.getMonth()], true, true) //select today's month
			var thisyear = today.getFullYear()
			for (var y = 0; y < 20; y++) {
				yearfield.options[y] = new Option(thisyear, thisyear)
				thisyear += 1
			}
			yearfield.options[0] = new Option(today.getFullYear(), today.getFullYear(), true, true) //select today's year
		}
	</script>
	
	
	<!-- Loading gif functions -->
	<link rel="stylesheet" href="loader.css">
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.5.2/jquery.min.js"></script>
	<script src="http://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.2/modernizr.js"></script>
	<script src="loader.js"></script>
	<!-- Loader functions' end -->
	
	<style>
		.nav-tabs {
			border-right: none;
		}
		
		.nav-tabs >li {
			border-bottom: none;
		}
		
		.tab-content {
			border-bottom-right-radius: 5px;
			border-bottom-left-radius: 5px;
			border-top-right-radius: 5px;
			background: #f5f5f5;
		}
	</style>
</head>

<body>
	
	<!-- This loads gif -->
	<div class="se-pre-con"></div>

	<% out.print(new HeaderGenerator().getHeader(session, "events")); %>
	<section id="portfolio">

		<div class="container">

			<form action="#" name="someform" class="form-inline">
				<div class="form-group">
					<select id="monthdropdown" class="form-control">
					</select>
					<select id="yeardropdown" class="form-control">
					</select>
					<button class="btn btn-danger">Submit</button>
				</div>
			</form>

			<script type="text/javascript">
				//populatedropdown(id_of_day_select, id_of_month_select, id_of_year_select)
				window.onload = function () {
					populatedropdown("monthdropdown", "yeardropdown")
				}
			</script>
			<br/>
			<p></p>
			<ul class="nav nav-tabs">
				<li role="presentation" class="active"><a data-toggle="tab" href="#events">Events</a></li>
				<li role="presentation"><a data-toggle="tab" href="#sports">Sports</a></li>
				<li role="presentation"><a data-toggle="tab" href="#plays">Plays</a></li>
			</ul>

			<div class="tab-content">
				<div id="events" class="tab-pane fade in active">
					<h3>30<sup>th</sup> March 2016</h3>
					<div class="row">
						<div class="col-md-4">
							<img src="http://in.bmscdn.com/events/eventlisting/ET00039550.jpg" style="height: 200px; width=100%;" alt="image">
							<div class="text-center">
								<a href="#myModal" data-toggle="modal">94.3 Radio ONE presents Forever Rock - Tribute to Queen by Wildside</a>
							</div>
							<!-- Modal -->
							<div id="myModal" class="modal fade" role="dialog">
								<div class="modal-dialog">

									<!-- Modal content-->
									<div class="modal-content">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal">&times;</button>
											<h4 class="modal-title">Event Details</h4>
										</div>
										<div class="modal-body" style="overflow:auto;">
											<!--
											<img src="http://in.bmscdn.com/events/eventlisting/ET00039492.jpg" style="height: 200px; width=100%;" alt="image">
											-->
											<h2 style="color:#d9534f;">BlueFROG presents Zokhuma, Achint &amp; Boombay Djembe Folas</h2>
											<br>
											<h4><b>Venue: </b>Blue Frog, Mumbai,</h4>
											<p>Zeba Center, Mathuradas Mill Compound, Senapati Bapat Marg, Lower Parel, Mumbai, Maharashtra 400013, India</p>
											<h4><b>Time: </b></h4><p>Thu 31 Mar, 09:30 PM</p>
											<h4><b>Duration: </b></h4><p>3 hrs 30 mins</p>
											<h4><b>Price: </b></h4><p>Single Entry: &#8377;350</p>
											<h4><b>Artists: </b></h4><p>Achint, Zokhuma, Boombay Djembe Folas</p>
											<h4><b>Category: </b></h4><p>Alternative; International; Others</p>
											<br>
											<h5>Terms and Conditions:</h5>
											<ul>
												<li>For table reservations, please call 022-61586158/91-7506158154.</li>
												<li>Entry applicable to 21 years of age and above (Photo Id with age proof compulsory).</li>
												<li>Internet handling fee per ticket may be levied. Please check your total amount before payment.</li>
												<li>Tickets once booked cannot be exchanged or refunded.</li>
												<li>We recommend that you arrive at least 20 minutes prior at the venue to pick up your physical tickets.</li>
											</ul>
										</div>
										<div class="modal-footer">
											<button type="button" class="btn btn-danger" data-target="#">Buy Ticket</button>
											<button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
										</div>
									</div>

								</div>
							</div>
						</div>
						<div class="col-md-4">
							<img src="http://in.bmscdn.com/events/eventlisting/ET00039492.jpg" style="height: 200px; width=100%;" alt="image">
							<div class="text-center">
								<a href="#myModal" data-toggle="modal">BlueFROG presents Zokhuma, Achint &amp; Boombay Djembe Folas</a>
							</div>
							<!-- Modal -->
							<div id="myModal" class="modal fade" role="dialog">
								<div class="modal-dialog">

									<!-- Modal content-->
									<div class="modal-content">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal">&times;</button>
											<h4 class="modal-title">Event Details</h4>
										</div>
										<div class="modal-body" style="overflow:auto;">
											<!--
											<img src="http://in.bmscdn.com/events/eventlisting/ET00039492.jpg" style="height: 200px; width=100%;" alt="image">
											-->
											<h2 style="color:#d9534f;">BlueFROG presents Zokhuma, Achint &amp; Boombay Djembe Folas</h2>
											<br>
											<h4><b>Venue: </b>Blue Frog, Mumbai,</h4>
											<p>Zeba Center, Mathuradas Mill Compound, Senapati Bapat Marg, Lower Parel, Mumbai, Maharashtra 400013, India</p>
											<h4><b>Time: </b></h4><p>Thu 31 Mar, 09:30 PM</p>
											<h4><b>Duration: </b></h4><p>3 hrs 30 mins</p>
											<h4><b>Price: </b></h4><p>Single Entry: &#8377;350</p>
											<h4><b>Artists: </b></h4><p>Achint, Zokhuma, Boombay Djembe Folas</p>
											<h4><b>Category: </b></h4><p>Alternative; International; Others</p>
											<br>
											<h5>Terms and Conditions:</h5>
											<ul>
												<li>For table reservations, please call 022-61586158/91-7506158154.</li>
												<li>Entry applicable to 21 years of age and above (Photo Id with age proof compulsory).</li>	
												<li>Internet handling fee per ticket may be levied. Please check your total amount before payment.</li>
												<li>Tickets once booked cannot be exchanged or refunded.</li>
												<li>We recommend that you arrive at least 20 minutes prior at the venue to pick up your physical tickets.</li>
											</ul>
										</div>
										<div class="modal-footer">
											<button type="button" class="btn btn-danger" data-target="#">Buy Ticket</button>
											<button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
										</div>
									</div>

								</div>
							</div>

						</div>
						<div class="col-md-4">
							<img src="http://in.bmscdn.com/events/eventlisting/ET00022711.jpg" style="height: 200px; width=100%;" alt="image">
							<div class="text-center">
								<a href="#myModal" data-toggle="modal">Roha Orion: Clue Hunt</a>
							</div>
							<!-- Modal -->
							<div id="myModal" class="modal fade" role="dialog">
								<div class="modal-dialog">

									<!-- Modal content-->
									<div class="modal-content">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal">&times;</button>
											<h4 class="modal-title">Event Details</h4>
										</div>
										<div class="modal-body" style="overflow:auto;">
											<!--
											<img src="http://in.bmscdn.com/events/eventlisting/ET00039492.jpg" style="height: 200px; width=100%;" alt="image">
											-->
											<h2 style="color:#d9534f;">BlueFROG presents Zokhuma, Achint &amp; Boombay Djembe Folas</h2>
											<br>
											<h4><b>Venue: </b>Blue Frog, Mumbai,</h4>
											<p>Zeba Center, Mathuradas Mill Compound, Senapati Bapat Marg, Lower Parel, Mumbai, Maharashtra 400013, India</p>
											<h4><b>Time: </b></h4><p>Thu 31 Mar, 09:30 PM</p>
											<h4><b>Duration: </b></h4><p>3 hrs 30 mins</p>
											<h4><b>Price: </b></h4><p>Single Entry: &#8377;350</p>
											<h4><b>Artists: </b></h4><p>Achint, Zokhuma, Boombay Djembe Folas</p>
											<h4><b>Category: </b></h4><p>Alternative; International; Others</p>
											<br>
											<h5>Terms and Conditions:</h5>
											<ul>
												<li>For table reservations, please call 022-61586158/91-7506158154.</li>
												<li>Entry applicable to 21 years of age and above (Photo Id with age proof compulsory).</li>
												<li>Internet handling fee per ticket may be levied. Please check your total amount before payment.</li>
												<li>Tickets once booked cannot be exchanged or refunded.</li>
												<li>We recommend that you arrive at least 20 minutes prior at the venue to pick up your physical tickets.</li>
											</ul>
										</div>
										<div class="modal-footer">
											<button type="button" class="btn btn-danger" data-target="#">Buy Ticket</button>
											<button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
										</div>
									</div>

								</div>
							</div>
						</div>
					</div>

				</div>
				<div id="sports" class="tab-pane fade">
					<h3>31<sup>st</sup> March 2016</h3>
					<div class="row">
						<div class="col-md-4">
							<img src="http://in.bmscdn.com/events/eventlisting/ET00039922.jpg" style="height: 200px; width=100%;" alt="image">
							<div class="text-center">
								<a href="#">ICC World T20 2016 Screening @ La Patio</a>
							</div>
						</div>
						<div class="col-md-4">
							<img src="http://in.bmscdn.com/events/eventlisting/ET00040003.jpg" style="height: 200px; width=100%;" alt="image">
							<div class="text-center">
								<a href="#">ICC World T20 2016 Screening @ The Little Door</a>
							</div>
						</div>
						<div class="col-md-4">
							<img src="http://in.bmscdn.com/events/eventlisting/ET00039816.jpg" style="height: 200px; width=100%;" alt="image">
							<div class="text-center">
								<a href="#">ICC World T20 2016 Screening @ ZooBar</a>
							</div>
						</div>
					</div>
				</div>
				<div id="plays" class="tab-pane fade">
					<h3>30<sup>th</sup> March 2016</h3>
					<div class="row">
						<div class="col-md-4">
							<img src="http://in.bmscdn.com/events/eventlisting/ET00004559.jpg" style="height: 200px; width=100%;" alt="image">
							<div class="text-center">
								<a href="#">Pratik Arts Theatres' MASSAGE</a>
							</div>
						</div>
						<div class="col-md-4"></div>
						<div class="col-md-4"></div>
					</div>
					<h3>31<sup>st</sup> March 2016</h3>
					<div class="row">
						<div class="col-md-4">
							<img src="http://in.bmscdn.com/events/eventlisting/ET00039911.jpg" style="height: 200px; width=100%;" alt="image">
							<div class="text-center">
								<a href="#">Writers' Bloc 4 Rage Productions - Naqqaash</a>
							</div>
						</div>
						<div class="col-md-4">
							<img src="http://in.bmscdn.com/events/eventlisting/ET00040140.jpg" style="height: 200px; width=100%;" alt="image">
							<div class="text-center">
								<a href="#">CodeName SRK</a>
							</div>
						</div>
						<div class="col-md-4"></div>
					</div>
				</div>
			</div>

		</div>
	</section>
	<!--/#portfolio-item-->



	<footer id="footer" class="midnight-blue">
		<div class="container">
			<div class="row">
				<div class="col-sm-6">
					&copy; 2013 <a target="_blank" href="http://shapebootstrap.net/" title="Free Twitter Bootstrap WordPress Themes and HTML templates">ShapeBootstrap</a>. All Rights Reserved.
				</div>
				<div class="col-sm-6">
					<ul class="pull-right">
						<li><a href="#">Home</a></li>
						<li><a href="#">About Us</a></li>
						<li><a href="#">Faq</a></li>
						<li><a href="#">Contact Us</a></li>
					</ul>
				</div>
			</div>
		</div>
	</footer>
	<!--/#footer-->

	<script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.prettyPhoto.js"></script>
	<script src="js/jquery.isotope.min.js"></script>
	<script src="js/main.js"></script>
	<script src="js/wow.min.js"></script>
</body>

</html>