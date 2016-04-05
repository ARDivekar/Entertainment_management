package dbDataTypes;

import databaseHandler.EntertainmentManagementDatabase;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.Set;

public class Event{

//    public Event() {
//	}


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

    public Event(int eventID, String name, String category, String venue, Date fromDate, Time fromTime, String description, String pricesList, String termsAndConditions, String imagePath) {
        this.eventID = eventID;
        this.name = name;
        this.category = category;
        this.venue = venue;
        this.fromDate = fromDate;
        this.fromTime = fromTime;
        this.description = description;
        this.pricesList = pricesList;
        this.termsAndConditions = termsAndConditions;
        this.imagePath = imagePath;
    }

    
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

	
    public static boolean writeToDatabase(Event objToWrite){
         EntertainmentManagementDatabase db = EntertainmentManagementDatabase.getInstance();
        
        String[] userTablefieldsList = {"eventID", "name", "category", "venue", "fromDate", "fromTime", "description", "pricesList", "termsAndConditions", "imagePath"};
        String [][]userTableDataList = new String[1][10];
        
        userTableDataList[0][0]=String.valueOf(objToWrite.eventID); 
        userTableDataList[0][1]=objToWrite.name;  
        userTableDataList[0][2]=objToWrite.category;
        userTableDataList[0][3]=objToWrite.venue;
        userTableDataList[0][4]=EntertainmentManagementDatabase.convertDateToSQLiteDBUNIXEpochString(objToWrite.fromDate);
        userTableDataList[0][5]=EntertainmentManagementDatabase.convertTimeToSQLiteDBUNIXEpochString(objToWrite.fromTime);
        userTableDataList[0][6]=objToWrite.description;
        userTableDataList[0][7]=objToWrite.pricesList;
        userTableDataList[0][8]=objToWrite.termsAndConditions;
        userTableDataList[0][9]=objToWrite.imagePath;

        boolean insertStatus = db.tryInsert("Event", userTablefieldsList, userTableDataList);
        System.out.println("\nEVENT INSERTION STATUS: "+ insertStatus);

        
        return false;
    }
    
    private Set<Event> convertFromResultSet(ResultSet inputResultSet){
        return null;
    }

	
	
	
}

