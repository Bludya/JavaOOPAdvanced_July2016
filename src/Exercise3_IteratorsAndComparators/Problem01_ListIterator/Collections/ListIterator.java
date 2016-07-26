package Exercise3_IteratorsAndComparators.Problem01_ListIterator.Collections;

import Exercise3_IteratorsAndComparators.Problem01_ListIterator.Interface.Iterable;

import java.util.List;

/**
 * Created by bludya on 7/26/16.
 * All rights reserved!
 */
public class ListIterator implements Iterable {
    private List<String> list;
    private int index;

    public ListIterator(List<String> list) {
        this.setList(list);
        this.setIndex(0);
    }

    private void setList(List<String> list) {
        this.list = list;
    }


    private void setIndex(int index) {
        this.index = index;
    }


    @Override
    public boolean move() {
        if (this.hasNext()) {
            this.setIndex(this.index + 1);
            return true;
        }

        return false;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.list.size() - 1;
    }

    @Override
    public String print() {
        if (this.list.size() == 0) {
            throw new IllegalArgumentException("Invalid Operation!");
        }

        return this.list.get(this.index);
    }
}
