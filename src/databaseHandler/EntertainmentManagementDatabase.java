package databaseHandler;

import java.sql.Date;

import dbDataTypes.*;


public class EntertainmentManagementDatabase extends SQLiteDatabaseHandler {
	public static final String projectBasePathFolder = "F:/Workspaces/Java/Projects/Entertainment_mgmt/";
    
	private static EntertainmentManagementDatabase singleton=null;
    
	private EntertainmentManagementDatabase(){
        //default
        super("F:/Workspaces/Java/Projects/Entertainment_mgmt/EntertainmentManagement.db");	
	}
	
	
	public static EntertainmentManagementDatabase getInstance(){
		if(singleton==null){
			singleton = new EntertainmentManagementDatabase();
		}
		return singleton;
	}
    
    public void resetDB(){ 
		/*
		 To be used if the connection is giving problems.
		 Usage:
		 	- <...Connection problems detected...>
		 	- dbObject.resetDB();
		 	- dbObject = dbObject.getInstance(); 
		 */ 
		singleton = new EntertainmentManagementDatabase();
	}
    
    private EntertainmentManagementDatabase(String databaseFilePath){
        super(databaseFilePath);
    }
    
    public static EntertainmentManagementDatabase getInstance(String databaseFilePath){
		if(singleton==null){
			singleton = new EntertainmentManagementDatabase(databaseFilePath);
		}
		return singleton;
	}
	
	
	
	public void resetDB(String databaseFilePath){ 
		/*
		 To be used if the connection is giving problems.
		 Usage:
		 	- <...Connection problems detected...>
		 	- dbObject.resetDB("EntMgmt.db");
		 	- dbObject = dbObject.getInstance(); 
		 */ 
		singleton = new EntertainmentManagementDatabase(databaseFilePath);
	}
	
	
	public boolean init(){
		//initializes the database, including checking if the database is there, etc.
        
        //Note: in SQLite, putting something as INTEGER PRIMARY KEY makes it auto-increment; don't add UserID in any values list.
        //final String enableForeignKeys = "PRAGMA foreign_keys = ON;";
        
        final String userTableDefinition= "User (\n" +
        "	username 	TEXT PRIMARY KEY	,\n" +
        "	emailID 	TEXT	,\n" +
        "	firstName 	TEXT	,\n" +
        "	lastName	TEXT	,\n" +
        "	DOB			INTEGER	,\n" +
        "	gender		TEXT CHECK(gender in ('M', 'F')) DEFAULT NULL	\n" +
        ");";
        
        
        final String loginTableDefinition= "Login(\n" +
        "	username 		PRIMARY KEY,\n" +
        "	passwordHash 	TEXT\n" +
        ");";
        
        
        final String listingTableDefinition= "Listing(\n" +
        "	listingID		INTEGER	,\n" +
        "	listingType 	TEXT CHECK( listingType in ('MOVIE', 'MUSIC', 'TVSHOW', 'BOOK'))	,\n" +
        "	ratingOutOf10 	REAL	,\n" +
        "	numberOfRatings	INTEGER\n" +
        ");";
        
        
        final String musicTableDefinition= "Music(\n" +
        "	listingID			INTEGER PRIMARY KEY,\n" +
        "	name 				TEXT	,\n" +
        "	artistList			TEXT	,\n" +
        "	albumName			TEXT	,\n" +
        "	indexInAlbum		INTEGER	,\n" +
        "	songLengthMinutes	INTEGER	,\n" +
        "	songLengthSeconds 	INTEGER	,\n" +
        "	genreList			TEXT	,\n" +
        "	releaseDate			INTEGER	,\n" +
        "	copyright			TEXT	,\n" +
        "	foreign key(listingID) references Listing(listingID)\n" +
        ");";
        
        
        final String movieTableDefinition= "Movie(\n" +
		"	listingID				INTEGER PRIMARY KEY,\n" +
		"	name 					TEXT	,\n" +
		"	releaseDate				INTEGER	,\n" +
		"	budget					INTEGER	,\n" +
		"	contentRating			TEXT	,\n" +
		"	castList				TEXT	,\n" +
		"	productionCompanyList	TEXT	,\n" +
		"	inColor					TEXT CHECK( inColor in ('TRUE','FALSE'))	,\n" +
		"	runtime					INTEGER	,\n" +
		"	languages				TEXT	,\n" +
		"	storyline				TEXT	,\n" +
		"	genreList				TEXT	,\n" +
		"	trivia					TEXT	,\n" +
		"	goofs					TEXT	,\n" +
		"	foreign key(listingID) references Listing(listingID)\n" +
		");";
        
        
        final String tvshowTableDefinition= "TVShow(\n" +
		"	listingID				INTEGER PRIMARY KEY,\n" +
		"	name					TEXT	,\n" +
		"	creatorNameList			TEXT	,\n" +
		"	releaseDate				INTEGER	,\n" +
		"	startDate				INTEGER	,\n" +
		"	genreList				TEXT	,\n" +
		"	castList				TEXT	,\n" +
		"	storyline				TEXT	,\n" +
		"	certifications			TEXT	,\n" +
		"	languages				TEXT	,\n" +
		"	runtimePerEpisode		INTEGER	,\n" +
		"	numberOfSeasons			INTEGER	,\n" +
		"	productionCompanyList	TEXT	,\n" +
		"	inColor					TEXT CHECK( inColor in ('TRUE','FALSE'))	,\n" +
		"	trivia					TEXT	,\n" +
		"	goofs					TEXT	,\n" +
		"	foreign key(listingID) references Listing(listingID)\n" +
		");";
     
        
        final String bookTableDefinition= "Book(\n" +
		"	listingID		INTEGER PRIMARY KEY ,\n" +
		"	name			TEXT	,\n" +
		"	genreList		TEXT	,\n" +
		"	publishedDate	INTEGER	,	\n" +
		"	publisherName	TEXT	,	\n" +
		"	seller			TEXT	,\n" +
		"	numberOfPages	INTEGER	,	\n" +
		"	description		TEXT	,\n" +
		"	languageList	TEXT	,	\n" +
		"	author			TEXT	,\n" +
		"	foreign key(listingID) references Listing(listingID)\n" +
		");";
        
        final String eventTableDefinition= "Event(\n" +
		"	eventID						INTEGER PRIMARY KEY	,\n" +
		"	name 						TEXT	,\n" +
		"	ratingOutOf10 				REAL	,\n" +
		"	numberOfRatings				INTEGER	,\n" +
		"	category					TEXT	,	\n" +
		"	venue						TEXT	,\n" +
		"	fromDateTime				INTEGER	,\n" +
		"	description					TEXT	,	\n" +
		"	pricesList					TEXT	,	\n" +
		"	termsAndConditions			TEXT	,\n" +
		"	UNIQUE(name, fromDateTime)				\n" +
		");";
        
        
        final String userCollectionTableDefinition= "UserCollection(\n" +
		"	username 		TEXT	,\n" +
		"	listingID		INTEGER	,\n" +
		"	ownership		TEXT CHECK( ownership in ('OWNED','WISHLISTED') )	,\n" +
		"	userRatingOutOf10	REAL	,\n" +
		"	userReviewText		TEXT 	,\n" +
		"	foreign key(username) references User(username)			,\n" +
		"	foreign key(listingID) references Listing(listingID)	,\n" +
		"	UNIQUE(username, listingID)\n" +
		");";
        
        
        final String userCalendarTableDefinition= "UserCalendar(\n" +
		"	username 			TEXT	,\n" +
		"	eventID				INTEGER	,\n" +
		"	ownership			TEXT CHECK( ownership in ('OWNED','WISHLISTED') )	,\n" +
		"	foreign key(username) references User(username)			,\n" +
		"	foreign key(eventID) references Event(eventID)	,\n" +
		"	UNIQUE(username, eventID)\n" +
		");";
        
        
        final String userEventsListTableDefinition= "UserEventsList(\n" +
		"	username 			TEXT	,\n" +
		"	eventID				INTEGER	,\n" +
		"	ownership			TEXT CHECK( ownership in ('OWNED','WISHLISTED') )	,\n" +
		"	foreign key(username) references User(username)			,\n" +
		"	foreign key(eventID) references Event(eventID)	,\n" +
		"	UNIQUE(username, eventID)\n" +
		");";
        
        
        
        
        
		String errors="";
        String errorTemplate = "\n\tERROR in "+this.getClass().getSimpleName()+".init(): Unable to create or locate '%s' table in database.";
		
		if(!tryCreateTable(userTableDefinition, false))
			errors+= String.format(errorTemplate, "User") ;

		if(!tryCreateTable(loginTableDefinition, false))
			errors+= String.format(errorTemplate, "Login") ;

		if(!tryCreateTable(listingTableDefinition, false))
			errors+= String.format(errorTemplate, "Listing") ;

		if(!tryCreateTable(musicTableDefinition, false))
			errors+= String.format(errorTemplate, "Music") ;

		if(!tryCreateTable(movieTableDefinition, false))
			errors+= String.format(errorTemplate, "Movie") ;

		if(!tryCreateTable(tvshowTableDefinition, false))
			errors+= String.format(errorTemplate, "TVShow") ;

		if(!tryCreateTable(bookTableDefinition, false))
			errors+= String.format(errorTemplate, "Book") ;

		if(!tryCreateTable(eventTableDefinition, false))
			errors+= String.format(errorTemplate, "Event") ;

		if(!tryCreateTable(userCollectionTableDefinition, false))
			errors+= String.format(errorTemplate, "UserCollection") ;

		if(!tryCreateTable(userCalendarTableDefinition, false))
			errors+= String.format(errorTemplate, "UserCalendar") ;

		if(!tryCreateTable(userEventsListTableDefinition, false))
			errors+= String.format(errorTemplate, "UserEventsList") ;

		
		if(!errors.equals("")){
            System.out.println("\n\n"+errors+"\n\n");
			return false;
		}
		
		return true;
	}
	
	
    
    
    
	public boolean isConnected(){
		if(super.isConnected() && singleton!=null)
			return true;
		return false;
	}
	
	
	
	
	public void lol(){
//		//tester function.
//		String[] tablenames = listTablesNames();
//		System.out.println("Number of tables in database: "+tablenames.length);
//		for(int i=0; i<tablenames.length; i++)
//			System.out.println(tablenames[i]);
		String dateString="2016-2-23";
		Date d = new Date(0);
		
		for(int i=0; i<10; i++){
			d=convertStringToDate(dateString);
			System.out.println(d.toLocalDate());
			dateString=convertDateToString(d);
			System.out.println(dateString);
		}
	}
	
}
