package Exercise2_Generics.Problem02_GenercBoxWithInteger.containers;

/**
 * Created by bludya on 7/16/16.
 * All rights reserved!
 */
public class Box<T> {
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
}
