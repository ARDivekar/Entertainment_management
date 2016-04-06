package InterfaceClasses;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class IC_Login {

	public IC_Login() {
	}
    
    public void displayUserLoginGUI(HttpServletRequest request, HttpServletResponse response) throws IOException{        displayUserLoginGUI(request, response, "");
    }
    

	public void displayUserLoginGUI(HttpServletRequest request, HttpServletResponse response, String loginStatus) throws IOException {
        HttpSession session = request.getSession();
        
       PrintWriter out=response.getWriter();
		out.print("<!DOCTYPE html>\n" +
"<html>\n" +
"<head>\n" +
"  <meta charset=\"UTF-8\">\n" +
"  <title>Login</title>\n" +
"  <script src=\"/JS/js/modernizr.js\" type=\"text/javascript\"></script>\n" +
"  <link rel=\"stylesheet\" href=\"/CSS/css1/normalize.css\">    \n" +
"  <link rel=\"stylesheet\" href=\"/CSS/css1/style.css\">\n" +
"\n" +
"  <link href=\"/CSS/css/bootstrap.min.css\" rel=\"stylesheet\">\n" +
"    <link href=\"/CSS/css/font-awesome.min.css\" rel=\"stylesheet\">\n" +
"    <link href=\"/CSS/css/animate.min.css\" rel=\"stylesheet\">\n" +
"    <link href=\"/CSS/css/prettyPhoto.css\" rel=\"stylesheet\">\n" +
"    <link href=\"/CSS/css/main.css\" rel=\"stylesheet\">\n" +
"    <link href=\"/CSS/css/responsive.css\" rel=\"stylesheet\">\n" +
"    <!--[if lt IE 9]>\n" +
"    <script src=\"/JS/js/html5shiv.js\"></script>\n" +
"    <script src=\"/JS/js/respond.min.js\"></script>\n" +
"    <script type=\"text/javascript\" src=\"/JS/js/move-top.js\"></script>\n" +
"    <script type=\"text/javascript\" src=\"/JS/js/easing.js\"></script>\n" +
"    <![endif]-->       \n" +
"    <link rel=\"shortcut icon\" href=\"images/ico/favicon.ico\">\n" +
"    <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"images/ico/apple-touch-icon-144-precomposed.png\">\n" +
"    <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"images/ico/apple-touch-icon-114-precomposed.png\">\n" +
"    <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"images/ico/apple-touch-icon-72-precomposed.png\">\n" +
"    <link rel=\"apple-touch-icon-precomposed\" href=\"images/ico/apple-touch-icon-57-precomposed.png\">\n" +
"    <style>\n" +
"        .btn1 {\n" +
"            background: #e03d31;\n" +
"            background-image: -webkit-linear-gradient(top, #e03d31, #ff4a4a);\n" +
"            background-image: -moz-linear-gradient(top, #e03d31, #ff4a4a);\n" +
"            background-image: -ms-linear-gradient(top, #e03d31, #ff4a4a);\n" +
"            background-image: -o-linear-gradient(top, #e03d31, #ff4a4a);\n" +
"            background-image: linear-gradient(to bottom, #e03d31, #ff4a4a);\n" +
"            -webkit-border-radius: 10;\n" +
"            -moz-border-radius: 10;\n" +
"            border-radius: 10px;\n" +
"            text-shadow: 1px 1px 5px #2b2a2b;\n" +
"            font-family: Georgia;\n" +
"            color: #ffffff;\n" +
"            font-size: 15px;\n" +
"            padding: 5px 10px 5px 10px;\n" +
"            text-decoration: none;\n" +
"        }\n" +
"\n" +
"        .btn1:hover {\n" +
"            background: #f53942;\n" +
"            background-image: -webkit-linear-gradient(top, #f53942, #990202);\n" +
"            background-image: -moz-linear-gradient(top, #f53942, #990202);\n" +
"            background-image: -ms-linear-gradient(top, #f53942, #990202);\n" +
"            background-image: -o-linear-gradient(top, #f53942, #990202);\n" +
"            background-image: linear-gradient(to bottom, #f53942, #990202);\n" +
"            text-decoration: none;\n" +
"        }\n" +
"        .shadow{\n" +
"            text-shadow:\n" +
"                    -1px -1px 0 #000,\n" +
"                    1px -1px 0 #000,\n" +
"                    -1px 1px 0 #000,\n" +
"                    1px 1px 0 #000;\n" +
"        }\n" +
"        #toTop {\n" +
"            display: none;\n" +
"            text-decoration: none;\n" +
"            position: fixed;\n" +
"            bottom: 14px;\n" +
"            right: 3%;\n" +
"            overflow: hidden;\n" +
"            width: 40px;\n" +
"            height: 40px;\n" +
"            border: none;\n" +
"            text-indent: 100%;\n" +
"            background: url(\"images/to-top1.png\") no-repeat 0px 0px;\n" +
"            scrollSpeed: 20;\n" +
"            transition-duration: 1s;\n" +
"\n" +
"        }\n" +
"        #toTopHover {\n" +
"            width: 40px;\n" +
"            height: 40px;\n" +
"            display: block;\n" +
"            overflow: hidden;\n" +
"            float: right;\n" +
"            opacity: 0;\n" +
"            -moz-opacity: 0;\n" +
"            filter: alpha(opacity=0);\n" +
"        }\n" +
"        .header{\n" +
"            height:30rem; \n" +
"            width:30rem;\n" +
"        }\n" +
"        \n" +
"        .header > .text{\n" +
"            line-height: 30rem;\n" +
"        }\n" +
"        .form_login{\n" +
"            margin: 6rem 0rem 0rem 0rem;\n" +
"        }\n" +
"    </style>\n" +
"    <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js\"></script>\n" +
"    <script type=\"text/javascript\">\n" +
"        $(window).load(function() {\n" +
"            $(\".loader\").fadeOut(\"slow\");\n" +
"        })\n" +
"\n" +
"        $(document).ready(function() {\n" +
"            $().UItoTop({ easingType: 'easeOutQuart' });\n" +
"\n" +
"        });\n" +
"\n" +
"    </script>\n" +
"    \n" +
"    \n" +
"    <script type=\"text/javascript\">\n" +
"        function loginReset(){\n" +
"            var loginUsername = document.getElementById(\"loginUsername\");\n" +
"            var loginPassword = document.getElementById(\"loginPassword\");\n" +
"            loginUsername.value=\"\";\n" +
"            loginPassword.value=\"\";\n" +
"        }\n" +
"    </script>\n" +
"\n" +
"  <!-- <link rel=\"stylesheet\" href=\"css/reset.css\"> -->\n" +
"\n" +
"   <link rel=\"stylesheet prefetch\" href=\"http://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900|RobotoDraft:400,100,300,500,700,900\"> \n" +
"  <!-- <link rel=\"stylesheet prefetch\" href=\"http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css\"> -->\n" +
"\n" +
"<!--  <link rel=\"stylesheet\" href=\"/CSS/css/signup_and_login.css\">\n" +
"  <script type=\"text/javascript\" src=\"/JS/js/login_validate.js\"></script>-->\n" +
"  \n" +
"  \n" +
"  \n" +
"</head>\n" +
"\n" +
"<body onLoad=\"showLoginForm(); onLoadClearForm();\">\n" +
"\n" +
"   \n" );
        
       out.print(new HeaderGenerator().getHeader(session, "login"));
       
        out.print(
" <!-- <div class=\"pen-title\">\n" +
"\n" +
"  </div>\n" +
"   Form Module\n" +
"  <div class=\"module form-module\">\n" +
"   <div class=\"toggle\">\n" +
"    <div id=\"clickme\" onClick=\"switchForm()\">Switch</div>\n" +
"  </div> \n" +
"  <div class=\"form\" id=\"loginForm\">\n" +
"    <h2>Login to your account</h2>\n" +
"    <form onSubmit=\"check_errors()\">\n" +
"      <input type=\"text\" placeholder=\"Email Address\" id=\"email_input\"  oninput=\"email_check()\"> <p id=\"email_output\"></p>\n" +
"      <input type=\"password\" placeholder=\"Password\" id=\"password_input\" oninput=\"pass_check()\" > <p id=\"pass_output\"></p>\n" +
"      <button>Login</button>\n" +
"    </form>\n" +
"  </div>\n" +
"   <div class=\"form\" id=\"registerForm\" onSubmit=\"check_empty()\">\n" +
"    <h2>Create an account</h2>\n" +
"    <form >\n" +
"      <input type=\"text\" placeholder=\"Username\" id=\"uname_input\"> <p id=\"uname_output\"></p>\n" +
"      <input type=\"password\" placeholder=\"Password\" id=\"password_input1\" oninput=\"pass1_check()\" > <p id=\"pass1_output\"></p>\n" +
"      <input type=\"password\" placeholder=\"Re-Type Password\" id=\"password_input2\" oninput=\"pass2_check()\"> <p id=\"pass2_output\"></p>\n" +
"      <input type=\"email\" placeholder=\"Email Address\" id=\"email_input\"  oninput=\"check()\"> <p id=\"email_output\"></p>\n" +
"      <input type=\"tel\" placeholder=\"Phone Number\" id=\"phoneno_input\"> <p id=\"phoneno_output\"></p>\n" +
"      <!-- <button type=\"submit\" onClick=\"check_empty()\">Register</button> --\n" +
"      <!-- <input type=\"submit\" value=\"Register\"/> --\n" +
"    </form>\n" +
"  </div> \n" +
"  <div class=\"cta\"><a href=\"#\">Forgot your password?</a></div>\n" +
"</div>\n" +
"\n" +
"    <script src=\"http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js\"></script>\n" +
"  \n" +
"\n" +
"  \n" +
"\n" +
"</body>-->\n" +
"      \n" +
"\n" +
"    <div class=\"login\" style=\"height:30rem; width:30rem;\">\n" +
"  <header class=\"header\" >\n" +
"    <span class=\"text\">Login</span>\n" +
"    <span class=\"loader\"></span>\n" +
"  </header>\n" +
"    <form class=\"form_login\" action=\"loginHandler\" method=\"POST\">  \n" +
"    <input class=\"input\" type=\"text\" placeholder=\"Username\" id=\"loginUsername\">\n" +
"    <input class=\"input\" type=\"password\" placeholder=\"Password\" id=\"loginPassword\">\n" +
"\n" +
"    <button class=\"btn\" type=\"submit\" style=\"right:12.8rem;\"></button>\n" +
"  </form>\n" +
"</div>\n" +
"<button class =\"resetbtn\" type= \"reset\" onClick=\"loginReset()\">Reset it\n" +
"</button>\n" +
"    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>\n" +
"\n" +
"        <script src=\"js1/index.js\"></script>\n" +
"\n" +
"    \n" +
"    \n" +
"    \n" +
"  </body>\n" +
"\n" +
"</html>");
	}

	public void enterLoginDetails(String username, String password) {
		// TODO implement here
	}

	public void loadLoginGUI() {
		// TODO implement here
	}

}