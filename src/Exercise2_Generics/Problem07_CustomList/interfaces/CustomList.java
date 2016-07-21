package Exercise2_Generics.Problem07_CustomList.interfaces;

/**
 * Created by bludya on 7/20/16.
 * All rights reserved!
 */
public interface CustomList<T> extends Iterable<T> {

    void add(T element);

    T remove(int index);

    boolean contains(T element);

    void swap(int index1, int index2);

    int countGreaterThan(T element);

    T getMax();

    T getMin();

    void sort();
}
