package dataExtractors;
import EntityClasses.Event;
public class EventExtractor extends Extractor{
	private Event[] extractedEventListings;
	private static EventExtractor singleton=null;
	
	
	EventExtractor(int numListings){
		this.numListings=numListings;
		this.listingType = "Event";
		this.sourceURLList=new String[3];
		
//		this.sourceURLList[]="";

		//Movie Events:
		this.sourceURLList[0]="https://in.bookmyshow.com/mumbai/movies/nowshowing";
		this.sourceURLList[1]="https://in.bookmyshow.com/mumbai/movies/comingsoon";
		//Music festivals, concerts, plays, etc. 
		this.sourceURLList[2]="https://in.bookmyshow.com/mumbai/events";
		
	}
	
	public EventExtractor getEventExtractor(int numListings){
		if(singleton==null){
			singleton=new EventExtractor(numListings);
		}
		return singleton;
	}
	
	public EventExtractor getEventExtractor(){
		if(singleton==null){
			singleton=new EventExtractor(100);
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
