package Exercise2_Generics.Problem07_CustomList.models;

import Exercise2_Generics.Problem07_CustomList.interfaces.Sorter;

import java.util.Collections;
import java.util.List;

/**
 * Created by bludya on 7/21/16.
 * All rights reserved!
 */
public class SorterImpl<T extends Comparable<T>> implements Sorter<T> {

    public SorterImpl() {
    }

    @Override
    public void sort(List<T> myList) {
        Collections.sort(myList);
    }
}
