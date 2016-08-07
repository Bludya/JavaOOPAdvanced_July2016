package Exercise2_Generics.Problem07_CustomList.interfaces;

import java.util.List;

/**
 * Created by bludya on 7/21/16.
 * All rights reserved!
 */
public interface Sorter<T> {
    void sort(List<T> myList);
}
