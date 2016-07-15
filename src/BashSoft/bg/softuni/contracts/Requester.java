package BashSoft.bg.softuni.contracts;

/**
 * Created by bludya on 7/16/16.
 * All rights reserved!
 */
public interface Requester {
    void getStudentMarkInCourse(String courseName, String studentName);

    void getStudentsByCourse(String courseName);
}

