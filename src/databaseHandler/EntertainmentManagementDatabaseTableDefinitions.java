package databaseHandler;

public interface EntertainmentManagementDatabaseTableDefinitions {
	//a data-holding interface.
	
	public final String userTableDefinition = "User("+
	"UserID 		INTEGER PRIMARY KEY,"+  //Note: in SQLite, putting something as 
			//INTEGER PRIMARY KEY makes it auto-increment; don't add UserID in any values list.
	"UserName 	TEXT	UNIQUE ,"+
	"Email		TEXT	UNIQUE ,"+
	"FirstName	TEXT,"+
	"LastName	TEXT,"+
	"Gender		ENUM {M,F},"+
	"DOB		DATE,"+
	"PasswordHash	TEXT"+
	");";
	public final String bookTableDefinition="";
	public final String movieTableDefinition ="";
}
