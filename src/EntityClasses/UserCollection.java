package EntityClasses;


import java.util.*;

public class UserCollection {

	public UserCollection() {
	}

	private String username;
	private Set<Listing> listingList;
	private Set<Ownership> ownership;
	

	public String addToCollectionDB(int listingID, Ownership ownership, String username, float ratingOutOf10, String reviewText) {
		// TODO implement here
		return "";
	}

	public String modifyCollectionDB(int listingID, Ownership ownership, float ratingOutOf10, String reviewText, String username) {
		// TODO implement here
		return "";
	}

	public String deleteCollectionDB(int listingID, String username) {
		// TODO implement here
		return "";
	}

	public Set<Music> fetchCollectionMusicListingsDB(int numListings, int startNum, String username) {
		// TODO implement here
		return null;
	}

	public Set<TVShow> fetchCollectionTVShowListingsDB(int numListings, int startNum, String username) {
		// TODO implement here
		return null;
	}

	public Set<Movie> fetchCollectionMovieListingsDB(int numListings, int startNum, String username) {
		// TODO implement here
		return null;
	}

	public Set<Book> fetchCollectionBookListingsDB(int numListings, int startNum, String username) {
		// TODO implement here
		return null;
	}

}