package BashSoft.bg.softuni.contracts;

import java.util.Map;

/**
 * Created by bludya on 7/16/16.
 * All rights reserved!
 */
public interface Student extends Comparable<Student> {
    String getUserName();

    Map<String, Course> getEnrolledCourses();

    Map<String, Double> getMarksByCourseName();

    void enrollInCourse(Course softUniCourse);

    void setMarkOnCourse(String courseName, int[] scores);

    String getMarkForCourse(String courseName);
}
