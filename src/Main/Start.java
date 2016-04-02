package Main;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import databaseHandler.EntertainmentManagementDatabase;

import java.sql.*;
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;

public class Start {
	/* Tasks:
	 * - Set up the server connection / check its connection
	 * - Check the database exists, or else make a new database.
	 * - Print corresponding statistics to terminal.
	 * - Get updates for movies, TV shows, etc.
	 *  
	*/
	

	
	
	public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
//		Document doc = Jsoup.connect("http://google.com").get();
//		System.out.println(doc.html());
		String line="Person("
				+ "KAHKLHA"
				+ "sas"
				+ ");";
		String pattern="([a-zA-Z0-9]+)[ ]*[(](.*\n*)*[)];";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(line);
		if(m.find()){
			System.out.println("lol"+m.group(1)+"LOL");
		}
//		else System.out.println("Not found");
		 
		EntertainmentManagementDatabase db = EntertainmentManagementDatabase.getInstance();
		System.out.println("Connected to database: "+ db.isConnected());
		System.out.println("Initialized database: " + db.init());
		
//		Start that=new Start();
		Date d= new Date(0);
		Time t=new Time(0);
		System.out.println(t.toString());
		
	}
	
}

