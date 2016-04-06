package InterfaceClasses;
import ControllerClasses.C_UserRegister;
import EntityClasses.Gender;
import databaseHandler.EntertainmentManagementDatabase;
import databaseHandler.SecurityHash;
import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class IC_UserRegister extends HttpServlet {
    
    
    public void displayUserRegisterGUI(HttpServletRequest request, HttpServletResponse response) throws IOException{
        displayUserRegisterGUI(request, response, "");
    }
    
    
    public void displayUserRegisterGUI(HttpServletRequest request, HttpServletResponse response, String registerStatus) throws IOException {
        HttpSession session = request.getSession();
        
        
       PrintWriter out=response.getWriter();
       out.print("<!DOCTYPE html>\n" +
"<html>\n" +
"    <head>\n" +
"        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
"        <title>Register</title>\n" +
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
"    </head>\n" +
"   \n" +
"    <body onLoad=\"showRegisterForm(); onLoadClearForm();\">\n" +
"\n" +
"      \n");
       
       out.print(new HeaderGenerator().getHeader(session, "register"));
       out.print(
"\n" +
"      <!-- Form Mixin-->\n" +
"      <!-- Input Mixin-->\n" +
"      <!-- Button Mixin-->\n" +
"      <!-- Pen Title-->\n" +
"      <div class=\"pen-title\">\n" +
"\n" +
"      </div>\n" +
"      <!-- Form Module-->\n" +
"      <div class=\"module form-module\">\n" +
"\n" +
"      <!-- <div class=\"toggle\">\n" +
"        <div id=\"clickme\" onClick=\"switchForm()\">Switch</div>\n" +
"      </div>\n" +
"      <div class=\"form\" id=\"loginForm\">\n" +
"        <h2>Login to your account</h2>\n" +
"        <form>\n" +
"          <input type=\"text\" placeholder=\"Username\">\n" +
"          <input type=\"password\" placeholder=\"Password\">\n" +
"          <button>Login</button>\n" +
"        </form>\n" +
"      </div> -->\n" +
"      <div class=\"form\" id=\"registerForm\">\n" +
"        <h2>Create an account</h2>\n" );
       
       String registerForm = 
"        <form  onSubmit=\"check_errors()\" action=\"/registerHandler\"  method=\"POST\">\n" +
"            <input type=\"text\" placeholder=\"Username\" name=\"uname_input\" id=\"uname_input\"> <p id=\"uname_output\"></p>\n" +
"            <input type=\"text\" placeholder=\"First Name\" name=\"fname_input\" id=\"fname_input\"> <p id=\"fname_output\"></p>\n" +
"            <input type=\"text\" placeholder=\"Last Name\" name=\"lname_input\" id=\"lname_input\"> <p id=\"lname_output\"></p>\n" +
"            <select name=\"gender_input\" id=\"gender_input\">\n" +
"              <option selected disabled>Choose gender</option>\n" +
"              <option value=\"male\">Male</option>\n" +
"              <option value=\"female\">Female</option>\n" +
"            </select>\n" +
"            <input type=\"text\" placeholder=\"Email Address\" name=\"email_input\" id=\"email_input\"  oninput=\"email_check()\"> <p id=\"email_output\"></p>\n" +
"            <input type=\"password\" placeholder=\"Password\" name=\"password_input1\" id=\"password_input1\" oninput=\"pass1_check()\" > <p id=\"pass1_output\"></p>\n" +
"            <input type=\"password\"  placeholder=\"Re-Type Password\" name=\"password_input2\" id=\"password_input2\" oninput=\"pass2_check()\"> <p id=\"pass2_output\"></p>\n" +
"            <input type=\"date\" placeholder=\"Date of Birth\" name=\"date_input\" id=\"date_input\" max=\""+
               new Object() {
        @Override public String toString() {
            java.sql.Date todayDateMinus13Years = new java.sql.Date(new java.util.Date().getTime());
            todayDateMinus13Years.setYear(todayDateMinus13Years.getYear()-13);
            return EntertainmentManagementDatabase.convertDateToString(todayDateMinus13Years);
        }
    } +
"\"> <p id=\"date_output\"></p>\n" +
"            \n" +
"            <button type=\"submit\">Register</button>\n" +
"          <!-- <input type=\"submit\" value=\"Register\"/> -->\n" +
"        </form>\n" ;
       
       if(registerStatus.equals("")){
           out.print(registerForm);
       }
       else{
           out.print("<h2>"+registerStatus+"</h2>");
       }
       
       
out.print(
"      </div>\n" +
"      <!-- <div class=\"cta\"><a href=\"#\">Forgot your password?</a></div> -->\n" +
"    </div>\n" +
"    <!--\n" +
"        <script src=\"http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js\"></script>\n" +
"      -->\n" +
"\n" +
"\n" +
"    </body>\n" +
"</html>");
	}
    
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
        System.out.println("register.jsp's form should pass as type POST, not GET.");
        doPost(request, response);
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        HttpSession session = request.getSession();
        session.setAttribute("loggedInUsername", "");
        
        String username=null;
        String emailID=null;
        String firstName=null;
        String lastName=null;
        java.sql.Date DOB=null;
        Gender gender=null;
        String password=null;

        username=request.getParameter("uname_input");
        emailID=request.getParameter("email_input");
        firstName=request.getParameter("fname_input");
        lastName=request.getParameter("lname_input");
        password=request.getParameter("password_input1");
        
        DOB=EntertainmentManagementDatabase.convertStringToDate(request.getParameter("date_input"));
        String genderString = request.getParameter("gender_input");
        System.out.println(genderString);
        if(genderString!=null && genderString.equalsIgnoreCase("male"))
            gender=Gender.M;
        else if(genderString!=null && genderString.equalsIgnoreCase("female"))
            gender=Gender.F;
        
        enterUserRegisterDetails(username, password, firstName, lastName, emailID, gender, DOB, request, response);
        
        
    }


	

	public void enterUserRegisterDetails(String username, String password, String firstName, String lastName, String emailID, Gender gender, Date DOB, HttpServletRequest request, HttpServletResponse response) throws IOException {
		String userDetailsValid = validateUserDetails(DOB, emailID, lastName, firstName,gender, password, username);    
        if(!userDetailsValid.equals("")){ //errors exist
            displayUserRegisterGUI(request, response, userDetailsValid);
        }
        else{
            SecurityHash security = new SecurityHash();
            String passwordHash = security.hashPassword(password, "MD5");
            
            C_UserRegister userRegisterController = new C_UserRegister();
            
            String registerStatus = userRegisterController.tryUserRegister(DOB, emailID, firstName, gender, lastName, passwordHash, username);
            
            if(registerStatus.indexOf("Unfortunately")== -1){
                //we can log in now.
                HttpSession session = request.getSession();
                session.setAttribute("loggedInUsername", username);
            }
            
            displayUserRegisterGUI(request, response, registerStatus);
        }
        
        
            
	}

    
	public String validateUserDetails(Date DOB, String emailID, String lastName, String firstName, Gender gender, String password, String username) {
		
		return "";
	}


}