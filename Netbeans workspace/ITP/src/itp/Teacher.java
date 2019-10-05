package itp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHARUKH
 */
public class Teacher {
     private String Name , Id;
    private int Days , Timein , TimeOut , FullDay,HalfDay,ShortLeaves,AnnualLeaves,CasualLeaves,dutyLeaves;
  

public Teacher(String Name , String Id ,int Days , int Timein , int TimeOut ,int FullDay ,int HalfDay ,int ShortLeaves, int AnnualLeaves, int CasualLeaves,int dutyLeaves )
{
        this.Name = Name;
        this.Id = Id;
        this.Days = Days;
        this.Timein = Timein;
        this.TimeOut = TimeOut;
        this.FullDay = FullDay;
        this.HalfDay = HalfDay;
        this.ShortLeaves = ShortLeaves;
        this.AnnualLeaves = AnnualLeaves;
        this.CasualLeaves = CasualLeaves;
        this.dutyLeaves = dutyLeaves;
      }
    


    public String getName() {
        return Name;
    }

    public String getId() {
        return Id;
    }

    public int getDays() {
        return Days;
    }

    public int getTimein() {
        return Timein;
    }

    public int getTimeOut() {
        return TimeOut;
    }

    public int getFullDay() {
        return FullDay;
    }

    public int getHalfDay() {
        return HalfDay;
    }

    public int getShortLeaves() {
        return ShortLeaves;
    }

    public int getAnnualLeaves() {
        return AnnualLeaves;
    }

    public int getCasualLeaves() {
        return CasualLeaves;
    }

    public int getDutyLeaves() {
        return dutyLeaves;
    }

    
    
    
     public void setName(String Name) {
        this.Name = Name;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    
    public void setDays(int Days) {
        this.Days = Days;
    }

    public void setTimein(int Timein) {
        this.Timein = Timein;
    }

    public void setTimeOut(int TimeOut) {
        this.TimeOut = TimeOut;
    }

    public void setFullDay(int FullDay) {
        this.FullDay = FullDay;
    }

    public void setHalfDay(int HalfDay) {
        this.HalfDay = HalfDay;
    }

    public void setShortLeaves(int ShortLeaves) {
        this.ShortLeaves = ShortLeaves;
    }

    public void setAnnualLeaves(int AnnualLeaves) {
        this.AnnualLeaves = AnnualLeaves;
    }

    public void setCasualLeaves(int CasualLeaves) {
        this.CasualLeaves = CasualLeaves;
    }

    public void setDutyLeaves(int dutyLeaves) {
        this.dutyLeaves = dutyLeaves;
    }

   
    


















}