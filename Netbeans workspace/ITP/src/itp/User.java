package itp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
class User {
    
    private String studentID, date,guardianName,nic,contactNo,address,reason ;
    
    public User(String studentID, String date, String guardianName, String nic, String contactNo, String address, String reason) {
        this.studentID = studentID;
        this.date = date;
        this.guardianName = guardianName;
        this.nic = nic;
        this.contactNo = contactNo;
        this.address = address;
        this.reason = reason;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getDate() {
        return date;
    }

    public String getGuardianName() {
        return guardianName;
    }

    public String getNic() {
        return nic;
    }

    public String getContactNo() {
        return contactNo;
    }

    public String getAddress() {
        return address;
    }

    public String getReason() {
        return reason;
    }
    
    
}
