/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LessonsDao;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Asel Peiris
 */
public class LessonsDao implements Dao<Lesson> {

    public static Connection getConnection() {
       Connection con = null;
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=tinytot;user=admin;password=123456");
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return con;
    }

    @Override
    public int addLesson(Lesson lesson) {
        int status = 0;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=tinytot;user=admin;password=123456");
            PreparedStatement pst = con.prepareStatement("insert into lessons(subject_name, subject_credit, subject_maxmark) values(?, ?, ?)");

            pst.setString(1, lesson.getSubjectName());
            pst.setInt(2, lesson.getSubjectCredit());
            pst.setInt(3, lesson.getSubjectMaxmark());

            status = pst.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public int deleteLesson(String subjectName) {
        int status = 0;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=tinytot;user=admin;password=123456");
            PreparedStatement pst = con.prepareStatement("delete from lessons where subject_name = "+subjectName);
            //pst.setString(1, subjectName);
            status = pst.executeUpdate();

            con.close();
        } catch (Exception e) {

            e.printStackTrace();
        }

        return status;
    }

    @Override
    public Lesson getLessonById(int subjectId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int updateLessonByName(String subjectName, int subjectCredits, int maxMarks) {
       // Connection con = LessonsDao.getConnection();
        
        int status = 0;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=tinytot;user=admin;password=123456");
            PreparedStatement ps = con.prepareStatement("update lessons set subject_credit = ?, subject_maxmark = ? where subject_name = "+subjectName);
            ps.setInt(1, subjectCredits);
            ps.setInt(2, maxMarks);
            //ps.setInt(3, subjectId);
            
            status = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return status;
    }

    @Override
    public Lesson getLessonByName(String subjectName) {
        //Connection con = LessonsDao.getConnection();
        Lesson lesson = new Lesson();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=tinytot;user=admin;password=123456");
            String sql = "select * from lessons where subject_name = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, subjectName);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
//                lesson.setSubjectId(rs.getInt(1));
                lesson.setSubjectName(rs.getString("subject_name"));
                lesson.setSubjectCredit(rs.getInt("subject_credit"));
                lesson.setSubjectMaxmark(rs.getInt("subject_maxmark"));
            }
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lesson;
    }

    @Override
    public int updateLessonByName(int subjectId, String subjectName, int subjectCredits, int maxMarks) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
