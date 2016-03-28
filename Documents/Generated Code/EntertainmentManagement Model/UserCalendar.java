
import java.util.*;

/**
 * 
 */
public class UserCalendar {

	/**
	 * Default constructor
	 */
	public UserCalendar() {
	}

	/**
	 * 
	 */
	private String username;

	/**
	 * 
	 */
	private Set<Event> eventList;

	/**
	 * 
	 */
	private boolean attended;

	/**
	 * 
	 */
	private float userStarsOutOf10;

	/**
	 * 
	 */
	private String userReviewText;



	/**
	 * @param username 
	 * @return
	 */
	public Set<Event> fetchCalendarEventsDB(String username) {
		// TODO implement here
		return null;
	}

	/**
	 * @param eventToAdd 
	 * @param username 
	 * @param eventAddStatus
	 */
	public void addEventToCalendarDB(Event eventToAdd, String username, String eventAddStatus) {
		// TODO implement here
	}

	/**
	 * @param eventID 
	 * @return
	 */
	public Event getEventFromIDDB(int eventID) {
		// TODO implement here
		return null;
	}

	/**
	 * @param eventID 
	 * @param username 
	 * @return
	 */
	public String deleteEventFromCalendarDB(int eventID, String username) {
		// TODO implement here
		return "";
	}

}