package EntityClasses;

import java.util.*;

public class UserCalendar {

	public UserCalendar() {
	}

	private String username;
	private Set<Event> eventList;


	public Set<Event> fetchCalendarEventsDB(String username) {
		// TODO implement here
		return null;
	}

	public void addEventToCalendarDB(Event eventToAdd, String username, String eventAddStatus) {
		// TODO implement here
	}

	public Event getEventFromIDDB(int eventID) {
		// TODO implement here
		return null;
	}

	public String deleteEventFromCalendarDB(int eventID, String username) {
		// TODO implement here
		return "";
	}

}