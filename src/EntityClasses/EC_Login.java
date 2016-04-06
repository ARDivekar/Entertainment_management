package EntityClasses;


import databaseHandler.EntertainmentManagementDatabase;
import java.sql.ResultSet;
import java.util.*;

public class EC_Login {


	public String login(String username, String passwordHash) {
		EntertainmentManagementDatabase db = EntertainmentManagementDatabase.getInstance();
        String query = "SELECT User.username as 'username', emailID, firstName, lastName, date(DOB, 'unixepoch') as 'DOB', gender, passwordHash FROM User inner join Login On User.username=Login.username WHERE User.username=\""+username+"\" AND passwordHash=\""+passwordHash+"\" ;";
        System.out.println(query);
        ResultSet loginResultSet = db.tryArbitrarySelect(query);
        String errorString = "";
        int numberOfUsersWithThatLogin = new User().convertFromResultSet(loginResultSet).size();
        if(numberOfUsersWithThatLogin == 0 )
            errorString= "Unfortunately, there is no user with that username and password.";
        else if (numberOfUsersWithThatLogin == 1 )
            errorString= "Successfully Logged into system.";
        else if (numberOfUsersWithThatLogin > 1 )
            errorString= "Unfortunately, there are multiple users with that login.";
        return errorString;
	}

}