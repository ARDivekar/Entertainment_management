
import java.util.*;

/**
 * 
 */
public class TVShow extends Listing {

	/**
	 * Default constructor
	 */
	public TVShow() {
	}

	/**
	 * 
	 */
	private String name;

	/**
	 * 
	 */
	private String creatorNameList;

	/**
	 * 
	 */
	private Date releaseDate;

	/**
	 * 
	 */
	private Date startDate;

	/**
	 * 
	 */
	private String genreList;

	/**
	 * 
	 */
	private String castList;

	/**
	 * 
	 */
	private String storyline;

	/**
	 * 
	 */
	private String certifications;

	/**
	 * 
	 */
	private String languages;

	/**
	 * 
	 */
	private int runtimePerEpisode;

	/**
	 * 
	 */
	private int numberOfSeasons;

	/**
	 * 
	 */
	private String productionCompanyList;

	/**
	 * 
	 */
	private boolean inColor;

	/**
	 * 
	 */
	private String trivia;

	/**
	 * 
	 */
	private String goofs;

	/**
	 * @param numListings 
	 * @param startNum 
	 * @return
	 */
	public Set<TVShow> fetchDiscoverTVShowListingsDB(int numListings, int startNum) {
		// TODO implement here
		return null;
	}

	/**
	 * @param numberOfListings 
	 * @return
	 */
	public int extractTVShowListingsFromWeb(int numberOfListings) {
		// TODO implement here
		return 0;
	}

}