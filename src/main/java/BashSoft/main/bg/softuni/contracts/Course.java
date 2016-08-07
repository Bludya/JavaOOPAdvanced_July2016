package BashSoft.main.bg.softuni.contracts;

import java.util.Map;

/**
 * Created by bludya on 7/16/16.
 * All rights reserved!
 */
public interface Course extends Comparable<Course> {
    String getName();

    Map<String, Student> getStudentsByName();

    void enrollStudent(Student student);
}
