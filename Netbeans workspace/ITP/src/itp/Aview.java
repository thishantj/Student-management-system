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
class Aview {
 
    
    private String EID, Name, DOB, sex, Marital_Status, Address, Tel, Email, Profession;

    public Aview(String EID, String Name, String DOB, String sex, String Marital_Status, String Address, String Tel, String Email, String Profession) {
        this.EID = EID;
        this.Name = Name;
        this.DOB = DOB;
        this.sex = sex;
        this.Marital_Status = Marital_Status;
        this.Address = Address;
        this.Tel = Tel;
        this.Email = Email;
        this.Profession = Profession;
    }

    public String getEID() {
        return EID;
    }

    public String getName() {
        return Name;
    }

    public String getDOB() {
        return DOB;
    }

    public String getSex() {
        return sex;
    }

    public String getMarital_Status() {
        return Marital_Status;
    }

    public String getAddress() {
        return Address;
    }

    public String getTel() {
        return Tel;
    }

    public String getEmail() {
        return Email;
    }

    public String getProfession() {
        return Profession;
    }
    
    
}
   