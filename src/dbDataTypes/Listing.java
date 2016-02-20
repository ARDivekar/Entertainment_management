package dbDataTypes;


abstract public class Listing {
	protected int listingID=-1;
	protected AggregatedRating rating=null;
	public Listing(int listingID, AggregatedRating rating) {
		super();
		this.listingID = listingID;
		this.rating = rating;
	}
	public int getListingID() {
		return listingID;
	}
	public AggregatedRating getRating() {
		return rating;
	}
		
	
}
 