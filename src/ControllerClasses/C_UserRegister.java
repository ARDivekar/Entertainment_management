package ControllerClasses;
import EntityClasses.Gender;
import EntityClasses.User;
import java.io.IOException;
import java.sql.Date;
import javax.servlet.*;
import javax.servlet.http.*;

public class C_UserRegister {
    

	public String tryUserRegister(Date DOB, String emailID, String firstName, Gender gender, String lastName, String passwordHash, String username) {
        User user = new User(null, null, null, null, null, null, null);
        return user.saveUserDetailsToDB(DOB, emailID, firstName, gender, lastName, passwordHash, username);
		
	}

}