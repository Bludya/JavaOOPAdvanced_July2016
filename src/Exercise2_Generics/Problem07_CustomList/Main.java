package Exercise2_Generics.Problem07_CustomList;


import Exercise2_Generics.Problem07_CustomList.interfaces.CommandInterpreter;
import Exercise2_Generics.Problem07_CustomList.interfaces.CustomList;
import Exercise2_Generics.Problem07_CustomList.interfaces.IOManager;
import Exercise2_Generics.Problem07_CustomList.io.IOManagerImpl;
import Exercise2_Generics.Problem07_CustomList.io.StringCommandInterpreter;
import Exercise2_Generics.Problem07_CustomList.models.MyList;

import java.io.IOException;

/**
 * Created by bludya on 7/17/16.
 * All rights reserved!
 */
public class Main {
    public static void main(String[] args) throws IOException {

        IOManager ioManager = new IOManagerImpl();
        CustomList<String> myList = new MyList<>();
        CommandInterpreter commandInterpreter = new StringCommandInterpreter(ioManager, myList);

        commandInterpreter.readUntil("END");
    }
}
