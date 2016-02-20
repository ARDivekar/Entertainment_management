package dbDataTypes;

import java.util.Date;

enum Gender{
	M,F
}

public class User {
	
	private int userID=-1;
	private String username="";
	private String emailID="";
	private String firstName="";
	private String lastName="";
	private Date DOB=null;
	private Gender gender = null;
	private String passwordHash = ""; //saving the raw password anywhere is bad for security purposes. Use Hasher.MD5(passwordString) to get the hash of it.
	
	public User(int userID, String username, String emailID, String firstName, String lastName, Date dOB, Gender gender,
			String passwordHash) {
		super();
		this.userID = userID;
		this.username = username;
		this.emailID = emailID;
		this.firstName = firstName;
		this.lastName = lastName;
		DOB = dOB;
		this.gender = gender;
		this.passwordHash = passwordHash;
	}
	
	public String getPasswordHash() {
		return passwordHash;
	}
	public int getUserID() {
		return userID;
	}
	public String getUsername() {
		return username;
	}
	public String getEmailID() {
		return emailID;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Date getDOB() {
		return DOB;
	}
	public Gender getGender() {
		return gender;
	}
	

}
