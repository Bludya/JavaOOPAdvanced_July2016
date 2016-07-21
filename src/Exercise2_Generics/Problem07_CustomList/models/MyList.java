package Exercise2_Generics.Problem07_CustomList.models;

import Exercise2_Generics.Problem07_CustomList.interfaces.CustomList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by bludya on 7/20/16.
 * All rights reserved!
 */
public class MyList<T extends Comparable<T>> implements CustomList<T>, Iterable<T> {
    private List<T> list;

    public MyList() {
        this.setList(new ArrayList<>());
    }

    public List<T> getList() {
        return list;
    }

    private void setList(List<T> list) {
        this.list = list;
    }

    @Override
    public void add(T element) {
        this.getList().add(element);
    }

    @Override
    public T remove(int index) {
        if (this.getList().size() > index) {
            return this.getList().remove(index);
        }
        return null;
    }

    @Override
    public boolean contains(T element) {
        return this.getList().contains(element);
    }

    @Override
    public void swap(int index1, int index2) {
        Collections.swap(this.getList(), index1, index2);
    }

    @Override
    public int countGreaterThan(T element) {
        int count = 0;

        for (T currentElement : this.getList()) {
            if (element.compareTo(currentElement) < 0) {
                count++;
            }
        }

        return count;
    }

    @Override
    public T getMax() {
        return this.getList().stream().max(Comparable::compareTo).get();
    }

    @Override
    public T getMin() {
        return this.getList().stream().min(Comparable::compareTo).get();
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        this.getList().forEach(action::accept);
    }
}
