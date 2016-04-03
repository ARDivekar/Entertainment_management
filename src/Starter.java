/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dataExtractors.DownloadImage;
import databaseHandler.EntertainmentManagementDatabase;
import databaseHandler.*;
import dbDataTypes.*;
import java.io.File;
import java.io.FileInputStream;
//import dbDataTypes.Music;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Abhishek Divekar
 */
public class Starter extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Starter</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Starter at " + request.getContextPath() + "</h1>");
            
            
            
            String line="Person ("
				+ "KAHKLHA"
				+ "sas"
				+ ");";
            String pattern="([a-zA-Z0-9]+)[ ]*[(](.*\n*)*[)];";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(line);
            if(m.find()){
                out.println("Table name: "+m.group(1));
            }
            else{
                out.println("HAHAHAHHAHHAHAHA NOOOOOO");
            }
            
            out.println("<br><br><br>");
            EntertainmentManagementDatabase db = EntertainmentManagementDatabase.getInstance();
            out.println("<h3>Connected to database: "+ db.isConnected()+"</h3>");
            out.println("<br>");
            out.println("<h3>Initialized database: " + db.init()+"</h3>");
            out.println("<br>");
            out.println("<br>");
            out.println("<h3>Tables in database:"+"</h3>");
            for(String tablename : db.listTablesNames()) out.println(tablename+"<br>");
            
            out.println("<br>");
            out.println("<br>");
            
            out.println("<img src=\"/images/logo.png\">"); 
            DownloadImage.download("https://s.yimg.com/nn/fp/rsz/040216/images/smush/pratyusha_635x250_1459573618.jpg", "F:\\Workspaces\\Java\\Projects\\Entertainment_mgmt\\src\\images/yahoo_image.jpg");
            
//            User.writeToDatabase(
//                new User("ARDivekar1234567", "abhishek.r.divekar@gmail.com", "Abhishek", "Divekar", EntertainmentManagementDatabase.convertStringToDate("1995-8-9"), Gender.M, SecurityHash.hashPassword("Hey","MD5")));
            
//            String query = "SELECT User.username as 'username', emailID, firstName, lastName, "+ EntertainmentManagementDatabase.convertSelectFieldToSQLiteDBUNIXEpochdDateSelectFieldString("DOB") +", gender, passwordHash \n" +
//"FROM User join Login on User.username = Login.username;";
//            
////            System.out.println("\n\n"+query);
//            
//            ResultSet usersList = db.tryArbitrarySelect(query);
//            
//              
//            ArrayList<User> users = User.convertFromResultSet(usersList);
//            
            db.close();
            
            
            
            
            
//            Date d= new Date(0);
//            Time t=new Time(0);
//            out.println("<br>"+t.toString());
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
