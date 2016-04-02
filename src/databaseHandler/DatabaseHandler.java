package databaseHandler;

import java.sql.Connection;
import java.sql.Date;
//import java.util.Date; <-DO NOT IMPORT.
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

enum DatabaseType{
	MySQL, SQLite, Oracle, MicrosoftServer
}


public abstract class DatabaseHandler{
	protected String databaseFilePath ="";
	protected Connection conn = null;
	protected Statement stmt = null;
    
    //Abstract functions:
    protected abstract Connection connectToDatabase(String databaseFilePath) throws SQLException;
    protected abstract boolean init();
    
    //Constructor:
    protected DatabaseHandler(String databaseFilePath){
        this.databaseFilePath = databaseFilePath;
		this.conn=null;
		this.stmt=null;
        
    }

    
    protected String getDatabaseFilePath() {
		return databaseFilePath;
    }
    
    
	public boolean isConnected(){
		if(conn==null || stmt==null)
			return false;
		return true;
	}
    
	
    public boolean close(){
        try{
            conn.close();
            conn=null;
            return true;
        }
        catch(SQLException e){
            e.printStackTrace();
			System.out.println("\n\tERROR in "+this.getClass().getSimpleName()+".close() : Cannot close connection.");
        }
        return false;
    }
    
    
    
    
    
    
    
    
    
    
    
	public boolean tryCreateTable(String tableDefinition, boolean overwrite){
		String tablename="";
		String pattern="([a-zA-Z0-9]+)[ ]*[(](.*\n*)*[)];";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(tableDefinition);
		if(m.find()){
			tablename=m.group(1);
		}
		else 
			return false;
		
		if(overwrite)
			trySQLModifyQueryExecute("DROP TABLE IF EXISTS "+tablename+";");
			
		//Try to create new table.
		String tableCreationQuery = "CREATE TABLE IF NOT EXISTS "+tableDefinition+";";
		//System.out.println(tableCreationQuery);
		trySQLModifyQueryExecute(tableCreationQuery);
			
		
		String[] tablenames = this.listTablesNames();
//		System.out.println("Number of tables in database: "+tablenames.length);
//		for(int i=0; i<tablenames.length; i++)
//			System.out.println(tablenames[i]);
//		
		if(tablenames==null){
			System.out.println("\n\tERROR in "+this.getClass().getSimpleName()+".tryCreateTable(): cannot get tablenames in database.");
			return false;
		}
		for(int i=0; i<tablenames.length; i++){
			if(tablenames[i].equals(tablename))
				return true;
		}
		System.out.println("\n\tERROR in "+this.getClass().getSimpleName()+".tryCreateTable(): no table '"+tablename+"' in database has been created.");
		return false;
//		return true;
	}
	
	
	
	public String[] listTablesNames(){				
		ResultSet tablesList = trySQLSelectQueryExecute("SELECT * FROM sqlite_master WHERE type='table';");
		if(tablesList==null){
			System.out.println("\n\tERROR in "+this.getClass().getSimpleName()+".listTablesNames() : cannot query database.");
			return null;
		}
		ArrayList<String> tablenamesArrayList = new ArrayList<String>();
		try {
			while(tablesList.next()){
				tablenamesArrayList.add(tablesList.getString("name"));
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("\n\tERROR in "+this.getClass().getSimpleName()+".listTablesNames() : tablename list is empty.");
			return null;
		}
		
		//convert tablenamesArrayList i.e. an ArrayList<String> to an array of Strings: 
		//Source: http://viralpatel.net/blogs/convert-arraylist-to-arrays-in-java/ 
		String[] tablenames = tablenamesArrayList.toArray(new String[tablenamesArrayList.size()]);
		if(tablenames==null)
			System.out.println("\n\tERROR in "+this.getClass().getSimpleName()+".listTablesNames() : error in converting ArrayList<String> to String[].");
		return tablenames;
	}
	
    
    
	

	public static String convertDateToString(java.sql.Date date){	//uses java.sql.Date
		// returns a String of the form: "2016-02-23"
		return date.toLocalDate().toString();	//do NOT import java.util.Date for this.
	}
	
	public static Date convertStringToDate(String date){	//uses java.sql.Date
		date=date.trim();
		String[] dateParts= date.split("-");
		if(dateParts.length!=3){
			System.out.println("\n\tERROR in DatabaseHandler.convertStringToDate() : "+date+" is not a valid date-String. \"2016-02-23\" is valid.");
			return null;
		}
		
		Date dateDate = new Date(0); 
		try{
			dateDate.setYear(Integer.parseInt(dateParts[0]) - 1900);
			dateDate.setMonth(Integer.parseInt(dateParts[1]) -1 );
			dateDate.setDate(Integer.parseInt(dateParts[2]));
		}
		catch(NumberFormatException e){
			System.out.println("\n\tERROR in DatabaseHandler.convertStringToDate() : "+date+" is not a valid date-String. \"2016-02-23\" is valid.");
			dateDate = null;
		}
		return dateDate;
		
			
	}
	
	public static String convertTimeToString(Time time){	//uses java.sql.Time
		return time.toString();
	}
	
	public static Time convertStringToTime(String time){	//uses java.sql.Time
		time=time.trim();
		String[] timeParts= time.split(":");
		if(timeParts.length!=3){
			System.out.println("\n\tERROR in DatabaseHandler.convertStringToTime() : "+time+" is not a valid time-String. \"05:30:59\" is valid.");
			return null;
		}
		
		Time timeTime=new Time(0); 
		try{
			timeTime.setHours(Integer.parseInt(timeParts[0]));
			timeTime.setMinutes(Integer.parseInt(timeParts[1]));
			timeTime.setSeconds(Integer.parseInt(timeParts[2]));
		}
		catch(NumberFormatException e){
			System.out.println("\n\tERROR in DatabaseHandler.convertStringToTime() : "+time+" is not a valid time-String. \"05:30:59\" is valid.");
			timeTime = null;
		}
		return timeTime;
		
	}
	
    
    

	
	public ResultSet trySelect(String tablename, String[] fieldsList, String whereClauses, String groupByClauses, String orderByClauses){
		int i;
		if(checkForSQLInjection(tablename) || checkForSQLInjection(whereClauses) || checkForSQLInjection(groupByClauses) || checkForSQLInjection(orderByClauses)){
			System.out.println("\n\tERROR in "+this.getClass().getSimpleName()+".trySelect() : no SQL injection allowed.");
			return null;
		}
		
		if(whereClauses==null)
			whereClauses="";
		if(groupByClauses==null)
			groupByClauses="";
		
		String selectQuery = "SELECT ";
		
		//fields
		selectQuery+=fieldsList[0];
		for(i=1;i<fieldsList.length;i++){
			selectQuery+=", "+ fieldsList[i];
			if(checkForSQLInjection(fieldsList[i])){
				System.out.println("\n\tERROR in "+this.getClass().getSimpleName()+".trySelect() : no SQL injection allowed.");
				return null;
			}
		}
		selectQuery+=" FROM "+tablename;
		if(!whereClauses.equals(""))
			selectQuery+=" WHERE "+whereClauses;
		if(!groupByClauses.equals(""))
			selectQuery+=" GROUP BY "+groupByClauses;
		if(!orderByClauses.equals(""))
			selectQuery+=" ORDER BY "+orderByClauses;
		selectQuery+=";";
		return trySQLSelectQueryExecute(selectQuery);
	}
	
	
	public ResultSet tryArbitrarySelect(String selectQuery){
        //You can enter any select query.
		if(checkForSQInjectionModification(selectQuery)){
			System.out.println("\n\tERROR in "+this.getClass().getSimpleName()+".tryArbitrarySelect() : no SQL injection (DELETE, UPDATE, INSERT) allowed.");
			return null;
		}
		return trySQLSelectQueryExecute(selectQuery);
	}
	
	
	public boolean tryInsert(String tablename, String[] fieldsList, String[][] dataList){
		/*
			Example usage:
				String[] fields={"UserName","Email","FirstName","LastName"};
				String [][]data = new String[3][4];
				
				a[0][0]="ardivekar"; a[0][1]="ardivekar@gmail.com";  a[0][3]="Divekar";
				a[1][0]="shree"; a[1][1]="shreek95@gmail.com"; a[1][2]="Shreeshaa"; a[1][3]="Kulkarni";
				a[2][0]="advik"; a[2][1]="advik95@gmail.com"; a[2][2]="Advik"; a[2][3]="Shetty";
				
				tryInsert("User",fields,data);
				
			NOTICE: row 1 is missing some values. This will luckily be converted to "null" by default.
			
			
			OUTPUT:
				INSERT INTO User
				(UserName, Email, FirstName, LastName)
				VALUES
				(ardivekar, ardivekar@gmail.com, null, Divekar),
				(shree, shreek95@gmail.com, Shreeshaa, Kulkarni),
				(advik, advik95@gmail.com, Advik, Shetty);
		*/
		
		if(fieldsList.length != dataList[0].length){
            System.out.println("\n\tERROR in "+this.getClass().getSimpleName()+".tryInsert() : the fieldList length does not match the dataList length.");
			return false;	//even if the entire column is NULL, the values should be there.
        }
		
		String insertQuery="INSERT INTO "+tablename+"\n(";
		int i,j;
		
		//fields
		insertQuery+=fieldsList[0];
		for(i=1;i<fieldsList.length;i++)
			insertQuery+=", "+ fieldsList[i];
		insertQuery+=")\nVALUES\n";
		
		//data values.
		for(i=0; i<dataList.length; i++){
			if(i==0)
				insertQuery+="(";
			else insertQuery+=",\n(";
			
			for(j=0; j<dataList[i].length; j++){
				if(dataList[i][j].equals(""))
					dataList[i][j]="NULL";
                
                else if(!dataList[i][j].startsWith("strftime") && !dataList[i][j].startsWith("time") && !dataList[i][j].startsWith("date") && !dataList[i][j].startsWith("datetime")){
                    //for items such as strftime('%s', '3895-09-09'), we shouldn't surround it with anything.
                        
                    try{//for numeric values, we must not surround with quotes.
                        dataList[i][j]=""+Double.parseDouble(dataList[i][j]);	
                    }catch(NumberFormatException e){
                        //for strings, we must surround with quotes.
                        dataList[i][j]="'"+dataList[i][j]+"'";	
                    }
				}
				
				if(j==0)
					insertQuery+=dataList[i][j];
				else insertQuery+=", "+dataList[i][j];
			}	
			insertQuery+=")";	//closing bracket to list of data items.
		}
		insertQuery+=";";
		
		
		if(trySQLModifyQueryExecute(insertQuery)==-1){
            System.out.println("\n\tERROR in "+this.getClass().getSimpleName()+".tryInsert() : could not insert into database.");
            System.out.println("\n\tQuery:\n"+insertQuery+"\n");
			return false;
        }
				
		//System.out.println(insertQuery);
		
		return true;
	}
	
	
	public boolean tryDelete(String tablename, String whereClauses){
		if(checkForSQLInjectionRetrieval(tablename) || checkForSQLInjectionRetrieval(whereClauses)){
			System.out.println("\n\tERROR in "+this.getClass().getSimpleName()+".tryDelete() : no SQL injection allowed.");
			return false;
		}
		
		if(whereClauses==null)
			whereClauses="";
		
		String deleteQuery = "DELETE FROM "+tablename;
		if(!whereClauses.equals(""))
			deleteQuery+=" WHERE "+whereClauses;
		
		deleteQuery+=";";
		if(trySQLModifyQueryExecute(deleteQuery)==-1)
			return false;
		
		return true;
	}
	
    
    
    
    
    
    
    
    //private functions:
    
    
	private int trySQLModifyQueryExecute(String modifyingQuery){ 
		//for CREATE, INSERT, UPDATE, DELETE and DROP queries in SQLite.
		
		if(isConnected()){
			try{
				return stmt.executeUpdate(modifyingQuery);
			}
			catch(SQLException e){
				// if the error message is "out of memory", 
				// it probably means no database file is found
				System.err.println(e.getMessage());
				e.printStackTrace();
				System.out.println("\n\tERROR in "+this.getClass().getSimpleName()+".trySQLModifyQueryExecute() : cannot modify database. "
						+ "\n\tNote: if this says 'out of memory', then the database file is not found.");
                System.out.println("\n\n\tQuery:\n"+modifyingQuery);
			}
		}
		return -1;
	}

	private ResultSet trySQLSelectQueryExecute(String selectingQuery){ 
		//for SELECT, DISPLAY etc. queries in SQLite.
		
		if(isConnected()){
			try{
				return stmt.executeQuery(selectingQuery);
			}
			catch(SQLException e){
				// if the error message is "out of memory", 
				// it probably means no database file is found
				System.err.println(e.getMessage());
				System.out.println("Note: if this says 'out of memory', then the database file is not found.");
                System.out.println("\n\n\tQuery:\n"+selectingQuery);
			}
		}
		System.out.println("\n\tERROR in "+this.getClass().getSimpleName()+".trySQLSelectQueryExecute() : not connected to database.");
		
		return null;
	}
	
	
	private boolean checkForSQLInjection(String nonClasueString){
		if(		nonClasueString.toLowerCase().indexOf("select")!=-1 || 
				nonClasueString.toLowerCase().indexOf("delete")!=-1 ||
				nonClasueString.toLowerCase().indexOf("insert")!=-1 ||
				nonClasueString.toLowerCase().indexOf("update")!=-1  
		)return true;
		
		return false;
	}
	
	private boolean checkForSQLInjectionRetrieval(String nonSelectString){
		if(		nonSelectString.toLowerCase().indexOf("select ")!=-1 ||
				nonSelectString.toLowerCase().indexOf(" from ")!=-1 ||
				nonSelectString.toLowerCase().indexOf(" where ")!=-1 ||
				nonSelectString.toLowerCase().indexOf(" group by ")!=-1 ||
				nonSelectString.toLowerCase().indexOf(" order by ")!=-1  
		)return true;
		
		return false;
	}
	
	private boolean checkForSQInjectionModification(String nonModifyString){
		if(	 	nonModifyString.toLowerCase().indexOf("delete ")!=-1 ||
				nonModifyString.toLowerCase().indexOf("insert ")!=-1 ||
				nonModifyString.toLowerCase().indexOf("update ")!=-1
		)return true;
		
		return false;
	}
	
	
}

