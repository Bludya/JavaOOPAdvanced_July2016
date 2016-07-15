package BashSoft.bg.softuni.contracts;

/**
 * Created by bludya on 7/16/16.
 * All rights reserved!
 */
public interface FilteredTaker {
    void filterAndTake(String courseName, String filter);

    void filterAndTake(String courseName, String filter, int studentsToTake);
}
