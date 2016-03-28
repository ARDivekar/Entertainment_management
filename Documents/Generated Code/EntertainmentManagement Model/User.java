
import java.util.*;

/**
 * 
 */
public class User {

	/**
	 * Default constructor
	 */
	public User() {
	}

	/**
	 * 
	 */
	private String username;

	/**
	 * 
	 */
	private String emailID;

	/**
	 * 
	 */
	private String firstName;

	/**
	 * 
	 */
	private String lastName;

	/**
	 * 
	 */
	private Date DOB;

	/**
	 * 
	 */
	private Gender gender;

	/**
	 * 
	 */
	private String passwordHash;







	/**
	 * @param DOB 
	 * @param emailID 
	 * @param firstName 
	 * @param gender 
	 * @param lastName 
	 * @param passwordHash 
	 * @param username 
	 * @return
	 */
	public String saveUserDetailsToDB(Date DOB, String emailID, String firstName, Gender gender, String lastName, String passwordHash, String username) {
		// TODO implement here
		return "";
	}

	/**
	 * @param username 
	 * @return
	 */
	public User getUserInfoDB(String username) {
		// TODO implement here
		return null;
	}

	/**
	 * @param username 
	 * @return
	 */
	public Set<AggregatedRating> getUserReviewsAndRatingsDB(String username) {
		// TODO implement here
		return null;
	}

}