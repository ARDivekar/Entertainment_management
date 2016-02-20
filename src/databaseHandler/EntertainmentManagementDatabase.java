package databaseHandler;

import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Exceptions.ImproperQueryException;

enum DatabaseType{
		MySQL, SQLite, Oracle, MicrosoftServer
}

public class EntertainmentManagementDatabase implements EntertainmentManagementDatabaseTableDefinitions {
	
	private static EntertainmentManagementDatabase singleton=null;
	private DatabaseType databaseType=null;
	private Connection conn=null;
	private Statement stmt = null;
	
	private String databaseFileName ="";
	
	private EntertainmentManagementDatabase(DatabaseType databaseType, String databaseFileName){
		this.databaseType = databaseType;
		this.databaseFileName=databaseFileName;
		this.conn=null;
		this.stmt=null;
		init();
		
	}
	
	public static EntertainmentManagementDatabase getDB(){
		if(singleton==null){
			singleton=new EntertainmentManagementDatabase(DatabaseType.SQLite, "./EntertainmentManagement.db");
		}
		return singleton;
	}
	
	public static EntertainmentManagementDatabase getDB(DatabaseType databaseType, String databaseFileName){
		if(singleton==null){
			singleton=new EntertainmentManagementDatabase(DatabaseType.SQLite, databaseFileName);
		}
		return singleton;
	}
	
	public void resetDB(){
		singleton=new EntertainmentManagementDatabase(DatabaseType.SQLite, databaseFileName);
		
	}
	
	public void resetDB(DatabaseType databaseType, String databaseFileName){
		singleton=new EntertainmentManagementDatabase(databaseType, databaseFileName);
	}
	
	public void lol(){
//		stmt.executeUpdate("drop table if exists person");
//        stmt.executeUpdate("create table person (id integer, name string)");
//        stmt.executeUpdate("insert into person values(1, 'leo')");
//        stmt.executeUpdate("insert into person values(2, 'yui')");
//        ResultSet rs = stmt.executeQuery("select * from person");
//        while(rs.next()){
//          // read the result set
//          System.out.println("name = " + rs.getString("name"));
//          System.out.println("id = " + rs.getInt("id"));
//        }
	}
	
	public boolean isConnected(){
		if(conn==null || stmt==null)
			return false;
		return true;
	}
	
	public boolean init(){
		//initializes the database, including checking if the database is there, etc.
		try{
			conn = connectToDatabase();
			stmt = conn.createStatement();
	        stmt.setQueryTimeout(30);  // set timeout to 30 sec.
		}
		catch(SQLException e){
	        // if the error message is "out of memory", 
	        // it probably means no database file is found
	        System.err.println(e.getMessage());
	        System.out.println("Note: if this says 'out of memory', then the database file is not found.");
		}
		
//		tryCreateTable(userTableDefinition, false);
//		tryCreateTable(movieTableDefinition, false);
		
		return true;
	}
	
	
	private Connection connectToDatabase() throws SQLException{
		// Source: https://github.com/xerial/sqlite-jdbc
		// create a database connection; creates the DB file also if it does not exist.
        Connection conn = DriverManager.getConnection("jdbc:sqlite:"+databaseFileName);
        return conn;
        
	}
	
	private int trySQLModifyQueryExecute(String modifyingQuery){ 
		//for CREATE, INSERT, UPDATE, DELETE and DROP queries.
		
		if(isConnected()){
			try{
				return stmt.executeUpdate(modifyingQuery);
			}
			catch(SQLException e){
				// if the error message is "out of memory", 
				// it probably means no database file is found
				System.err.println(e.getMessage());
				System.out.println("Note: if this says 'out of memory', then the database file is not found.");
			}
		}
		return -1;
	}
	
	
	
	private boolean tryCreateTable(String tableDefinition, boolean overwrite){
		String tablename="";
		String pattern="([a-zA-Z0-9]+)[ ]*[(](.*\n*)*[)];";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(tableDefinition);
		if(m.find()){
			tablename=m.group(1);
		}
		else 
			return false;
		
		if(overwrite){
			if(trySQLModifyQueryExecute("DROP TABLE IF EXISTS "+tablename)==-1)
				return false;
		}
		
		//Try to create new table.
		if(trySQLModifyQueryExecute("CREATE TABLE IF NOT EXISTS "+tableDefinition)==-1)
			return false;
		
		return true;
	}
	
	
	
	
	private ResultSet trySelect(String selectQuery){
		if(isConnected()){
			try{
				return stmt.executeQuery(selectQuery);
			}
			catch(SQLException e){
		        // if the error message is "out of memory", 
		        // it probably means no database file is found
		        System.err.println(e.getMessage());
		        System.out.println("Note: if this says 'out of memory', then the database file is not found.");
		       
			}
		}
		return null;
	}
		
	
	
}
