<%-- 
    Document   : register
    Created on : 5 Apr, 2016, 6:59:40 PM
    Author     : Abhishek Divekar
--%>

<%@page import="InterfaceClasses.IC_UserRegister"%>
<%@page import="databaseHandler.EntertainmentManagementDatabase"%>
<%@page import="databaseHandler.DatabaseHandler"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
IC_UserRegister userReg = new IC_UserRegister();
userReg.displayUserRegisterGUI(response);
%>
<!----------
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/css/signup_and_login.css">
        <script type="text/javascript" src="${pageContext.request.contextPath}/JS/js/register_verify.js"></script>
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
    <![endif]--><!----------       
    <link rel="shortcut icon" href="images/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
    </head>
   
    <body onLoad="showRegisterForm(); onLoadClearForm();">

      
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
						<li ><a href="about-us.html">Our Team</a></li>
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
						<li class="active"><a href="register.jsp">Register</a></li>
						<li><a href="login.jsp">Login</a></li>
						<li><a href="contact-us.jsp">Contact</a></li>
					</ul>
				</div>
            </div><!--/.container--><!----------
        </nav><!--/nav--><!----------
	</header><!--/header-->

      <!-- Form Mixin-->
      <!-- Input Mixin-->
      <!-- Button Mixin-->
      <!-- Pen Title--><!----------
      <div class="pen-title">

      </div>
      <!-- Form Module--><!----------
      <div class="module form-module">

      <!-- <div class="toggle">
        <div id="clickme" onClick="switchForm()">Switch</div>
      </div>
      <div class="form" id="loginForm">
        <h2>Login to your account</h2>
        <form>
          <input type="text" placeholder="Username">
          <input type="password" placeholder="Password">
          <button>Login</button>
        </form>
      </div> --><!----------
      <div class="form" id="registerForm">
        <h2>Create an account</h2>
        <form  onSubmit="check_errors()" action="/registerHandler"  method="POST">
            <input type="text" placeholder="Username" name="uname_input" id="uname_input"> <p id="uname_output"></p>
            <input type="text" placeholder="First Name" name="fname_input" id="fname_input"> <p id="fname_output"></p>
            <input type="text" placeholder="Last Name" name="lname_input" id="lname_input"> <p id="lname_output"></p>
            <select name="gender_input" id="gender_input">
              <option selected disabled>Choose gender</option>
              <option value="male">Male</option>
              <option value="female">Female</option>
            </select>
            <input type="text" placeholder="Email Address" name="email_input" id="email_input"  oninput="email_check()"> <p id="email_output"></p>
            <input type="password" placeholder="Password" name="password_input1" id="password_input1" oninput="pass1_check()" > <p id="pass1_output"></p>
            <input type="password"  placeholder="Re-Type Password" name="password_input2" id="password_input2" oninput="pass2_check()"> <p id="pass2_output"></p>
            <input type="date" placeholder="Date of Birth" name="date_input" id="date_input" max="<% 
              //java.sql.Date todayDateMinus13Years = new java.sql.Date(new java.util.Date().getTime());
              //todayDateMinus13Years.setYear(todayDateMinus13Years.getYear()-13);
              //out.print(EntertainmentManagementDatabase.convertDateToString(todayDateMinus13Years));
               %>"> <p id="date_output"></p>
            
            <button type="submit">Register</button>
          <!-- <input type="submit" value="Register"/> --><!----------
        </form>
      </div>
      <!-- <div class="cta"><a href="#">Forgot your password?</a></div> --><!----------
    </div>
    <!--
        <script src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
      -->

<!----------
    </body>
</html>
---------->