package Exercise2_Generics.Problem03_GenericSwapMethodStrings.usables;

import java.util.List;

/**
 * Created by bludya on 7/16/16.
 * All rights reserved!
 */
public class Swapper<E> {
    private List<E> list;

    public Swapper(List<E> list) {
        this.setList(list);
    }

    public List<E> getList() {
        return list;
    }

    private void setList(List<E> list) {
        this.list = list;
    }

    public void swapElements(int index1, int index2) {
        E firstElement = this.getList().get(index1);
        E secondElement = this.getList().get(index2);

        this.getList().remove(index2);
        this.getList().add(index2, firstElement);
        this.getList().remove(index1);
        this.getList().add(index1, secondElement);
    }
}
