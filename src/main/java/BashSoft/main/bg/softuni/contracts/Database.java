package BashSoft.main.bg.softuni.contracts;

import java.io.IOException;

/**
 * Created by bludya on 7/16/16.
 * All rights reserved!
 */
public interface Database extends FilteredTaker, OrderedTaker, Requester {
    void loadData(String fileName) throws IOException;

    void unloadData();
}
