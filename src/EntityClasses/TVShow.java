package EntityClasses;

import java.sql.Date;
import java.sql.ResultSet;
import java.util.Set;

public class TVShow extends Listing {
	//e.g. http://www.imdb.com/title/tt0903747/?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=2398042182&pf_rd_r=1C9KBSZSR37CE6K6H2M4&pf_rd_s=center-1&pf_rd_t=15506&pf_rd_i=toptv&ref_=chttvtp_tt_3
	public TVShow() {
	}

	private String name;
	private String creatorNameList;
	private Date releaseDate;
	private Date startDate;
	private String genreList;
	private String castList;
	private String storyline;
	private String certifications;
	private String languages;
	private int runtimePerEpisode;
	private int numberOfSeasons;
	private String productionCompanyList;
	private boolean inColor;
	private String trivia;
	private String goofs;

	public Set<TVShow> fetchDiscoverTVShowListingsDB(int numListings, int startNum) {
		// TODO implement here
		return null;
	}

	public int extractTVShowListingsFromWeb(int numberOfListings) {
		// TODO implement here
		return 0;
	}
	
    
    private boolean writeToDatabase(TVShow objToWrite){
        return false;
    }
    
    private Set<TVShow> convertFromResultSet(ResultSet inputResultSet){
        return null;
    }

}
