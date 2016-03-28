
import java.util.*;

/**
 * 
 */
public class UserCollection {

	/**
	 * Default constructor
	 */
	public UserCollection() {
	}

	/**
	 * 
	 */
	private String username;

	/**
	 * 
	 */
	private Set<Listing> listingList;

	/**
	 * 
	 */
	private Ownership ownership;

	/**
	 * 
	 */
	private float ratingOutOf10;

	/**
	 * 
	 */
	private String reviewText;




	/**
	 * @param listingID 
	 * @param ownership 
	 * @param username 
	 * @param ratingOutOf10 
	 * @param reviewText 
	 * @return
	 */
	public String addToCollectionDB(int listingID, Ownership ownership, String username, float ratingOutOf10, String reviewText) {
		// TODO implement here
		return "";
	}

	/**
	 * @param listingID 
	 * @param ownership 
	 * @param ratingOutOf10 
	 * @param reviewText 
	 * @param username 
	 * @return
	 */
	public String modifyCollectionDB(int listingID, Ownership ownership, float ratingOutOf10, String reviewText, String username) {
		// TODO implement here
		return "";
	}

	/**
	 * @param listingID 
	 * @param username 
	 * @return
	 */
	public String deleteCollectionDB(int listingID, String username) {
		// TODO implement here
		return "";
	}

	/**
	 * @param numListings 
	 * @param startNum 
	 * @param username 
	 * @return
	 */
	public Set<Music> fetchCollectionMusicListingsDB(int numListings, int startNum, String username) {
		// TODO implement here
		return null;
	}

	/**
	 * @param numListings 
	 * @param startNum 
	 * @param username 
	 * @return
	 */
	public Set<TVShow> fetchCollectionTVShowListingsDB(int numListings, int startNum, String username) {
		// TODO implement here
		return null;
	}

	/**
	 * @param numListings 
	 * @param startNum 
	 * @param username 
	 * @return
	 */
	public Set<Movie> fetchCollectionMovieListingsDB(int numListings, int startNum, String username) {
		// TODO implement here
		return null;
	}

	/**
	 * @param numListings 
	 * @param startNum 
	 * @param username 
	 * @return
	 */
	public Set<Book> fetchCollectionBookListingsDB(int numListings, int startNum, String username) {
		// TODO implement here
		return null;
	}

}