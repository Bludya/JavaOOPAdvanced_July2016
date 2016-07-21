package Exercise2_Generics.Problem10_Tuple.models;

/**
 * Created by bludya on 7/21/16.
 * All rights reserved!
 */
public class Tuple<Type1, Type2> {
    private Type1 firstElement;
    private Type2 secondElement;

    public Tuple(Type1 firstElement, Type2 secondElement) {
        this.setFirstElement(firstElement);
        this.setSecondElement(secondElement);
    }

    private Type1 getFirstElement() {
        return firstElement;
    }

    private void setFirstElement(Type1 firstElement) {
        this.firstElement = firstElement;
    }

    private Type2 getSecondElement() {
        return secondElement;
    }

    private void setSecondElement(Type2 secondElement) {
        this.secondElement = secondElement;
    }

    @Override
    public String toString() {
        return this.getFirstElement().toString() + " -> " + this.getSecondElement().toString();
    }
}
