package dbDataTypes;

import java.sql.Date;
import java.sql.Time;

public class Event{
	private int eventID=-1;
	private String name="";
	private String category="";
	private String venue="";
	private Date fromDate=null;
	private Time fromTime=null; // HH:MM:SS
	private Date toDate=null;	
	private Time toTime=null;	// HH:MM:SS
	private String description="";
	private String pricesList="";	//e.g. VIP: Rs. 500, etc. 
	private String termsAndConditions="";
	private AggregatedRating rating=null;
	
	
	
	
	
}

