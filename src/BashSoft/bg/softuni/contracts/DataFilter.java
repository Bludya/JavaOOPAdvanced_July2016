package BashSoft.bg.softuni.contracts;

import java.util.HashMap;

/**
 * Created by bludya on 7/16/16.
 * All rights reserved!
 */
public interface DataFilter {
    void printFilteredStudents(
            HashMap<String, Double> studentsWithMarks,
            String filterType,
            Integer numberOfStudents);
}
