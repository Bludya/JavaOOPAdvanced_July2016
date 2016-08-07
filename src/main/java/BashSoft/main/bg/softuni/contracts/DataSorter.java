package BashSoft.main.bg.softuni.contracts;

import java.util.HashMap;

/**
 * Created by bludya on 7/16/16.
 * All rights reserved!
 */
public interface DataSorter {
    void printSortedStudents(
            HashMap<String, Double> courseData,
            String comparisonType,
            int numberOfStudents);
}
