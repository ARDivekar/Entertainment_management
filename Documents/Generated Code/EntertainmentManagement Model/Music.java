
import java.util.*;

/**
 * 
 */
public class Music extends Listing {

	/**
	 * Default constructor
	 */
	public Music() {
	}

	/**
	 * 
	 */
	private String name;

	/**
	 * 
	 */
	private String artistList;

	/**
	 * 
	 */
	private String albumName;

	/**
	 * 
	 */
	private int indexInAlbum;

	/**
	 * 
	 */
	private float songLengthMinutes;

	/**
	 * 
	 */
	private float songLengthSeconds;

	/**
	 * 
	 */
	private String genreList;

	/**
	 * 
	 */
	private Date releaseDate;

	/**
	 * 
	 */
	private String copyright;

	/**
	 * @param numListings 
	 * @param startNum 
	 * @return
	 */
	public Set<Music> fetchDiscoverMusicListingsDB(int numListings, int startNum) {
		// TODO implement here
		return null;
	}

	/**
	 * @param numberOfListings 
	 * @return
	 */
	public int extractMusicListingsFromWeb(int numberOfListings) {
		// TODO implement here
		return 0;
	}

}