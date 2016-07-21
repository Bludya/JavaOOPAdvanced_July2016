package Exercise2_Generics.Problem07_CustomList.io.commands;

import Exercise2_Generics.Problem07_CustomList.interfaces.CustomList;
import Exercise2_Generics.Problem07_CustomList.interfaces.IOManager;

/**
 * Created by bludya on 7/20/16.
 * All rights reserved!
 */
public class ContainsCommand<T extends Comparable<T>> extends Command<T> {
    private T element;

    public ContainsCommand(T element, CustomList<T> myList, IOManager ioManager) {
        super(ioManager, myList);
        this.setElement(element);
    }

    private T getElement() {
        return element;
    }

    private void setElement(T element) {
        this.element = element;
    }

    @Override
    public void execute() {
        String isThere = String.valueOf(super.getList().contains(this.getElement()));
        super.getIoManager().writeLine(isThere);
    }
}
