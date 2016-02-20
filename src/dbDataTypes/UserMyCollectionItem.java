package dbDataTypes;

enum Ownership{
	Owner, Wishlisted
}

public class UserMyCollectionItem {
	//these are ratings given to Listings by users. This is part of the MyCollection table of the database.
	
	private int listingID=-1;
	private int userID = -1;
	private float starsOutOf10 = -1;
	private String reviewText=""; //optional
	private Ownership ownership=null;
	public UserMyCollectionItem(int listingID, int userID, float starsOutOf10, String reviewText, Ownership ownership) {
		super();
		this.listingID = listingID;
		this.userID = userID;
		this.starsOutOf10 = starsOutOf10;
		this.reviewText = reviewText;
		this.ownership = ownership;
	}
	
	public int getListingID() {
		return listingID;
	}
	public int getUserID() {
		return userID;
	}
	public float getStarsOutOf10() {
		return starsOutOf10;
	}
	public String getReviewText() {
		return reviewText;
	}
	public Ownership getOwnership() {
		return ownership;
	}
	
	
	
	
}
