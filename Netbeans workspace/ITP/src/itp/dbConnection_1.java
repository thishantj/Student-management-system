/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;


public class dbConnection_1 
{

    public static Connection getConnection()
    {
        Connection conn = null;
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=tinytot;user=admin;password=123456");
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return conn;
    }
}
