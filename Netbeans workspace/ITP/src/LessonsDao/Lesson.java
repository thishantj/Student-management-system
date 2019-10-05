/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LessonsDao;

/**
 *
 * @author Asel Peiris
 */
public class Lesson {
    private int subjectId;
    private String subjectName;
    private int subjectCredit;
    private int subjectMaxmark;

    public Lesson(){
    }
    
    public Lesson(String subjectName, int subjectCredit, int subjectMaxmark) {
        this.subjectName = subjectName;

        this.subjectCredit = subjectCredit;
        this.subjectMaxmark = subjectMaxmark;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSubjectCredit() {
        return subjectCredit;
    }

    public void setSubjectCredit(int subjectCredit) {
        this.subjectCredit = subjectCredit;
    }

    public int getSubjectMaxmark() {
        return subjectMaxmark;
    }

    public void setSubjectMaxmark(int subjectMaxmark) {
        this.subjectMaxmark = subjectMaxmark;
    }
}
