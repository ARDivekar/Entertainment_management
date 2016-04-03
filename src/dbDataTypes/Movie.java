package dbDataTypes;

import java.sql.Date;
import java.sql.ResultSet;
import java.util.Set;

public class Movie extends Listing {
	
	//e.g. http://www.imdb.com/title/tt0111161/?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=2398042102&pf_rd_r=0KNPDE5EECDTXH1CFFEZ&pf_rd_s=center-1&pf_rd_t=15506&pf_rd_i=top&ref_=chttp_tt_1
	
    public Movie() {
//abcde
	}

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

	public Set<Movie> fetchDiscoverMovieListingsDB(int numListings, int startNum) {
		// TODO implement here
		return null;
	}

	public int extractMovieListingsFromWeb(int numberOfListings) {
		// TODO implement here
		return 0;
	}
    
    
    private boolean writeToDatabase(Movie objToWrite){
        return false;
    }
    
    private Set<Movie> convertFromResultSet(ResultSet inputResultSet){
        return null;
    }

	
}
