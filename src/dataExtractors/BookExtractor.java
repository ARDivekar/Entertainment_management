package dataExtractors;
import EntityClasses.Book;
public class BookExtractor extends Extractor{
	private Book[] extractedBookListings;
	private static BookExtractor singleton=null;
	
	
	private BookExtractor(int numListings){
		this.numListings=numListings;
		this.listingType = "Book";
		this.sourceURLList=new String[1];
		this.sourceURLList[0]="https://itunes.apple.com/us/genre/books/id38?mt=11";
	}
	
	public BookExtractor getBookExtractor(int numListings){
		if(singleton==null){
			singleton=new BookExtractor(numListings);
		}
		return singleton;
	}
	
	public BookExtractor getBookExtractor(){
		if(singleton==null){
			singleton=new BookExtractor(50);
		}
		return singleton;
	}
	
	@Override
	protected void extract()  throws CannotExtractException{
		
	}

	@Override
	protected void saveToDB()  throws NoDBException{
		
	}
	
}
