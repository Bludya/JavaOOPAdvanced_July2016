package BashSoft.bg.softuni.contracts;

import BashSoft.bg.softuni.dataStructures.SimpleSortedList;

import java.util.Comparator;

/**
 * Created by bludya on 7/16/16.
 * All rights reserved!
 */
public interface Requester {
    void getStudentMarkInCourse(String courseName, String studentName);

    void getStudentsByCourse(String courseName);

    SimpleSortedList<Course> getAllCoursesSorted(Comparator<Course> cmp);

    SimpleSortedList<Student> getAllStudentsSorted(Comparator<Student> cmp);
}

