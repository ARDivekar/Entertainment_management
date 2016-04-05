package databaseHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.Time;

public abstract class SQLiteDatabaseHandler extends DatabaseHandler{
    protected DatabaseType databaseType=null;
	
	protected SQLiteDatabaseHandler(String databaseFilePath){
        super(databaseFilePath);
		this.databaseType=DatabaseType.SQLite;
        try{
			this.conn = connectToDatabase(databaseFilePath);
			this.stmt = this.conn.createStatement();
	        this.stmt.setQueryTimeout(30);  // set timeout to 30 sec.
	        System.out.println("Successfully set up connection to "+databaseFilePath);
		}
		catch(SQLException e){
	        // if the error message is "out of memory", it probably means no database file is found
			e.printStackTrace();
	        System.err.println(e.getMessage());
	        System.out.println("\n\tERROR in "+this.getClass().getSimpleName()+"."+this.getClass().getSimpleName()+"(): if this says 'out of memory', then the database file is not found.");
        }
	}
	
	protected Connection connectToDatabase(String databaseFilePath) throws SQLException{
		// Source: https://github.com/xerial/sqlite-jdbc
		// create a database connection; creates the DB file also if it does not exist.
        
        try{
             Class.forName("org.sqlite.JDBC");
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
            System.out.println("\t\tCLASS NOT FOUND EXCEPTION "+e.getMessage());
        }
        Connection conn = DriverManager.getConnection("jdbc:sqlite:"+databaseFilePath);
        return conn; 
	}
	
    public static String convertDateToSQLiteDBUNIXEpochString(Date date){
        
        return "strftime('%s', '"+convertDateToString(date)+"')";
    }
    
    public static String convertDateTimeToSQLiteDBUNIXEpochString(Date date, Time time){
        
        return "strftime('%s', '"+convertDateToString(date)+" "+convertTimeToString(time)+"')";
    }
    
    public static String convertDateStringToSQLiteDBUNIXEpochString(String date){
        return "strftime('%s', '"+date+"')";
    }
    
    public  static String convertSelectFieldToSQLiteDBUNIXEpochdDateSelectFieldString(String field){
        //used when the field is saved in the database as a UNIX epoch integer.
        //Use this in function in the SELECT query.
        return "date("+ field +", 'unixepoch') as '"+ field +"'";
    }
    
    public  static String convertSelectFieldToSQLiteDBUNIXEpochdTimeSelectFieldString(String field){
        //used when the field is saved in the database as a UNIX epoch integer.
        //Use this in function in the SELECT query.
        return "time("+ field +", 'unixepoch') as '"+ field +"'";
    }
    
    public  static String convertSelectFieldToSQLiteDBUNIXEpochdDateTimeSelectFieldString(String field){
        //used when the field is saved in the database as a UNIX epoch integer.
        //Use this in function in the SELECT query.
        return "datetime("+ field +", 'unixepoch') as '"+ field +"'";
    }
    
    
    
    

	private void lol(){
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
}