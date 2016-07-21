package Exercise2_Generics.Problem07_CustomList.io.commands;

import Exercise2_Generics.Problem07_CustomList.interfaces.CustomList;
import Exercise2_Generics.Problem07_CustomList.interfaces.IOManager;

/**
 * Created by bludya on 7/20/16.
 * All rights reserved!
 */
public class RemoveCommand<T extends Comparable<T>> extends Command<T> {
    private int index;

    public RemoveCommand(int index, CustomList<T> myList, IOManager ioManager) {
        super(ioManager, myList);
        this.setIndex(index);
    }

    private int getIndex() {
        return index;
    }

    private void setIndex(int index) {
        this.index = index;
    }

    @Override
    public void execute() {
        super.getList().remove(this.getIndex());
    }
}
