package Exercise2_Generics.Problem07_CustomList.io.commands;

import Exercise2_Generics.Problem07_CustomList.interfaces.CustomList;
import Exercise2_Generics.Problem07_CustomList.interfaces.IOManager;
import Exercise2_Generics.Problem07_CustomList.interfaces.Sorter;
import Exercise2_Generics.Problem07_CustomList.models.SorterImpl;

/**
 * Created by bludya on 7/21/16.
 * All rights reserved!
 */
public class SortCommand<T extends Comparable<T>> extends Command<T> {

    private Sorter<T> mySorter;

    public SortCommand(CustomList<T> list, IOManager ioManager) {
        super(ioManager, list);
        this.setMySorter(new SorterImpl<>());
    }


    private void setMySorter(SorterImpl<T> mySorter) {
        this.mySorter = mySorter;
    }

    @Override
    public void execute() {
        mySorter.sort(super.getList());
    }


}
