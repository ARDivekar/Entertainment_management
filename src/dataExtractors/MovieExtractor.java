package dataExtractors;
import EntityClasses.Movie;
public class MovieExtractor extends Extractor {
	private Movie[] extractedMovieListings;
	private static MovieExtractor singleton=null;
	
	
	private MovieExtractor(int numListings){
		this.numListings=numListings;
		this.listingType = "Movie";
		this.sourceURLList=new String[1];
		this.sourceURLList[0]="http://www.imdb.com/chart/top";
	}
	
	public MovieExtractor getMovieExtractor(int numListings){
		if(singleton==null){
			singleton=new MovieExtractor(numListings);
		}
		return singleton;
	}
	
	public MovieExtractor getMovieExtractor(){
		if(singleton==null){
			singleton=new MovieExtractor(50);
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
