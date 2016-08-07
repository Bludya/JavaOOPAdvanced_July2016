package Exercise2_Generics.Problem07_CustomList.io;

import Exercise2_Generics.Problem07_CustomList.interfaces.Writer;

/**
 * Created by bludya on 7/20/16.
 * All rights reserved!
 */
public class ConsoleWriter implements Writer {

    public ConsoleWriter() {
    }

    @Override
    public void write(String string) {
        System.out.print(string);
    }

    @Override
    public void writeLine(String string) {
        System.out.println(string);
    }
}
