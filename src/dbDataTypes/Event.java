package dbDataTypes;

import java.util.Date;

public class Event{
	private int eventID=-1;
	private String name="";
	private String category="";
	private String venue="";
	private Date fromDate=null;  //can include HH:MM:SS
	private Date toDate=null;	//can include HH:MM:SS
	private String description="";
	private String pricesList="";	//e.g. VIP: Rs. 500, etc. 
	private String termsAndConditions="";
	private AggregatedRating rating=null;
	
	
	public Event(int eventID, String name, String category, String venue, Date fromDate, Date toDate,
			String description, String pricesList, String termsAndConditions, AggregatedRating rating) {
		super();
		this.eventID = eventID;
		this.name = name;
		this.category = category;
		this.venue = venue;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.description = description;
		this.pricesList = pricesList;
		this.termsAndConditions = termsAndConditions;
		this.rating = rating;
	}
	
	
	public int getEventID() {
		return eventID;
	}
	public String getName() {
		return name;
	}
	public String getCategory() {
		return category;
	}
	public String getVenue() {
		return venue;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public String getDescription() {
		return description;
	}
	public String getPricesList() {
		return pricesList;
	}
	public String getTermsAndConditions() {
		return termsAndConditions;
	}
	public AggregatedRating getRating() {
		return rating;
	}

	
	
	
}

