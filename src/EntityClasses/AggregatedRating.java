package EntityClasses;

public class AggregatedRating {
	//given to a listing, not given by users (for that, see UserRating.java).
	public AggregatedRating() {
	}
    
	private int listingID;
	private float ratingOutOf10;
	private int numberOfRatings;
    private String reviewText;  //only applicable when numberOfReviews == 1
	private ListingType listingType;

    public AggregatedRating(int listingID, float ratingOutOf10, int numberOfRatings, String reviewText, ListingType listingType) {
        this.listingID = listingID;
        this.ratingOutOf10 = ratingOutOf10;
        this.numberOfRatings = numberOfRatings;
        this.reviewText = reviewText;
        this.listingType = listingType;
    }

    public int getListingID() {
        return listingID;
    }

    public float getRatingOutOf10() {
        return ratingOutOf10;
    }

    public int getNumberOfRatings() {
        return numberOfRatings;
    }

    public String getReviewText() {
        return reviewText;
    }

    public ListingType getListingType() {
        return listingType;
    }
	
}
