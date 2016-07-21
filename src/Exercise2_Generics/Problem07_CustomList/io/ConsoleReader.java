package Exercise2_Generics.Problem07_CustomList.io;


import Exercise2_Generics.Problem07_CustomList.interfaces.Reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by bludya on 7/20/16.
 * All rights reserved!
 */
public class ConsoleReader implements Reader {
    private BufferedReader reader;

    public ConsoleReader() {
        this.setReader(new BufferedReader(new InputStreamReader(System.in)));
    }

    private BufferedReader getReader() {
        return reader;
    }

    private void setReader(BufferedReader reader) {
        this.reader = reader;
    }


    @Override
    public String read() throws IOException {
        return this.getReader().readLine();
    }
}
