package dbDataTypes;

import java.sql.Date;

public class Book extends Listing{
	
	// e.g. https://itunes.apple.com/us/book/good-to-great/id446886360?mt=11
	private String name="";
	private String categoryList="";
	private Date publishedDate=null;
	private String publisherName="";
	private String seller="";
	private int numberOfPages = -1;
	private String description="";
	private String languageList="";
	
	
}
