package Exercise3_IteratorsAndComparators.Problem09_LinkedListTraversal.interfaces;

import Exercise3_IteratorsAndComparators.Problem09_LinkedListTraversal.models.Node;

/**
 * Created by bludya on 7/28/16.
 * All rights reserved!
 */
public interface DoubleLinkedListInterface<T> extends Iterable<Node<T>> {

    void add(T element);

    boolean remove(T element);

    int getSize();
}
