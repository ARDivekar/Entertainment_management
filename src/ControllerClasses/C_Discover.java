package ControllerClasses;
import EntityClasses.Book;
import EntityClasses.TVShow;
import EntityClasses.Movie;
import EntityClasses.Music;
import java.util.*;

public class C_Discover {

	public C_Discover() {
	}

	public ArrayList<Music> getDiscoverMusicListings(int numListings, int startNum) {
		// TODO implement here
        return null;
	}

	public ArrayList<Movie> getDiscoverMovieListings(int numListings, int startNum) {
        Movie movieObj = new Movie();
        return movieObj.fetchDiscoverMovieListingsDB(numListings, startNum);
		
	}

	public ArrayList<TVShow> getDiscoverTVShowListings(int numListings, int startNum) {
		// TODO implement here
		return null;
	}

	public ArrayList<Book> getDiscoverBookListings(int numListings, int startNum) {
		// TODO implement here
		return null;
	}

}