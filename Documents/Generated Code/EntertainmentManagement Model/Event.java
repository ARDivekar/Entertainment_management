
import java.util.*;

/**
 * 
 */
public class Event {

	/**
	 * Default constructor
	 */
	public Event() {
	}

	/**
	 * 
	 */
	private int eventID;

	/**
	 * 
	 */
	private String name;

	/**
	 * 
	 */
	private String category;

	/**
	 * 
	 */
	private String venue;

	/**
	 * 
	 */
	private Date fromDate;

	/**
	 * 
	 */
	private Time fromTime;

	/**
	 * 
	 */
	private Date toDate;

	/**
	 * 
	 */
	private Time toTime;

	/**
	 * 
	 */
	private String description;

	/**
	 * 
	 */
	private String pricesList;

	/**
	 * 
	 */
	private String termsAndConditions;

	/**
	 * 
	 */
	private AggregatedRating rating;





	/**
	 * @param username 
	 * @return
	 */
	public Set<Event> getNewEventsDB(String username) {
		// TODO implement here
		return null;
	}

	/**
	 * @param username 
	 * @return
	 */
	public String clearEventsFromUserProfileDB(String username) {
		// TODO implement here
		return "";
	}

}