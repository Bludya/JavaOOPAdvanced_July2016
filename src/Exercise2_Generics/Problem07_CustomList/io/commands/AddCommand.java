package Exercise2_Generics.Problem07_CustomList.io.commands;

import Exercise2_Generics.Problem07_CustomList.interfaces.CustomList;
import Exercise2_Generics.Problem07_CustomList.interfaces.IOManager;

/**
 * Created by bludya on 7/20/16.
 * All rights reserved!
 */
public class AddCommand<T extends Comparable<T>> extends Command<T> {
    private T element;

    public AddCommand(T element, IOManager ioManager, CustomList<T> list) {
        super(ioManager, list);
        this.setElement(element);
    }

    private void setElement(T element) {
        this.element = element;
    }

    @Override
    public void execute() {
        super.getList().add(element);
    }
}
