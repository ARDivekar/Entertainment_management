package InterfaceClasses;
import ControllerClasses.C_Login;
import databaseHandler.SecurityHash;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;

public class IC_Login extends HttpServlet {

	
    
    public void displayUserLoginGUI(HttpServletRequest request, HttpServletResponse response) throws IOException{        displayUserLoginGUI(request, response, "");
    }
    

	public void displayUserLoginGUI(HttpServletRequest request, HttpServletResponse response, String loginStatus) throws IOException {
        HttpSession session = request.getSession();
        PrintWriter out=response.getWriter();
        
		out.print("<!DOCTYPE html>\n" +
"<html>\n" +
"<head>\n" +
"        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
"        <title>Login</title>\n" +
"        <link rel=\"stylesheet\" href=\"/CSS/css/signup_and_login.css\">\n" +
"        <script type=\"text/javascript\" src=\"/JS/js/register_verify.js\"></script>\n" +
"        <link href=\"/CSS/css/bootstrap.min.css\" rel=\"stylesheet\">\n" +
"    <link href=\"/CSS/css/font-awesome.min.css\" rel=\"stylesheet\">\n" +
"    <link href=\"/CSS/css/prettyPhoto.css\" rel=\"stylesheet\">\n" +
"    <link href=\"/CSS/css/animate.min.css\" rel=\"stylesheet\">\n" +
"	<link href=\"/CSS/css/main.css\" rel=\"stylesheet\">\n" +
"    <link href=\"/CSS/css/responsive.css\" rel=\"stylesheet\">\n" +
"	<style>\n" +
"		.img{\n" +
"\n" +
"			border: 1px solid #000 ;\n" +
"			-webkit-box-shadow: 5px 5px 5px #2c3e50;\n" +
"			box-shadow: 1px 1px 1px black;\n" +
"		}\n" +
"\n" +
"		/*MORPH*/\n" +
"		.morph {\n" +
"			-webkit-transition: all 0.5s ease;\n" +
"			-moz-transition: all 0.5s ease;\n" +
"			-o-transition: all 0.5s ease;\n" +
"			-ms-transition: all 0.5s ease;\n" +
"			transition: all 0.5s ease;\n" +
"		}\n" +
"\n" +
"		.morph:hover {\n" +
"			border-radius: 50%;\n" +
"			-webkit-transform: rotate(360deg);\n" +
"			-moz-transform: rotate(360deg);\n" +
"			-o-transform: rotate(360deg);\n" +
"			-ms-transform: rotate(360deg);\n" +
"			transform: rotate(360deg);\n" +
"		}\n" +
"	</style>\n" +
"    <!--[if lt IE 9]>\n" +
"    <script src=\"/JS/js/html5shiv.js\"></script>\n" +
"    <script src=\"/JS/js/respond.min.js\"></script>\n" +
"    <![endif]-->       \n" +
"    <link rel=\"shortcut icon\" href=\"images/ico/favicon.ico\">\n" +
"    <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"images/ico/apple-touch-icon-144-precomposed.png\">\n" +
"    <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"images/ico/apple-touch-icon-114-precomposed.png\">\n" +
"    <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"images/ico/apple-touch-icon-72-precomposed.png\">\n" +
"    <link rel=\"apple-touch-icon-precomposed\" href=\"images/ico/apple-touch-icon-57-precomposed.png\">\n" +
"  <meta charset=\"UTF-8\">\n" +
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
       

        String loginStatusHTML = "<div class=\"module form-module\">\n" +
"\n" +
"      <div class=\"form\" style=\"display: block;\">\n" +
"        <h2>"+loginStatus+"</h2>\n" +
"        \n" +
"      </div>\n" +
"    </div>";
        
        
        
        
        String loginForm=
"    <div class=\"login\" style=\"height:30rem; width:30rem;\">\n" +
"  <header class=\"header\" >\n" +
"    <span class=\"text\">Login</span>\n" +
"  </header>\n" +
"    <form class=\"form_login\" action=\"/loginHandler\" method=\"POST\">  \n" +
"    <input class=\"input\" type=\"text\" placeholder=\"Username\" id=\"loginUsername\" name=\"loginUsername\">\n" +
"    <input class=\"input\" type=\"password\" placeholder=\"Password\" id=\"loginPassword\" name=\"loginPassword\">\n" +
"\n" +
"    <button class=\"btn\" type=\"submit\" style=\"right:12.8rem;\"></button>\n" +
"  </form>\n" +
"</div>\n" +
"<button class =\"resetbtn\" type= \"reset\" onClick=\"loginReset()\">Reset it\n" +
"</button>\n" +
"    <script src='/JS/js2/jquery.min.js'></script>\n" +
"\n" ;

        
        
        
        
        if(loginStatus.equals("")){
            out.print(loginForm);
        }
        else{
            out.print(loginStatusHTML);
        }
        
        
        
        
        out.print(
"    </body>\n" +
"</html>");
	}
    
    
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
        System.out.println("login.jsp's form should pass as type POST, not GET.");
        doPost(request, response);
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        HttpSession session = request.getSession();
        session.removeAttribute("loggedInUsername");
        String username=null;
        String password=null;
        

        username=request.getParameter("loginUsername");
        password=request.getParameter("loginPassword");
        
        enterLoginDetails(username,password, request, response);
        
    }
        
	public void enterLoginDetails(String username, String password, HttpServletRequest request, HttpServletResponse response) throws IOException{
        String passwordHash=null;
        SecurityHash security = new SecurityHash();
        passwordHash = security.hashPassword(password, "MD5");
        C_Login C_LoginObj = new C_Login();
        
        String loginStatus = C_LoginObj.trySystemLogin(username, passwordHash);
        
        if(loginStatus.indexOf("Unfortunately")== -1){
            //we can log in now.
            HttpSession session = request.getSession();
            session.setAttribute("loggedInUsername", username);
        }

        displayUserLoginGUI(request, response, loginStatus);
        
	}

	

}