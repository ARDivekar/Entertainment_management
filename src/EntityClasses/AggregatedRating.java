package EntityClasses;

public class AggregatedRating {
	//given to a listing, not given by users (for that, see UserRating.java).
	public AggregatedRating() {
	}
    
	private int listingID;
	private float ratingOutOf10;
	private int numberOfReviews;
    private String reviewText;  //only applicable when numberOfReviews == 1
	private ListingType listingType;
	
}
