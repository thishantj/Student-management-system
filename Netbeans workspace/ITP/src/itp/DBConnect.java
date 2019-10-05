/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Lidushan
 */



public class DBConnect {        
        
        public static Connection Connect() throws ClassNotFoundException{
            
            Connection con = null;
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
          String connectionURL= "jdbc:sqlserver://localhost:1433;databaseName=tinytot;user=admin;password=123456";
          
          try{
            con = DriverManager.getConnection(connectionURL);
            System.out.println("Connection success");           
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        
        return con;
        }
    
    
}
