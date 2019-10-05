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
public class nonstaffAttDis {
    private String date, empIDD, time_in, time_out,leave;

    public nonstaffAttDis(String date, String empIDD, String time_in, String time_out, String leave) {
        this.date = date;
        this.empIDD = empIDD;
        this.time_in = time_in;
        this.time_out = time_out;
        this.leave = leave;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmpIDD() {
        return empIDD;
    }

    public void setEmpIDD(String empIDD) {
        this.empIDD = empIDD;
    }

    public String getTime_in() {
        return time_in;
    }

    public void setTime_in(String time_in) {
        this.time_in = time_in;
    }

    public String getTime_out() {
        return time_out;
    }

    public void setTime_out(String time_out) {
        this.time_out = time_out;
    }

    public String getLeave() {
        return leave;
    }

    public void setLeave(String leave) {
        this.leave = leave;
    }
    
    
    
}
