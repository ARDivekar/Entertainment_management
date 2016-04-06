package EntityClasses;

import databaseHandler.DatabaseHandler;
import databaseHandler.EntertainmentManagementDatabase;
import databaseHandler.SQLiteDatabaseHandler;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Set;

enum UserType{
	Common, Admin
}

public class User {	

	private String username;
	private String emailID;
	private String firstName;
	private String lastName;
	private java.sql.Date DOB;
	private Gender gender;
	private String passwordHash; //saving the raw password anywhere is bad for security purposes. Use Hasher.MD5(passwordString) to get the hash of it.

    public User(String username, String emailID, String firstName, String lastName, Date DOB, Gender gender, String passwordHash) {
        this.username = username;
        this.emailID = emailID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
        this.gender = gender;
        this.passwordHash = passwordHash;
    }


    
    
	public String saveUserDetailsToDB(Date DOB, String emailID, String firstName, Gender gender, String lastName, String passwordHash, String username) {
		if(writeToDatabase(new User(username, emailID, firstName, lastName, DOB, gender, passwordHash)))
    		return "Successfully Entered into database";
        else {
            String errorString = "Unfortunately, could not save details of user '"+username+"'.";
            return errorString;
        }
	}

	public User getUserInfoDB(String username) {
		EntertainmentManagementDatabase db = EntertainmentManagementDatabase.getInstance();
        String query= "SELECT User.username as 'username', emailID, firstName, lastName, date(DOB, 'unixepoch') as 'DOB', gender, passwordHash FROM User inner join Login On User.username=Login.username WHERE User.username=\""+username+"\";";
        System.out.println(query);
        ResultSet userResultSet = db.tryArbitrarySelect(query);
        ArrayList<User> usersWithThatUserName = convertFromResultSet(userResultSet);
        if (usersWithThatUserName==null || usersWithThatUserName.size()!= 1)
            return null;
        else return usersWithThatUserName.get(0);
	}

	public Set<AggregatedRating> getUserReviewsAndRatingsDB(String username) {
		// TODO implement here
		return null;
	}
    
    
    public boolean writeToDatabase(User objToWrite){
        System.out.println("\n\nTrying to insert into database:\n"+objToWrite);
        
        EntertainmentManagementDatabase db = EntertainmentManagementDatabase.getInstance();
        
        String[] userTablefieldsList = {"username", "emailID", "firstName", "lastName", "DOB", "gender"};
        String [][]userTableDataList = new String[1][6];
        
        userTableDataList[0][0]=objToWrite.username; 
        userTableDataList[0][1]=objToWrite.emailID;  
        userTableDataList[0][2]=objToWrite.firstName;
        userTableDataList[0][3]=objToWrite.lastName;
        userTableDataList[0][4]=EntertainmentManagementDatabase.convertDateToSQLiteDBUNIXEpochString(objToWrite.DOB);
        userTableDataList[0][5]=objToWrite.gender.toString();
        
        String[] loginTablefieldsList =  {"username", "passwordHash"};
        String[][] loginTableDataList = new String[1][2];
        loginTableDataList[0][0] = objToWrite.username;
        loginTableDataList[0][1] = objToWrite.passwordHash;
        
        boolean userInsertStatus = db.tryInsert("User", userTablefieldsList, userTableDataList);
        System.out.println("\nUSER INSERTION STATUS: "+ userInsertStatus);
        
        boolean loginInsertStatus =  db.tryInsert("Login", loginTablefieldsList, loginTableDataList);
        System.out.println("\nLOGIN INSERTION STATUS: "+ loginInsertStatus);
        
        if(userInsertStatus && loginInsertStatus)
            return true;
        else return false;
    }
    
    
    
    
    public ArrayList<User> convertFromResultSet(ResultSet inputResultSet){
        ArrayList<User> usersArrayList = new ArrayList<User>();
        
        try {
			while(inputResultSet.next()){
                String username = inputResultSet.getString("username"); 
                String emailID = inputResultSet.getString("emailID");
                String firstName = inputResultSet.getString("firstName");
                String lastName = inputResultSet.getString("lastName");
                Date DOB = EntertainmentManagementDatabase.convertStringToDate(inputResultSet.getString("DOB"));
                Gender gender = null;
                if(inputResultSet.getString("gender").equals(Gender.M.toString()))
                    gender = Gender.M;
                else if(inputResultSet.getString("gender").equals(Gender.F.toString()))
                    gender = Gender.F;
                String passwordHash = inputResultSet.getString("passwordHash");

                User tempUser = new User(username, emailID, firstName, lastName, DOB, Gender.M, passwordHash);
                System.out.println(tempUser.toString());
                usersArrayList.add(tempUser);
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("\n\tERROR in User.convertFromResultSet() : error while creating object from ResultSet.");
			return null;
		}
        
        return usersArrayList;
    }
    
    public String toString(){
        
        String output= "User object: \n"+
            "	username: " + username +"\n"+
            "	emailID: " + emailID +"\n"+
            "	firstName: " + firstName +"\n"+
            "	lastName: " + lastName +"\n"+
            "	DOB: " + EntertainmentManagementDatabase.convertDateToString(DOB) +"\n"+
            "	gender: " + gender.toString() +"\n"+
            "	passwordHash:"+ passwordHash +"\n";
        
        return output;
    }

}

