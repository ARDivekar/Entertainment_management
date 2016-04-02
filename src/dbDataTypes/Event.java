package dbDataTypes;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.Set;

public class Event{

    public Event() {
	}


	private int eventID;
	private String name;
	private String category;
	private String venue;
	private Date fromDate; // YY-MM-DD
	private Time fromTime; // HH:MM:SS
	private String description;
	private String pricesList; //e.g. VIP: Rs. 500, etc. 
	private String termsAndConditions;
	public String imagePath;


	public Set<Event> getNewEventsDB(String username) {
		// TODO implement here
		return null;
	}

	public String clearEventsFromUserProfileDB(String username) {
		// TODO implement here
		return "";
	}

	public int extractEventsFromWeb(int numberOfEvents) {
		// TODO implement here
		return 0;
	}

	
    private boolean writeToDatabase(Event objToWrite){
        return false;
    }
    
    private Set<Event> convertFromResultSet(ResultSet inputResultSet){
        return null;
    }

	
	
	
}

