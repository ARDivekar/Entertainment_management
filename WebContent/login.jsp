<%-- 
    Document   : login
    Created on : 5 Apr, 2016, 1:48:23 PM
    Author     : Abhishek Divekar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Login</title>
  <script src="${pageContext.request.contextPath}/JS/js/modernizr.js" type="text/javascript"></script>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/css1/normalize.css">    
  <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/css1/style.css">

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
        .header{
            height:30rem; 
            width:30rem;
        }
        
        .header > .text{
            line-height: 30rem;
        }
        .form_login{
            margin: 6rem 0rem 0rem 0rem;
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
    
    
    <script type="text/javascript">
        function loginReset(){
            var loginUsername = document.getElementById("loginUsername");
            var loginPassword = document.getElementById("loginPassword");
            loginUsername.value="";
            loginPassword.value="";
        }
    </script>

  <!-- <link rel="stylesheet" href="css/reset.css"> -->

   <link rel="stylesheet prefetch" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900|RobotoDraft:400,100,300,500,700,900"> 
  <!-- <link rel="stylesheet prefetch" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css"> -->

<!--  <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/css/signup_and_login.css">
  <script type="text/javascript" src="${pageContext.request.contextPath}/JS/js/login_validate.js"></script>-->
  
  
  
</head>

<body onLoad="showLoginForm(); onLoadClearForm();">

   
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
            </div><!--/.container-->
        </div><!--/.top-bar-->

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
                        <li><a href="about-us.jsp">Our Team</a></li>
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
                        <li class="active"><a href="login.jsp">Login</a></li>
                        <li><a href="contact-us.jsp">Contact</a></li>
                    </ul>
                </div>
            </div><!--/.container-->
        </nav><!--/nav-->
    </header><!--/header-->
 <!-- <div class="pen-title">

  </div>
   Form Module
  <div class="module form-module">
   <div class="toggle">
    <div id="clickme" onClick="switchForm()">Switch</div>
  </div> 
  <div class="form" id="loginForm">
    <h2>Login to your account</h2>
    <form onSubmit="check_errors()">
      <input type="text" placeholder="Email Address" id="email_input"  oninput="email_check()"> <p id="email_output"></p>
      <input type="password" placeholder="Password" id="password_input" oninput="pass_check()" > <p id="pass_output"></p>
      <button>Login</button>
    </form>
  </div>
   <div class="form" id="registerForm" onSubmit="check_empty()">
    <h2>Create an account</h2>
    <form >
      <input type="text" placeholder="Username" id="uname_input"> <p id="uname_output"></p>
      <input type="password" placeholder="Password" id="password_input1" oninput="pass1_check()" > <p id="pass1_output"></p>
      <input type="password" placeholder="Re-Type Password" id="password_input2" oninput="pass2_check()"> <p id="pass2_output"></p>
      <input type="email" placeholder="Email Address" id="email_input"  oninput="check()"> <p id="email_output"></p>
      <input type="tel" placeholder="Phone Number" id="phoneno_input"> <p id="phoneno_output"></p>
      <!-- <button type="submit" onClick="check_empty()">Register</button> --
      <!-- <input type="submit" value="Register"/> --
    </form>
  </div> 
  <div class="cta"><a href="#">Forgot your password?</a></div>
</div>

    <script src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
  

  

</body>-->
      

    <div class="login" style="height:30rem; width:30rem;">
  <header class="header" >
    <span class="text">Login</span>
    <span class="loader"></span>
  </header>
    <form class="form_login" action="loginHandler" method="POST">  
    <input class="input" type="text" placeholder="Username" id="loginUsername">
    <input class="input" type="password" placeholder="Password" id="loginPassword">

    <button class="btn" type="submit" style="right:12.8rem;"></button>
  </form>
</div>
<button class ="resetbtn" type= "reset" onClick="loginReset()">Reset it
</button>
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

        <script src="js1/index.js"></script>

    
    
    
  </body>

</html>