package Exercise3_IteratorsAndComparators.Problem03_StackIterator.collections;

import Exercise3_IteratorsAndComparators.Problem03_StackIterator.interfaces.Stack;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * Created by Bludya on 27.7.2016 г..
 * All rights reserved!
 */
public class CustomStack implements Stack {
    private int[] collection;
    private int index;

    public CustomStack() {
        this.setIndex(0);
        this.setCollection(new int[4]);
    }

    private void setCollection(int[] collection) {
        this.collection = collection;
    }

    private void setIndex(int index) {
        this.index = index;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int size = index;

            @Override
            public boolean hasNext() {
                return size > 0;
            }

            @Override
            public Integer next() {
                return collection[size--];
            }
        };
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        for (int i = this.index - 1; i >= 0; i--) {
            action.accept(this.collection[i]);
        }
    }

    @Override
    public int pop() {
        if (this.index == 0) {
            throw new IllegalAccessError("No elements");
        }
        return this.collection[--index];
    }

    @Override
    public void push(int element) {
        if (this.index == this.collection.length - 1) {
            this.setCollection(Arrays.copyOf(this.collection, this.collection.length * 2));
        }

        this.collection[index++] = element;
    }


}
