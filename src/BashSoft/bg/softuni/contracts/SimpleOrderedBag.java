package BashSoft.bg.softuni.contracts;

import java.util.Collection;

/**
 * Created by bludya on 7/21/16.
 * All rights reserved!
 */
public interface SimpleOrderedBag<E extends Comparable<E>> extends Iterable<E> {

    void add(E element);

    void addAll(Collection<E> elements);

    int size();

    String joinWith(String joiner);

}
