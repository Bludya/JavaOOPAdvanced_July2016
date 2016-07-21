package Exercise2_Generics.Problem07_CustomList.io.commands;

import Exercise2_Generics.Problem07_CustomList.interfaces.CustomList;
import Exercise2_Generics.Problem07_CustomList.interfaces.IOManager;

/**
 * Created by bludya on 7/21/16.
 * All rights reserved!
 */
public class SortCommand<T extends Comparable<T>> extends Command<T> {

    public SortCommand(CustomList<T> list, IOManager ioManager) {
        super(ioManager, list);
    }

    @Override
    public void execute() {
        this.getList().sort();
    }


}
