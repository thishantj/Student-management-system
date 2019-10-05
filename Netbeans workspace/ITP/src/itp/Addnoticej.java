/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp;

/**
 *
 * @author Madawa
 */
public class Addnoticej {
    
    String subject;
    String name;
    String details;
    String email;
    String date;

    public Addnoticej(String subject, String name, String details, String email, String date) {
        this.subject = subject;
        this.name = name;
        this.details = details;
        this.email = email;
        this.date = date;
    }

    public String getSubject() {
        return subject;
    }

    public String getName() {
        return name;
    }

    public String getDetails() {
        return details;
    }

    public String getEmail() {
        return email;
    }

    public String getDate() {
        return date;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
    
    
    
    
    
    
}
