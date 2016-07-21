package Exercise2_Generics.Problem07_CustomList.io.commands;

import Exercise2_Generics.Problem07_CustomList.interfaces.CustomList;
import Exercise2_Generics.Problem07_CustomList.interfaces.IOManager;

/**
 * Created by bludya on 7/20/16.
 * All rights reserved!
 */
public class SwapCommand extends Command<String> {
    private int a;
    private int b;

    public SwapCommand(int index1, int index2, CustomList<String> myList, IOManager ioManager) {
        super(ioManager, myList);
        this.setA(index1);
        this.setB(index2);
    }

    private int getA() {
        return a;
    }

    private void setA(int a) {
        this.a = a;
    }

    private int getB() {
        return b;
    }

    private void setB(int b) {
        this.b = b;
    }

    @Override
    public void execute() {
        super.getList().swap(a, b);
    }
}
