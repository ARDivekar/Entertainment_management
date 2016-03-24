package dbDataTypes;

enum Ownership{
	Owner, Wishlisted
}

public class UserCollectionItem {
	//these are ratings given to Listings by users. This is part of the MyCollection table of the database.
	private int listingID= -1;
	private int userID = -1;
	private float starsOutOf10 = -1;
	private String reviewText=""; //optional
	private Ownership ownership=null;
	
}
