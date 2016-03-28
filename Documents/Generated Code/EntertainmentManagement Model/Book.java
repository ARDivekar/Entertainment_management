
import java.util.*;

/**
 * 
 */
public class Book extends Listing {

	/**
	 * Default constructor
	 */
	public Book() {
	}

	/**
	 * 
	 */
	private String name;

	/**
	 * 
	 */
	private String genreList;

	/**
	 * 
	 */
	private Date publishedDate;

	/**
	 * 
	 */
	private String publisherName;

	/**
	 * 
	 */
	private String seller;

	/**
	 * 
	 */
	private int numberOfPages;

	/**
	 * 
	 */
	private String description;

	/**
	 * 
	 */
	private String languageList;

	/**
	 * 
	 */
	private String author;

	/**
	 * @param numListings 
	 * @param startNum 
	 * @return
	 */
	public Set<Book> fetchDiscoverBookListingsDB(int numListings, int startNum) {
		// TODO implement here
		return null;
	}

	/**
	 * @param numberOfListings 
	 * @return
	 */
	public int extractBookListingsFromWeb(int numberOfListings) {
		// TODO implement here
		return 0;
	}

}