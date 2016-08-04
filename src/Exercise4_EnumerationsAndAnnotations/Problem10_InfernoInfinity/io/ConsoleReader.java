package Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.io;

import Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.interfaces.InputReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bludya on 8/3/16.
 * All rights reserved!
 */
public class ConsoleReader implements InputReader {
    BufferedReader reader;

    public ConsoleReader() {
        this.setReader(
                new BufferedReader(
                        new InputStreamReader(System.in)));
    }

    private void setReader(BufferedReader reader) {
        this.reader = reader;
    }

    @Override
    public String readLine() throws IOException {
        return this.reader.readLine();
    }
}
