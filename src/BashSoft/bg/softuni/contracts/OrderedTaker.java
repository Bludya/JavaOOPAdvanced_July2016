package BashSoft.bg.softuni.contracts;

/**
 * Created by bludya on 7/16/16.
 * All rights reserved!
 */
public interface OrderedTaker{
    void orderAndTake(String courseName, String orderType, int studentsToTake);

    void orderAndTake(String courseName, String orderType);
}
