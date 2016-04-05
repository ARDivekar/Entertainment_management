package EntityClasses;

import java.sql.Date;
import java.sql.ResultSet;
import java.util.Set;

public class Book extends Listing{
	
	// e.g. https://itunes.apple.com/us/book/good-to-great/id446886360?mt=11
	public Book() {
	}


	private String name;
	private String genreList;
	private Date publishedDate;
	private String publisherName;
	private String seller;
	private int numberOfPages;
	private String description;
	private String languageList;
	private String author;

	public Set<Book> fetchDiscoverBookListingsDB(int numListings, int startNum) {
		// TODO implement here
		return null;
	}

	public int extractBookListingsFromWeb(int numberOfListings) {
		// TODO implement here
		return 0;
	}
    
    
    private boolean writeToDatabase(Book objToWrite){
        return false;
    }
    
    private Set<Book> convertFromResultSet(ResultSet inputResultSet){
        return null;
    }

	
	
}
