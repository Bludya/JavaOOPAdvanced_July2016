package Exercise2_Generics.Problem07_CustomList.interfaces;

import java.io.IOException;

/**
 * Created by bludya on 7/20/16.
 * All rights reserved!
 */
public interface CommandInterpreter {

    void process(String[] command);

    void readUntil(String end) throws IOException;

}
