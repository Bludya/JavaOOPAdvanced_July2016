package Exercise2_Generics.Problem07_CustomList.io;

import Exercise2_Generics.Problem07_CustomList.interfaces.CommandInterpreter;
import Exercise2_Generics.Problem07_CustomList.interfaces.CustomList;
import Exercise2_Generics.Problem07_CustomList.interfaces.IOManager;
import Exercise2_Generics.Problem07_CustomList.io.commands.Command;

import java.io.IOException;

/**
 * Created by bludya on 7/20/16.
 * All rights reserved!
 */
public abstract class CommandInterpreterImpl<T> implements CommandInterpreter {
    private IOManager ioManager;
    private CustomList<T> myList;

    public CommandInterpreterImpl(IOManager ioManager, CustomList<T> myList) {
        this.setIOManager(ioManager);
        this.setMyList(myList);
    }

    protected IOManager getIoManager() {
        return ioManager;
    }

    protected CustomList<T> getMyList() {
        return myList;
    }

    private void setMyList(CustomList<T> myList) {
        this.myList = myList;
    }

    private void setIOManager(IOManager ioManager) {
        this.ioManager = ioManager;
    }

    @Override
    public void readUntil(String end) throws IOException {
        while (true) {
            String[] input = ioManager.read().split("\\s+");

            if (input[0].equals(end)) {
                return;
            }

            process(input);
        }
    }

    @Override
    public void process(String[] input) {
        Command command = this.parseCommand(input);
        if (command != null) {
            command.execute();
        }
    }

    protected abstract Command parseCommand(String[] input);
}
