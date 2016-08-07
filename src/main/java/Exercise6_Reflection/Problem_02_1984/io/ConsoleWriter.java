package Exercise6_Reflection.Problem_02_1984.io;

import Exercise6_Reflection.Problem_02_1984.interfaces.OutputWriter;

import java.io.PrintWriter;

/**
 * Created by bludya on 8/6/16.
 * All rights reserved!
 */
public class ConsoleWriter implements OutputWriter {
    private PrintWriter writer;

    public ConsoleWriter() {
        this.writer = new PrintWriter(System.out);
    }

    @Override
    public void writeLine(String message) {
        this.writer.println(message);
        this.writer.flush();
    }
}
