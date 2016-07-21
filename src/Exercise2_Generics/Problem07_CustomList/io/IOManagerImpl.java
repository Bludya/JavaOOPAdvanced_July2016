package Exercise2_Generics.Problem07_CustomList.io;

import Exercise2_Generics.Problem07_CustomList.interfaces.IOManager;
import Exercise2_Generics.Problem07_CustomList.interfaces.Reader;
import Exercise2_Generics.Problem07_CustomList.interfaces.Writer;

import java.io.IOException;

/**
 * Created by bludya on 7/20/16.
 * All rights reserved!
 */
public class IOManagerImpl implements IOManager {
    private Reader reader;
    private Writer writer;

    public IOManagerImpl() {
        this.setReader(new ConsoleReader());
        this.setWriter(new ConsoleWriter());
    }

    private Reader getReader() {
        return reader;
    }

    private void setReader(Reader reader) {
        this.reader = reader;
    }

    private Writer getWriter() {
        return writer;
    }

    private void setWriter(Writer writer) {
        this.writer = writer;
    }

    @Override
    public void write(String string) {
        writer.write(string);
    }

    @Override
    public void writeLine(String string) {
        writer.writeLine(string);
    }

    @Override
    public String read() throws IOException {
        return reader.read();
    }
}
