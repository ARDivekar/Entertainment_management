package dbDataTypes;

import java.sql.Date;

enum Gender{
	M,F
}
enum UserType{
	Common, Admin
}

public class User {
	
	private int userID=-1;
	private String username="";
	private UserType userType=null;
	private String emailID="";
	private String firstName="";
	private String lastName="";
	private Date DOB=null;
	private Gender gender = null;
	private String passwordHash = ""; //saving the raw password anywhere is bad for security purposes. Use Hasher.MD5(passwordString) to get the hash of it.
	
	
	

}
