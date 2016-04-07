package EntityClasses;

import databaseHandler.EntertainmentManagementDatabase;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Set;

public class Movie extends Listing {
	
	//e.g. http://www.imdb.com/title/tt0111161/?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=2398042102&pf_rd_r=0KNPDE5EECDTXH1CFFEZ&pf_rd_s=center-1&pf_rd_t=15506&pf_rd_i=top&ref_=chttp_tt_1
	
/*    public Movie() {
//abcdef
	}*/

	private String name;
	private Date releaseDate;
	private int budget;
	private String contentRating;
	private String castList;
	private String productionCompanyList;
	private boolean inColor;
	private int runtime;
	private String languages;
	private String storyline;
	private String genreList;
	private String trivia;
	private String goofs;

        public Movie(int listingID, String name, Date releaseDate, int budget, String contentRating, String castList, String productionCompanyList, boolean inColor, int runtime, String languages, String storyline, String genreList, String trivia, String goofs, AggregatedRating rating, String imagePath) {
            this.imagePath=imagePath;
            this.listingID=listingID;
            this.name = name;
            this.releaseDate = releaseDate;
            this.budget = budget;
            this.contentRating = contentRating;
            this.productionCompanyList = productionCompanyList;
            this.inColor = inColor;
            this.runtime = runtime;
            this.languages = languages;
            this.storyline = storyline;
            this.genreList = genreList;
            this.trivia = trivia;
            this.goofs = goofs;
            this.rating=rating;
            this.imagePath=imagePath;
	}

    public Movie() {
        name=null;
        releaseDate=null;
        budget=-1;
        contentRating=null;
        castList=null;
        productionCompanyList=null;
        inColor=false;
        runtime=-1;
        languages=null;
        storyline=null;
        genreList=null;
        trivia=null;
        goofs=null;
    }

    public String getName() {
        return name;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public int getBudget() {
        return budget;
    }

    public String getContentRating() {
        return contentRating;
    }

    public String getCastList() {
        return castList;
    }

    public String getProductionCompanyList() {
        return productionCompanyList;
    }

    public boolean isInColor() {
        return inColor;
    }

    public int getRuntime() {
        return runtime;
    }

    public String getLanguages() {
        return languages;
    }

    public String getStoryline() {
        return storyline;
    }

    public String getGenreList() {
        return genreList;
    }

    public String getTrivia() {
        return trivia;
    }

    public String getGoofs() {
        return goofs;
    }

    public int getListingID() {
        return listingID;
    }

    public AggregatedRating getRating() {
        return rating;
    }
    
    public String getImagePath(){
        return imagePath;
    }
    
    
    
    
    
    
    
        
	public ArrayList<Movie> fetchDiscoverMovieListingsDB(int numListings, int startNum) {
		EntertainmentManagementDatabase db = EntertainmentManagementDatabase.getInstance();
        String limits=" LIMIT "+String.valueOf(startNum)+", "+String.valueOf(numListings);
        String query = "SELECT Movie.listingID as 'listingID', name, date(releaseDate, 'unixepoch') as 'releaseDate', budget, contentRating, castList, productionCompanyList, inColor, runtime, languages, storyline, genreList, trivia, goofs, ratingOutOf10, numberOfRatings \n"+
"FROM Movie inner join Listing on Movie.listingID = Listing.listingID ORDER BY ratingOutOf10 DESC "+limits+";";
        System.out.println(query);
        ResultSet movieResultSet = db.tryArbitrarySelect(query);
        
		return convertFromResultSet(movieResultSet);
	}

	public int extractMovieListingsFromWeb(int numberOfListings) {
		// TODO implement here
		return 0;
	}
    
    
    public static boolean writeToDatabase(Movie objToWrite){
        EntertainmentManagementDatabase db = EntertainmentManagementDatabase.getInstance();
        
        String[] userTablefieldsList = {"name", "releaseDate", "budget", "contentRating", "castList", "productionCompanyList", "inColor", "runtime", "languages", "storyline", "genreList", "trivia", "goofs"};
        String [][]userTableDataList = new String[1][13];
        
        userTableDataList[0][0]=objToWrite.name; 
        userTableDataList[0][1]=EntertainmentManagementDatabase.convertDateToSQLiteDBUNIXEpochString(objToWrite.releaseDate);  
        userTableDataList[0][2]=String.valueOf(objToWrite.budget);
        userTableDataList[0][3]=objToWrite.contentRating;
        userTableDataList[0][4]=objToWrite.castList;
        userTableDataList[0][5]=objToWrite.productionCompanyList;
        userTableDataList[0][6]=Boolean.toString(objToWrite.inColor);
        userTableDataList[0][7]=String.valueOf(objToWrite.runtime);
        userTableDataList[0][8]=objToWrite.languages;
        userTableDataList[0][9]=objToWrite.storyline;
        userTableDataList[0][10]=objToWrite.genreList;
        userTableDataList[0][11]=objToWrite.trivia;
        userTableDataList[0][12]=objToWrite.goofs;
        
        boolean insertStatus = db.tryInsert("Movie", userTablefieldsList, userTableDataList);
        System.out.println("\nMOVIE INSERTION STATUS: "+ insertStatus);

        return false;
    }
        
    
    
    
    public ArrayList<Movie> convertFromResultSet(ResultSet inputResultSet){
        ArrayList<Movie> moviesArrayList = new ArrayList<Movie>();
        
        try {
            while(inputResultSet.next()){
                int listingID = Integer.valueOf(inputResultSet.getString("listingID"));
                System.out.println("Movie listing ID: "+listingID);
                String name = inputResultSet.getString("name"); 
                Date releaseDate = EntertainmentManagementDatabase.convertStringToDate(inputResultSet.getString("releaseDate"));
                int budget = Integer.valueOf(inputResultSet.getString("budget"));
                String contentRating = inputResultSet.getString("contentRating");
                String castList = inputResultSet.getString("castList");
                String productionCompanyList = inputResultSet.getString("productionCompanyList");
                boolean inColor=false;
                if(inputResultSet.getString("inColor").equalsIgnoreCase("true"))
                    inColor = true;
                else if(inputResultSet.getString("inColor").equalsIgnoreCase("false"))
                     inColor = false;
                
                int  runtime = Integer.valueOf(inputResultSet.getString("runtime"));
                String languages = inputResultSet.getString("languages");
                String storyline = inputResultSet.getString("storyline");
                String genreList = inputResultSet.getString("genreList");
                String trivia = inputResultSet.getString("trivia");
                String goofs = inputResultSet.getString("goofs");
                
                int numberOfRatings = Integer.valueOf(inputResultSet.getString("numberOfRatings"));
                float ratingOutOf10 = inputResultSet.getFloat("ratingOutOf10");
                AggregatedRating rating=new AggregatedRating(listingID, ratingOutOf10, numberOfRatings, "", ListingType.MOVIE);
                String imagePath ="/images/movies/"+listingID+".jpg";
                Movie tempMovie = new Movie(listingID, name, releaseDate, budget, contentRating,castList, productionCompanyList, inColor, runtime, languages, storyline, genreList, trivia, goofs, rating, imagePath);
                
                System.out.println(tempMovie.toString());
                moviesArrayList.add(tempMovie);
            }
		} 
		catch (Exception e) {
            
			e.printStackTrace();
			System.out.println("\n\tERROR in Movie.convertFromResultSet() : error while creating object from ResultSet.");
			return null;
		}
        
        return moviesArrayList;
    }

    public String toString(){
        
        String output= "Movie object: \n"+
            "   listingID: "+listingID+"\n"+
            "	name: "+name+"\n"+
            "	releaseDate: " +releaseDate+"\n"+
            "	budget :"+Integer.valueOf(budget)+"\n"+
            "	contentRating: " +contentRating+"\n"+
            "	castList :" +castList+"\n"+
            "	productionCompanyList : " +productionCompanyList+"\n"+
            "	inColor:"+Boolean.valueOf(inColor)+"\n"+
            "   runtime: "+Integer.valueOf(runtime)+"\n"+
            "   languages: "+languages+"\n"+
            "   storyline: "+storyline+"\n"+
            "   genreList: "+genreList+"\n"+
            "   trivia:"+trivia+"\n"+
            "   goofs: "+goofs+"\n"+
            "   ratingOutOf10:  "+rating.getRatingOutOf10()+"\n"+
            "   numberOfReviews: "+rating.getNumberOfRatings()+"\n";
                    
        
        return output;
    }
    
}
