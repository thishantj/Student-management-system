package itp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prabh
 */
public class Attendance {
    private String studentID;
    private String name;
   

    public Attendance(String studentID, String name ) {
        this.studentID = studentID;
        this.name = name;
   
        
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

    public void setName(String date) {
        this.name = name;
    }
    
    
    
}
