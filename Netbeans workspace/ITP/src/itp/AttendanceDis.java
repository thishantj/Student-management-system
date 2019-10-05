package itp;


import java.sql.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class AttendanceDis {
    private String studentID, name, present_absent;
    private Date date;

    public AttendanceDis(Date date, String studentID, String name, String present_absent) {
        this.date = date;
        this.studentID = studentID;
        this.name = name;
        this.present_absent = present_absent;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPresent_absent() {
        return present_absent;
    }

    public void setPresent_absent(String present_absent) {
        this.present_absent = present_absent;
    }
    
    
    
}
