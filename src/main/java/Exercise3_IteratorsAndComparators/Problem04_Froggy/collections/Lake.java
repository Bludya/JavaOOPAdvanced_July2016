package Exercise3_IteratorsAndComparators.Problem04_Froggy.collections;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * Created by Bludya on 27.7.2016 г..
 * All rights reserved!
 */
public class Lake implements Iterable<Integer> {
    int[] collection;

    public Lake(int[] collection) {
        this.setCocllection(collection);
    }

    private void setCocllection(int[] collection) {
        this.collection = collection;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        for (int number : this) {
            action.accept(number);
        }
    }

    class Frog implements Iterator<Integer> {
        boolean isEvenDone = false;
        int evenCounter = -2;
        int oddCounter = -1;

        @Override
        public boolean hasNext() {
            return oddCounter + 2 < collection.length || evenCounter + 2 < collection.length;
        }

        @Override
        public Integer next() {
            if (evenCounter + 2 >= collection.length) {
                return collection[oddCounter += 2];
            }
            return collection[evenCounter += 2];
        }
    }
}
