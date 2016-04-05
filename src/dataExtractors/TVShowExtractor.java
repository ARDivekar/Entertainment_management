package dataExtractors;
import EntityClasses.TVShow;
public class TVShowExtractor extends Extractor{
	private TVShow[] extractedMusicListings;
	private static TVShowExtractor singleton=null;
	
	
	
	private TVShowExtractor(int numListings){
		this.numListings=numListings;
		this.listingType = "Music";
		this.sourceURLList=new String[1];
		this.sourceURLList[0]="http://www.imdb.com/chart/toptv/?sort=rk,asc&mode=simple";
	}
	
	public TVShowExtractor getTVShowExtractor(int numListings){
		if(singleton==null){
			singleton=new TVShowExtractor(numListings);
		}
		return singleton;
	}
	
	public TVShowExtractor getMusicExtractor(){
		if(singleton==null){
			singleton=new TVShowExtractor(50);
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
