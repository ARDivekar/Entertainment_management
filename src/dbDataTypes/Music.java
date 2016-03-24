
package dbDataTypes;

import java.sql.Date;

public class Music extends Listing {
	
	
	// e.g. (note this is an album; each song is a separate listing): https://itunes.apple.com/in/album/in-time-best-r.e.m.-1988-2003/id3477362
	private String name="";
	private String artistList="";
	private String albumName="";
	private int indexInAlbum = -1;
	private float songLengthMinutes=0;
	private float songLengthSeconds=0;
	private String genreList="";
	private Date releaseDate=null;
	private String copyright="";
	
	
}
