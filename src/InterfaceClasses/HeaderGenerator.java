/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceClasses;

import javax.servlet.http.*;

/**
 *
 * @author Abhishek Divekar
 */
public class HeaderGenerator {
    public String getHeader(HttpSession session, String activeTab){
        System.out.println("Active tab is: "+activeTab);
        String headerString =
"    <header id=\"header\">\n" +
"        <div class=\"top-bar\">\n" +
"            <div class=\"container\">\n" +
"                <div class=\"row\">\n" +
"                    <div class=\"col-sm-6 col-xs-4\">\n" +
"                        <div class=\"top-number\"><p><i class=\"fa fa-phone-square\"></i>  022 24198101</p></div>\n" +
"                    </div>\n" +
"                    <div class=\"col-sm-6 col-xs-8\">\n" +
"                       <div class=\"social\">\n" +
"                            <ul class=\"social-share\">\n" +
"                                <li><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\n" +
"                                <li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\n" +
"                                <li><a href=\"#\"><i class=\"fa fa-linkedin\"></i></a></li> \n" +
"                                <li><a href=\"#\"><i class=\"fa fa-dribbble\"></i></a></li>\n" +
"                                <li><a href=\"#\"><i class=\"fa fa-skype\"></i></a></li>\n" +
"                            </ul>\n" +
"                            <div class=\"search\">\n" +
"                                <form role=\"form\">\n" +
"                                    <input type=\"text\" class=\"search-form\" autocomplete=\"off\" placeholder=\"Search\">\n" +
"                                    <i class=\"fa fa-search\"></i>\n" +
"                                </form>\n" +
"                           </div>\n" +
"                       </div>\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div><!--/.container-->\n" +
"        </div><!--/.top-bar-->\n" +
"\n" +
"        <nav class=\"navbar navbar-inverse\" role=\"banner\">\n" +
"            <div class=\"container\">\n" +
"                <div class=\"navbar-header\">\n" +
"                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n" +
"                        <span class=\"sr-only\">Toggle navigation</span>\n" +
"                        <span class=\"icon-bar\"></span>\n" +
"                        <span class=\"icon-bar\"></span>\n" +
"                        <span class=\"icon-bar\"></span>\n" +
"                    </button>\n" +
"                    <a class=\"navbar-brand\" href=\"index.jsp\"><img src=\"images/ems_logo.png\" height=\"75\" width=\"160\" alt=\"logo\"></a>\n" +
"                </div>\n" +
"\n" +
"				<div class=\"collapse navbar-collapse navbar-right\">\n" +
"					<ul class=\"nav navbar-nav\">\n" +
                
                
"						<li "+new Object(){
    public String toString(){
        if(activeTab.equalsIgnoreCase("home"))
            return "class=\"active\"";
        return "";
    }
}+"><a href=\"index.jsp\">Home</a></li>\n" +
                
                
                
                
"						<li "+new Object(){
    public String toString(){
        if(activeTab.equalsIgnoreCase("about-us"))
            return "class=\"active\"";
        return "";
    }
}+"><a href=\"about-us.jsp\">Our Team</a></li>\n" +
                
                
                
"						<li class=\"dropdown\">\n" +
"							<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Discover<i class=\"fa fa-angle-down\"></i></a>\n" +
"							<ul class=\"dropdown-menu\">\n" +
"								<li ><a href=\"discovermovies.html\">Movies</a></li>\n" +
"								<li><a href=\"discoverbooks.html\">Books</a></li>\n" +
"								<li><a href=\"discovertvshows\">TVShows</a></li>\n" +
"								<li><a href=\"discovermusic.html\">Music</a></li>\n" +
"							</ul>\n" +
"						</li>\n" +
               new Object() {
        @Override public String toString() {
            if(session.getAttribute("loggedInUsername")!=null){
                return "<li><a href=\"#\">Collection</a></li>";
            }
            return "";
        }
    } +
                
                
                
                
                
"						<li "+new Object(){
    public String toString(){
        if(activeTab.equalsIgnoreCase("events"))
            return "class=\"active\"";
        return "";
    }
}+"><a href=\"calendar.html\">Events</a></li>\n" +
                
                
                
                
"						<li "+new Object(){
    public String toString(){
        if(activeTab.equalsIgnoreCase("register"))
            return "class=\"active\"";
        return "";
    }
}+"><a href=\"register.jsp\">Register</a></li>\n" +
                
                
                
                
"						<li "+new Object(){
    public String toString(){
        if(activeTab.equalsIgnoreCase("login"))
            return "class=\"active\"";
        return "";
    }
}+"><a href=\"login.jsp\">"+new Object(){
    public String toString(){
        if(session.getAttribute("loggedInUsername")==null)
            return "Login";
        return "Logout";
    }
}+"</a></li>\n" +
                
                
                
                
                
"						<li "+new Object(){
    public String toString(){
        if(activeTab.equalsIgnoreCase("contact-us"))
            return "class=\"active\"";
        return "";
    }
}+"><a href=\"contact-us.jsp\">Contact</a></li>" +new Object(){
    public String toString(){
        if(session.getAttribute("loggedInUsername")!=null)
//            return "<li><a href=\"#\">"+session.getAttribute("loggedInUsername").toString()+"</a></li>";
            return "<li><a href=\"#\">Account</a></li>";
        return "";
    }
}+
"					</ul>\n" +
"				</div>\n" +
"            </div><!--/.container-->\n" +
"        </nav><!--/nav-->\n" +
"	</header><!--/header-->\n";
        
        return headerString;
    }
}
