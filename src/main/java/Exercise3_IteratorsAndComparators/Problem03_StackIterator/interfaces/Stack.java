package Exercise3_IteratorsAndComparators.Problem03_StackIterator.interfaces;

/**
 * Created by Bludya on 27.7.2016 г..
 * All rights reserved!
 */
public interface Stack extends Iterable<Integer> {
    int pop();

    void push(int element);
}
