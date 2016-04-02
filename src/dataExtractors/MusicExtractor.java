package dataExtractors;
import dbDataTypes.*;
public class MusicExtractor extends Extractor{
	private Music[] extractedMusicListings;
	private static MusicExtractor singleton=null;
	
	
	private MusicExtractor(int numListings){
		this.numListings=numListings;
		this.listingType = "Music";
		this.sourceURLList=new String[1];
		this.sourceURLList[0]="https://itunes.apple.com/in/genre/music/id34";
	}
	
	public MusicExtractor getMusicExtractor(int numListings){
		if(singleton==null){
			singleton=new MusicExtractor(numListings);
		}
		return singleton;
	}
	
	public MusicExtractor getMusicExtractor(){
		if(singleton==null){
			singleton=new MusicExtractor(50);
		}
		return singleton;
	}
	
	@Override
	protected void extract() throws CannotExtractException{
		
	}

	@Override
	protected void saveToDB() throws NoDBException{
		
	}
	
}
