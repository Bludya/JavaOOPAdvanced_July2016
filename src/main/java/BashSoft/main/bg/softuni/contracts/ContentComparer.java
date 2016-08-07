package BashSoft.main.bg.softuni.contracts;

import java.io.IOException;

/**
 * Created by bludya on 7/16/16.
 * All rights reserved!
 */
public interface ContentComparer {
    void compareContent(
            String actualOutput,
            String expectedOutput) throws IOException;
}
