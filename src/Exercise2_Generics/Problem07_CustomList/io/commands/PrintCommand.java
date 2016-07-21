package Exercise2_Generics.Problem07_CustomList.io.commands;

import Exercise2_Generics.Problem07_CustomList.interfaces.CustomList;
import Exercise2_Generics.Problem07_CustomList.interfaces.IOManager;

/**
 * Created by bludya on 7/20/16.
 * All rights reserved!
 */
public class PrintCommand<T extends Comparable<T>> extends Command<T> {
    public PrintCommand(CustomList<T> myList, IOManager ioManager) {
        super(ioManager, myList);
    }

    @Override
    public void execute() {
        super.getList().forEach(System.out::println);
    }
}
