
package dbDataTypes;

import java.util.Date;

public class Music extends Listing {
	
	
	// e.g. (note this is an album; each song is a separate listing): https://itunes.apple.com/in/album/in-time-best-r.e.m.-1988-2003/id3477362
	private String name="";
	private String artistList="";
	private String albumName="";
	private int indexInAlbum = -1;
	private float songLengthMinutes=0;
	private float songLengthSeconds=0;
	private String genreList="";
	private Date released=null;
	private String copyright="";
	
	public Music(int listingID, AggregatedRating rating, String name, String artistList, String albumName,
			int indexInAlbum, float songLengthMinutes, float songLengthSeconds, String genreList, Date released,
			String copyright) {
		super(listingID, rating);
		this.name = name;
		this.artistList = artistList;
		this.albumName = albumName;
		this.indexInAlbum = indexInAlbum;
		this.songLengthMinutes = songLengthMinutes;
		this.songLengthSeconds = songLengthSeconds;
		this.genreList = genreList;
		this.released = released;
		this.copyright = copyright;
	}
	public String getName() {
		return name;
	}
	public String getArtistList() {
		return artistList;
	}
	public String getAlbumName() {
		return albumName;
	}
	public int getIndexInAlbum() {
		return indexInAlbum;
	}
	public float getSongLengthMinutes() {
		return songLengthMinutes;
	}
	public float getSongLengthSeconds() {
		return songLengthSeconds;
	}
	public String getGenreList() {
		return genreList;
	}
	public Date getReleased() {
		return released;
	}
	public String getCopyright() {
		return copyright;
	}


	
	
	
}
