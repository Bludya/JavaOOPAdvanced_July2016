package Exercise3_IteratorsAndComparators.Problem09_LinkedListTraversal.models;

/**
 * Created by bludya on 7/28/16.
 * All rights reserved!
 */
public class Node<T> {
    private T value;
    private Node<T> previous;
    private Node<T> next;

    public Node(T value, Node<T> previous, Node<T> next) {
        this.setValue(value);
        this.setPrevious(previous);
        this.setNext(next);
    }

    public T getValue() {
        return value;
    }

    private void setValue(T value) {
        this.value = value;
    }

    public Node<T> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}
