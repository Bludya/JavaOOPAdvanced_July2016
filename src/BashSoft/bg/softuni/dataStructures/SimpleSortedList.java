package BashSoft.bg.softuni.dataStructures;

import BashSoft.bg.softuni.contracts.SimpleOrderedBag;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

/**
 * Created by bludya on 7/21/16.
 * All rights reserved!
 */
public class SimpleSortedList<E extends Comparable<E>> implements SimpleOrderedBag<E> {
    private static final int DEFAULT_SIZE = 16;

    private E[] innerCollection;
    private int size;
    private Comparator<E> comparator;

    public SimpleSortedList(Class<E> type, Comparator<E> comparator, int capacity) {
        this.initializeInnerCollection(type, capacity);
        this.comparator = comparator;
    }

    public SimpleSortedList(Class<E> type, int capacity) {
        this(type, Comparable::compareTo, capacity);
    }

    public SimpleSortedList(Class<E> type, Comparator<E> comparator) {
        this(type, comparator, DEFAULT_SIZE);
    }

    public SimpleSortedList(Class<E> type) {
        this(type, Comparable::compareTo, DEFAULT_SIZE);
    }

    @Override
    public void add(E element) {
        if (this.size() >= innerCollection.length) {
            this.resize();
        }

        this.innerCollection[this.size()] = element;
        this.size++;
        this.quickSort(this.innerCollection, 0, this.size(), this.comparator);
    }

    @Override
    public void addAll(Collection<E> elements) {
        if (this.size() + elements.size() >= this.innerCollection.length) {
            this.multiResize(elements);
        }

        for (E element : elements) {
            this.innerCollection[this.size()] = element;
            this.size++;
        }

        Arrays.sort(this.innerCollection, 0, this.size(), this.comparator);
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public String joinWith(String joiner) {
        StringBuilder output = new StringBuilder();

        for (E e : this) {
            output.append(e);
            output.append(joiner);
        }

        output.setLength(output.length() - joiner.length());
        return output.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return this.index < size();
            }

            @Override
            public E next() {
                return innerCollection[this.index++];
            }
        };
    }

    private void multiResize(Collection<E> elements) {
        int newSize = this.innerCollection.length * 2;
        while (this.size() + elements.size() >= newSize) {
            newSize *= 2;
        }

        this.innerCollection = Arrays.copyOf(
                this.innerCollection,
                newSize);

    }

    private void resize() {
        this.innerCollection = Arrays.copyOf(
                this.innerCollection,
                this.innerCollection.length * 2);
    }

    @SuppressWarnings("unchecked")
    private void initializeInnerCollection(Class<E> type, int capacity) {
        if (capacity < 1) {
            throw new IllegalArgumentException("Capacity cannot be negative!");
        }

        this.innerCollection = (E[]) Array.newInstance(type, capacity);
    }

    private void quickSort(E[] array, int min, int max, Comparator<E> cmp) {
        int pivot = min;
        int storeIndex = min + 1;
        for (int i = storeIndex; i <= max; i++) {
            if (cmp.compare(array[i], array[pivot]) < 0) {
                swap(array, i, storeIndex);
                storeIndex++;
            }
        }

        swap(array, pivot, storeIndex - 1);

        if (storeIndex - min > 2) {
            quickSort(array, min, storeIndex - 2, cmp);
        }
        if (max - storeIndex > 2) {
            quickSort(array, storeIndex, max, cmp);
        }
    }


    private void swap(E[] array, int a, int b) {
        E temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
