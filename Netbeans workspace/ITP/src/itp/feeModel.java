/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp;

/**
 *
 * @author Dhanushka
 */
public class feeModel {
    private int ID,Fee,PaymentID;
    private String Name,Date;

    public feeModel(int ID, String Name, int PaymentID, String Date, int Fee) {
        this.ID = ID;
        this.PaymentID=PaymentID;
        this.Fee = Fee;
        this.Name = Name;
        this.Date = Date;
    }

    public int getID() {
        return ID;
    }
    
    public int getPaymentID() {
        return PaymentID;
    }

    public int getFee() {
        return Fee;
    }

    public String getName() {
        return Name;
    }

    public String getDate() {
        return Date;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    public void setPaymentID(int PaymentID) {
        this.PaymentID = PaymentID;
    }

    public void setFee(int Fee) {
        this.Fee = Fee;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }
    
     
    
}
