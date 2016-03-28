
import java.util.*;

/**
 * 
 */
public class Movie extends Listing {

	/**
	 * Default constructor
	 */
	public Movie() {
	}

	/**
	 * 
	 */
	private String name;

	/**
	 * 
	 */
	private Date releaseDate;

	/**
	 * 
	 */
	private int budget;

	/**
	 * 
	 */
	private String contentRating;

	/**
	 * 
	 */
	private String castList;

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
	private int runtime;

	/**
	 * 
	 */
	private String languages;

	/**
	 * 
	 */
	private String storyline;

	/**
	 * 
	 */
	private String genreList;

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
	public Set<Movie> fetchDiscoverMovieListingsDB(int numListings, int startNum) {
		// TODO implement here
		return null;
	}

	/**
	 * @param numberOfListings 
	 * @return
	 */
	public int extractMovieListingsFromWeb(int numberOfListings) {
		// TODO implement here
		return 0;
	}

}