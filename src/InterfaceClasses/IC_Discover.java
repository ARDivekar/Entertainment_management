package InterfaceClasses;
import ControllerClasses.C_Discover;
import EntityClasses.ListingType;
import EntityClasses.Movie;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.http.*;
import javax.servlet.*;

public class IC_Discover extends HttpServlet {
    private int currentListingNum = -1;
    private int currentPageSize = -1; 
    private ListingType currentListingType = null;
    

	public void loadDiscoverPage(HttpServletRequest request, HttpServletResponse response, ListingType listingFilter, int startNum, int numListings) throws IOException {
        HttpSession session = request.getSession();
        PrintWriter out=response.getWriter();
        
        out.print("<!DOCTYPE html>\n" +
"<html lang=\"en\">\n" +
"<head>\n" +
"        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
"        <title>Discover Movies</title>\n" +
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
"    <meta charset=\"utf-8\">\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    <meta name=\"description\" content=\"\">\n" +
"    <meta name=\"author\" content=\"\">\n" +
"    <title>All Movies</title>\n" +
"      <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js\"></script>\n" +
"  <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\n" +
"    \n" +
"    <!-- core CSS -->\n" +
"    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n" +
"    <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n" +
"    <link href=\"css/prettyPhoto.css\" rel=\"stylesheet\">\n" +
"    <link href=\"css/animate.min.css\" rel=\"stylesheet\">\n" +
"    <link href=\"css/main1.css\" rel=\"stylesheet\">\n" +
"    <link href=\"css/responsive.css\" rel=\"stylesheet\">\n" +
"    <style>\n" +
"    .rating {\n" +
"        float:left;\n" +
"    }\n" +
"\n" +
"    .rating:not(:checked) > input {\n" +
"        position:absolute;\n" +
"        top:-9999px;\n" +
"        clip:rect(0,0,0,0);\n" +
"    }\n" +
"\n" +
"    .rating:not(:checked) > label {\n" +
"        float:right;\n" +
"        width:1em;\n" +
"        padding:0 .1em;\n" +
"        overflow:hidden;\n" +
"        white-space:nowrap;\n" +
"        cursor:pointer;\n" +
"        font-size:200%;\n" +
"        line-height:1.2;\n" +
"        color:#ddd;\n" +
"        text-shadow:1px 1px #bbb, 2px 2px #666, .1em .1em .2em rgba(0,0,0,.5);\n" +
"    }\n" +
"\n" +
"    .rating:not(:checked) > label:before {\n" +
"        content: '★ ';\n" +
"    }\n" +
"\n" +
"    .rating > input:checked ~ label {\n" +
"        color: #f70;\n" +
"        text-shadow:1px 1px #c60, 2px 2px #940, .1em .1em .2em rgba(0,0,0,.5);\n" +
"    }\n" +
"\n" +
"        .rating:not(:checked) > label:hover,\n" +
"    .rating:not(:checked) > label:hover ~ label {\n" +
"        color: gold;\n" +
"        text-shadow:1px 1px goldenrod, 2px 2px #c41f1f, .1em .1em .2em rgba(0,0,0,.5);\n" +
"    }  \n" +
"\n" +
"    .rating > input:checked + label:hover,\n" +
"    .rating > input:checked + label:hover ~ label,\n" +
"    .rating > input:checked ~ label:hover,\n" +
"    .rating > input:checked ~ label:hover ~ label,\n" +
"    .rating > label:hover ~ input:checked ~ label {\n" +
"        color: #ea0;\n" +
"        text-shadow:1px 1px goldenrod, 2px 2px #B57340, .1em .1em .2em rgba(0,0,0,.5);\n" +
"    }\n" +
"\n" +
"    .rating > label:active {\n" +
"        position:relative;\n" +
"        top:2px;\n" +
"        left:2px;\n" +
"    }\n" +
"    </style>\n" +
"    \n" +
"\n" +
"    <!--[if lt IE 9]>\n" +
"    <script src=\"js/html5shiv.js\"></script>\n" +
"    <script src=\"js/respond.min.js\"></script>\n" +
"    <![endif]-->       \n" +
"    <link rel=\"shortcut icon\" href=\"images/ico/favicon.ico\">\n" +
"    <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"images/ico/apple-touch-icon-144-precomposed.png\">\n" +
"    <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"images/ico/apple-touch-icon-114-precomposed.png\">\n" +
"    <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"images/ico/apple-touch-icon-72-precomposed.png\">\n" +
"    <link rel=\"apple-touch-icon-precomposed\" href=\"images/ico/apple-touch-icon-57-precomposed.png\">\n" +
"</head><!--/head-->");
        out.print("<body>");
        out.print(new HeaderGenerator().getHeader(session, "discover"));
        
        out.print("<section id=\"portfolio\">\n" +
"        <div class=\"container\">");
        
        out.print("<div class=\"center\">\n" +
"                <h2>Discover Movies</h2>\n" +
"                <p class=\"lead\">Welcome to the world of movies!! </p>\n" +
"                <ol class=\"breadcrumb\">\n" +
"                    <li><a href=\"/discover-movies\">Discover Movies</a></li>\n" +
"                    <li><a href=\"/discover-movies.jsp\"> Home All Movies</a></li>\n" +
"                </ol>\n" +
"            </div>");
        C_Discover C_DiscoverObj = new C_Discover();
        if(listingFilter==ListingType.MOVIE){
            String limits=" LIMIT "+String.valueOf(startNum)+", "+String.valueOf(numListings);
            System.out.println("Getting MOVIE lisings between "+limits);
            ArrayList<Movie> fetchedMovies = C_DiscoverObj.getDiscoverMovieListings(numListings, startNum);
            
            //Start printing rows
            int listingPrintedNumber=0;
            for(int rowNum=1; rowNum < Math.ceil(numListings/2); rowNum++){
                System.out.print(listingPrintedNumber+" ");
                out.print("<div class=\"row\">");

                if(listingPrintedNumber <= numListings ){
                   System.out.print(fetchedMovies.get(listingPrintedNumber));
                   out.print(makeMovieGUIItem(fetchedMovies.get(listingPrintedNumber), listingPrintedNumber));
                   listingPrintedNumber++; 
                }

                if(listingPrintedNumber <= numListings ){
                   System.out.print(fetchedMovies.get(listingPrintedNumber));
                   out.print(makeMovieGUIItem(fetchedMovies.get(listingPrintedNumber), listingPrintedNumber));
                   listingPrintedNumber++; 
                }
                out.print("</div>");
            }
        }
        
        //print page footer
        out.print("");
        
        
        out.print("</div>\n" +
"    </section>");
        out.print("<body></html>");
        
        currentListingNum=startNum;
        currentPageSize=numListings;
	}

    private String makeMovieGUIItem(Movie movie, int listingPrintedNumber){
        return "<div class=\"col-xs-6 col-sm-6\">\n" +
    "                    <div class=\"tab-wrap\">\n" +
    "                        <div class=\"tab-content\">\n" +
    "                            <div id=\"tab1\" class=\"tab-pane active\">\n" +
    "                                <div class=\"media\">\n" +
    "                                    <div class=\"pull-left\">\n" +
    "                                        <img class=\"img-responsive\" style=\"max-height:210px;\" src=\""+movie.getImagePath()+"\"></img>\n" +
    "                                    </div>\n" +
    "                                    <h4>\n" +
                                            movie.getName() +
    "                                    </h4>\n" +
    "                                    <p>\n" +
    "                                        "+movie.getRuntime()+" minutes-"+ 
    "                                        <b>"+movie.getGenreList()+"</b><br>\n" +
    "                                        <b>Production House:</b> "+movie.getProductionCompanyList()+"<br>\n" +
    "                                        <b>Stars:</b> "+movie.getCastList()+"<br>\n" +
    "                                        <b>Rating:</b> "+movie.getRating().getRatingOutOf10()+"/10<br>\n" +
    "                                        <b>Release Date:</b>"+movie.getReleaseDate().toString()+"\n" +
    "                                    </p>\n" +
                                        "<button type=\"button \" class=\"watchlist\" data-toggle=\"modal\" data-target=\"#myModal"+String.valueOf(2*listingPrintedNumber+1)+"\">Read More</button>\n" +
"                                </div>\n" +
"                                <div class=\"modal fade\" id=\"myModal"+String.valueOf(2*listingPrintedNumber+1)+"\" role=\"dialog\">\n" +
"                                    <div class=\"modal-dialog\">\n" +
"                                        <!-- Modal content-->\n" +
"                                        <div class=\"modal-content\">\n" +
"                                            <div class=\"modal-header\">\n" +
"                                                <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n" +
"                                                <!-- <button type=\"button \" class=\"watchlist\" >Add to Collection</button> -->\n" +
"                                                <h4 class=\"modal-title\">Batman VS Superman</h4>\n" +
"                                            </div>\n" +
"                                            <div class=\"modal-body\">\n" +
"                                                <p>"+movie.getStoryline()+"<br> \n" +
"                                                    <b>Release Date:</b>"+movie.getReleaseDate().toString()+"<br>\n" +
"                                                    <b>Content Rating:</b> "+movie.getContentRating()+" <br>\n"+
"                                                    <b>Languages:</b> "+movie.getLanguages()+"<br> \n"+
"                                                    <b>Runtime:</b> "+movie.getRuntime()+" minutes <br>\n"+
"                                                    <b>Cast:</b> "+movie.getCastList()+" <br>\n"+
"                                                    <b>Production House:</b> "+movie.getProductionCompanyList()+"<br>\n" +
"                                                    <b>Budget:</b> "+movie.getBudget()+" million USD<br>\n" +
"                                                    <b>Trivia:</b> "+movie.getTrivia()+" \n"+
"                                                </p>\n" +
"                                            </div>\n" +
"                                            <div class=\"modal-footer\">\n" +
"                                                <a data-toggle=\"modal\" href=\"#"+String.valueOf(2*listingPrintedNumber +2)+"\" class=\"btn btn-primary\">Add To Collection</a>  \n" +
"                                                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n" +
"                                            </div>\n" +
"                                        </div>\n" +
"                                    </div>\n" +
"                                </div>\n" +
"                                <div class=\"modal fade\" id=\""+String.valueOf(2*listingPrintedNumber +2)+"\" role=\"dialog\">\n" +
"                                    <div class=\"modal-dialog\">\n" +
"                                        <!-- Modal content-->\n" +
"                                        <div class=\"modal-content\">\n" +
"                                            <div class=\"modal-header\">\n" +
"                                                <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n" +
"                                                <h4 class=\"modal-title\">Add To Collection</h4>\n" +
"                                            </div>\n" +
"                                            <div class=\"modal-body\"  style=\"font-size:1.25em;\">\n" +
"                                                <form action=\"demo_form.jsp\">\n" +
"                                                    <script type=\"text/javascript\">\n" +
"                                                        function onClickWishlistedRadioButton(){\n" +
"                                                            var ratingButton = document.getElementById(\"listing"+movie.getListingID()+"starrating\");\n" +
"                                                            ratingButton.disabled=true;\n" +
"                                                            var reviewTextArea = document.getElementById(\"listing"+movie.getListingID()+"reviewText\");\n" +
"                                                            reviewTextArea.disabled=true;\n" +
"                                                        }\n" +
"                                                        function onClickOwnedRadioButton(){\n" +
"                                                            var ratingButton = document.getElementById(\"listing123starrating\");\n" +
"                                                            ratingButton.disabled=false;\n" +
"                                                            var reviewTextArea = document.getElementById(\"listing123reviewText\");\n" +
"                                                            reviewTextArea.disabled=false;\n" +
"                                                            \n" +
"                                                        }\n" +
"                                                    </script>\n" +
"                                                    <label><input type=\"radio\" name=\"group1\" value=\"Wishlisted\" style=\"font-size:1.3em\" onClick=\"onClickWishlistedRadioButton()\">         Wishlisted</label>\n" +
"                                                    <label style=\"margin-left:2em;\"><input type=\"radio\" name=\"group1\" value=\"Owned\" style=\"font-size:1.3em\" onCLick=\"onClickOwnedRadioButton()\">         Owned</label>\n" +
"                                                    <p>    \n" +
"                                                        <br/>\n" +
"                                                        <br>\n" +
"                                                    <fieldset class=\"rating\" id=\"listing"+movie.getListingID()+"starrating\">\n" +
"                                                        <legend>Rate this Movie:</legend>\n" +
"                                                        <input type=\"radio\" id=\"star10\" name=\"rating\" value=\"10\" /><label for=\"star10\" title=\"Out of The World\">10 stars</label>\n" +
"                                                        <input type=\"radio\" id=\"star9\" name=\"rating\" value=\"9\" /><label for=\"star9\" title=\"Great\">9 stars</label>\n" +
"                                                        <input type=\"radio\" id=\"star8\" name=\"rating\" value=\"8\" /><label for=\"star8\" title=\"Very Good\">8 stars</label>\n" +
"                                                        <input type=\"radio\" id=\"star7\" name=\"rating\" value=\"7\" /><label for=\"star7\" title=\"Good\">7 stars</label>\n" +
"                                                        <input type=\"radio\" id=\"star6\" name=\"rating\" value=\"6\" /><label for=\"star6\" title=\"Kinda Nice\">6 stars</label>\n" +
"                                                        <input type=\"radio\" id=\"star5\" name=\"rating\" value=\"5\" /><label for=\"star5\" title=\"Average\">5 stars</label>\n" +
"                                                        <input type=\"radio\" id=\"star4\" name=\"rating\" value=\"4\" /><label for=\"star4\" title=\"Okayish\">4 stars</label>\n" +
"                                                        <input type=\"radio\" id=\"star3\" name=\"rating\" value=\"3\" /><label for=\"star3\" title=\"Kinda Bad\">3 stars</label>\n" +
"                                                        <input type=\"radio\" id=\"star2\" name=\"rating\" value=\"2\" /><label for=\"star2\" title=\"Bad\">2 stars</label>\n" +
"                                                        <input type=\"radio\" id=\"star1\" name=\"rating\" value=\"1\" /><label for=\"star1\" title=\"Pathetic\">1 star</label>\n" +
"                                                    </fieldset>\n" +
"                                                    <br><br><br><br><br>\n" +
"                                                    <h2>Comments</h2>\n" +
"                                                    <textarea rows=\"4\" cols=\"50\" name=\"comment\" form=\"usrform\" placeholder=\"Enter review here...\" id=\"listing"+movie.getListingID()+"reviewText\"></textarea>\n" +
"                                                    <br><br>\n" +
"                                                    </p> \n" +
"                                            </div>\n" +
"                                            <div class=\"modal-footer\">\n" +
"                                            <button type=\"button\" class=\"btn btn-primary\">Add To Collection</a>\n" +
"                                            <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n" +
"                                            </div>\n" +
"                                            </form>\n" +
"                                        </div>\n" +
"                                    </div>\n" +
"                                </div>\n" +
"                            </div>\n" +
"                        </div>\n" +
"                    </div>\n" +
"                </div>";
    }
    
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        doGet(request, response);
    }
    
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
        //essentially get the next page.
        if(request.getParameter("forwardButtonPressed").equalsIgnoreCase("true"))
            loadDiscoverPage(request, response, currentListingType, currentListingNum+currentPageSize, currentPageSize);
        else if(request.getParameter("backButtonPressed").equalsIgnoreCase("true"))
            loadDiscoverPage(request, response, currentListingType, currentListingNum-currentPageSize, currentPageSize);
    }
    
    

}