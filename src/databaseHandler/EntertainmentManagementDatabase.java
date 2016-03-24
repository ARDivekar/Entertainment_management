package databaseHandler;

import java.sql.Date;

import dbDataTypes.*;

public class EntertainmentManagementDatabase extends SQLiteDatabaseHandler implements EntertainmentManagementDatabaseTableDefinitions {
	
	private static EntertainmentManagementDatabase singleton=null;
	private EntertainmentManagementDatabase(String databaseFileName){
		super(databaseFileName);	
	}
	
	
	public static EntertainmentManagementDatabase getDB(){
		if(singleton==null){
			singleton = new EntertainmentManagementDatabase("./EntertainmentManagement.db");
		}
		return singleton;
	}
	
	
	public static EntertainmentManagementDatabase getDB(String databaseFileName){
		singleton = new EntertainmentManagementDatabase(databaseFileName);
		return singleton;
	}
	
	public void resetDB(){ 
		/*
		 To be used if the connection is giving problems.
		 Usage:
		 	- <...Connection problems detected...>
		 	- dbObject.resetDB();
		 	- dbObject = dbObject.getDB(); 
		 */ 
		if(getDatabaseFileName()=="")	//revert to the default database name.
			singleton = new EntertainmentManagementDatabase("./EntertainmentManagement.db");
		else 
			singleton = new EntertainmentManagementDatabase(getDatabaseFileName()); 
	}
	
	
	public void resetDB(String databaseFileName){
		//used to change the connection to a new Database file.
		singleton = new EntertainmentManagementDatabase(databaseFileName);
	}
	
	
	public boolean init(){
		//initializes the database, including checking if the database is there, etc.
		String errors="";
		
		if(!tryCreateTable(userTableDefinition, false))
			errors+="\n\tERROR in EntertainmentManagementDatabase.init(): Unable to create or locate 'User' table in database.";
	
		
		if(!errors.equals("")){
			System.out.println(errors);
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
