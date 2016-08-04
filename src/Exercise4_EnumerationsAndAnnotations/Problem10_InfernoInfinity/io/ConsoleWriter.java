package Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.io;

import Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.interfaces.OutputWriter;

import java.io.PrintWriter;

/**
 * Created by bludya on 8/3/16.
 * All rights reserved!
 */
public class ConsoleWriter implements OutputWriter {
    PrintWriter writer;

    public ConsoleWriter() {
        this.setWriter(new PrintWriter(System.out));
    }

    private void setWriter(PrintWriter writer) {
        this.writer = writer;
    }

    @Override
    public void write(String output) {
        this.writer.print(output);
        this.writer.flush();
    }

    @Override
    public void writeLine(String output) {
        this.writer.println(output);
        this.writer.flush();
    }
}
