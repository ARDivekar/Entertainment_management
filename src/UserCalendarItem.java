
public class UserCalendarItem {
	private int userID = -1;
	private int eventID = -1;
	public UserCalendarItem(int userID, int eventID) {
		super();
		this.userID = userID;
		this.eventID = eventID;
	}
	public int getUserID() {
		return userID;
	}
	public int getEventID() {
		return eventID;
	}
	
	
}
