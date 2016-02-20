package dbDataTypes;

import java.util.Date;

public class Book extends Listing{
	
	// e.g. https://itunes.apple.com/us/book/good-to-great/id446886360?mt=11
	private String name="";
	private String categoryList="";
	private Date published=null;
	private String publisherName="";
	private String seller="";
	private int numberOfPages = -1;
	private String description="";
	private String languageList="";
	public Book(int listingID, AggregatedRating rating, String name, String categoryList, Date published,
			String publisherName, String seller, int numberOfPages, String description, String languageList) {
		super(listingID, rating);
		this.name = name;
		this.categoryList = categoryList;
		this.published = published;
		this.publisherName = publisherName;
		this.seller = seller;
		this.numberOfPages = numberOfPages;
		this.description = description;
		this.languageList = languageList;
	}
	public String getName() {
		return name;
	}
	public String getCategoryList() {
		return categoryList;
	}
	public Date getPublished() {
		return published;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public String getSeller() {
		return seller;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public String getDescription() {
		return description;
	}
	public String getLanguageList() {
		return languageList;
	}
	
}
