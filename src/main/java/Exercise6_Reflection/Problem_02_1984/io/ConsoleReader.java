package Exercise6_Reflection.Problem_02_1984.io;

import Exercise6_Reflection.Problem_02_1984.interfaces.InputReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bludya on 8/6/16.
 * All rights reserved!
 */
public class ConsoleReader implements InputReader {
    private BufferedReader reader;

    public ConsoleReader() {
        this.reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in));
    }

    @Override
    public String readLine() throws IOException {
        return this.reader.readLine();
    }
}
