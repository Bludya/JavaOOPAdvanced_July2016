package Exercise2_Generics.Problem07_CustomList.io.commands;

import Exercise2_Generics.Problem07_CustomList.interfaces.CustomList;
import Exercise2_Generics.Problem07_CustomList.interfaces.Executable;
import Exercise2_Generics.Problem07_CustomList.interfaces.IOManager;


/**
 * Created by bludya on 7/20/16.
 * All rights reserved!
 */
public abstract class Command<T extends Comparable<T>> implements Executable {
    private IOManager ioManager;
    private CustomList<T> list;

    protected Command(IOManager ioManager, CustomList<T> list) {
        this.setIOManager(ioManager);
        this.setList(list);
    }

    protected IOManager getIoManager() {
        return ioManager;
    }

    protected CustomList<T> getList() {
        return list;
    }

    private void setList(CustomList<T> list) {
        this.list = list;
    }

    private void setIOManager(IOManager ioManager) {
        this.ioManager = ioManager;
    }

    @Override
    public abstract void execute();
}
