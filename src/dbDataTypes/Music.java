package dbDataTypes;

import java.sql.ResultSet;
import java.util.*;

public class Music extends Listing {
	// e.g. (note this is an album; each song is a separate listing): https://itunes.apple.com/in/album/in-time-best-r.e.m.-1988-2003/id3477362
	public Music() {
	}

	private String name;
	private String artistList;
	private String albumName;
	private int indexInAlbum;
	private float songLengthMinutes;
	private float songLengthSeconds;
	private String genreList;
	private Date releaseDate;
	private String copyright;

	public Set<Music> fetchDiscoverMusicListingsDB(int numListings, int startNum) {
		// TODO implement here
		return null;
	}

	public int extractMusicListingsFromWeb(int numberOfListings) {
		// TODO implement here
		return 0;
	}
    
    private boolean writeToDatabase(Music objToWrite){
        return false;
    }
    
    private Set<Music> convertFromResultSet(ResultSet inputResultSet){
        return null;
    }

}