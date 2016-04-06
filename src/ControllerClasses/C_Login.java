package ControllerClasses;
import EntityClasses.EC_Login;
import java.util.*;

public class C_Login {


	public String trySystemLogin(String username, String passwordHash) {
        EC_Login EC_LoginObj = new EC_Login();
		return EC_LoginObj.login(username, passwordHash);
	}

}