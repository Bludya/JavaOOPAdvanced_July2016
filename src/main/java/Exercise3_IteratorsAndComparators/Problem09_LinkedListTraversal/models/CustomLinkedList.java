package Exercise3_IteratorsAndComparators.Problem09_LinkedListTraversal.models;

import Exercise3_IteratorsAndComparators.Problem09_LinkedListTraversal.interfaces.DoubleLinkedListInterface;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * Created by bludya on 7/28/16.
 * All rights reserved!
 */
public class CustomLinkedList<T> implements DoubleLinkedListInterface<T> {
    private Node<T> head;
    private Node<T> tail;
    private int count;

    public CustomLinkedList() {
        this.setHead(null);
        this.setTail(null);
        this.setCount(0);
    }

    private void setHead(Node<T> head) {
        this.head = head;
    }

    private void setTail(Node<T> tail) {
        this.tail = tail;
    }

    private void setCount(int count) {
        this.count = count;
    }


    @Override
    public void add(T element) {
        if (count == 0) {
            this.setHead(new Node<>(element, null, null));
            this.setTail(this.head);
            count++;
            return;
        }

        Node<T> newNode = new Node<T>(element, this.tail, null);
        this.tail.setNext(newNode);
        this.setTail(newNode);
        count++;
    }

    @Override
    public boolean remove(T element) {
        for (Node<T> node : this) {
            if (node.getValue() == element) {
                Node<T> previousNode = node.getPrevious();
                Node<T> nextNode = node.getNext();
                if (previousNode == null) {
                    this.setHead(nextNode);
                    nextNode.setPrevious(null);
                } else if (nextNode == null) {
                    previousNode.setNext(null);
                    this.setTail(previousNode);
                } else {
                    previousNode.setNext(nextNode);
                    nextNode.setPrevious(previousNode);
                }
                count--;
                return true;
            }
        }
        return false;
    }

    @Override
    public int getSize() {
        return this.count;
    }

    @Override
    public Iterator<Node<T>> iterator() {
        return new CustomIterator();
    }

    @Override
    public void forEach(Consumer<? super Node<T>> action) {
        for (Node<T> node : this) {
            action.accept(node);
        }
    }

    private class CustomIterator implements Iterator<Node<T>> {
        private Node<T> currentNode = head;

        @Override
        public boolean hasNext() {
            return this.currentNode != null;
        }

        @Override
        public Node<T> next() {
            Node<T> returnNode = currentNode;
            currentNode = currentNode.getNext();
            return returnNode;
        }
    }
}
