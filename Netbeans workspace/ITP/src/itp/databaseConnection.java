package itp;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 @author*  SHARUKH
 */
public class databaseConnection {
    
    //path for database connectivity
    
    final static String  JDBC_DRIVER = "com.mysql.jdbc.Driver";
    final static String DB_URL  = "jdbc:mysql://localhost:3306/teacher";//awlk have local host connect kare//teacher is the database name
    
    
    final static String  USER = "rooot";
   final static String  PASS = "";
   
   public static Connection connection(){
   
   try{
       Class.forName(JDBC_DRIVER);
       
       Connection conn = DriverManager.getConnection(DB_URL , USER , PASS);
       
       return conn;
   }
   catch(ClassNotFoundException | SQLException e){
   
       JOptionPane.showMessageDialog(null, e);
       return null;
   }
   
   }


}
