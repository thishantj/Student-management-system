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
public class TPayroll {

private int Year;
private String Name , Id ,Ordinary , Advanced,Diploma,Language,Others ;


    public TPayroll(String Name, String Id ,int Year, String Ordinary, String Advanced, String Diploma, String Languages, String Others) {
        this.Year = Year;
        this.Name = Name;
        this.Id = Id;
        this.Ordinary = Ordinary;
        this.Advanced = Advanced;
        this.Diploma = Diploma;
        this.Language = Languages;
        this.Others = Others;
    }

    public String getName() {
        return Name;
    }

    public String getId() {
        return Id;
    }

    public String getOrdinary() {
        return Ordinary;
    }

    public String getAdvanced() {
        return Advanced;
    }

    public String getDiploma() {
        return Diploma;
    }

    public String getLanguage() {
        return Language;
    }

    public String getOthers() {
        return Others;
    }

    public int getYear() {
        return Year;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public void setOrdinary(String Ordinary) {
        this.Ordinary = Ordinary;
    }

    public void setAdvanced(String Advanced) {
        this.Advanced = Advanced;
    }

    public void setDiploma(String Diploma) {
        this.Diploma = Diploma;
    }

    public void setLanguage(String Languages) {
        this.Language = Languages;
    }

    public void setOthers(String Others) {
        this.Others = Others;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

}
