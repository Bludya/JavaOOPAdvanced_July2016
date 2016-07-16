package Exercise2_Generics.Problem05_GenericCountMethodString.containers;

/**
 * Created by bludya on 7/16/16.
 * All rights reserved!
 */
public class Box<T> implements Comparable<T> {
    T element;

    public Box(T element) {
        this.element = element;
    }

    private T getElement() {
        return element;
    }

    private void setElement(T element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return this.getElement().getClass().getName() + ": " + this.getElement();
    }

    @Override
    public int compareTo(T o) {
        return this.compareTo(o);
    }
}
