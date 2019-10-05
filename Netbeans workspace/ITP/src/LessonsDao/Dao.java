/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LessonsDao;

/**
 *
 * @author Asel Peiris
 * @param <Lesson>
 */
public interface Dao<Lesson> {
    int addLesson(Lesson lesson);
    int deleteLesson(String subjectName);
    Lesson getLessonById(int subjectId);
    int updateLessonByName(int subjectId, String subjectName, int subjectCredits, int maxMarks);
    Lesson getLessonByName(String subjectName);
}
