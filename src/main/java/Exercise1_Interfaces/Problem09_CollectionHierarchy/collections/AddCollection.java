package Exercise1_Interfaces.Problem09_CollectionHierarchy.collections;

import Exercise1_Interfaces.Problem09_CollectionHierarchy.interfaces.Addable;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by bludya on 7/15/16.
 * All rights reserved!
 */
public class AddCollection implements Addable {
    private List<String> collection;

    public AddCollection() {
        this.collection = new LinkedList<>();
    }

    protected AddCollection(List<String> collection) {
        this.collection = collection;
    }

    protected List<String> getCollection() {
        return collection;
    }

    @Override
    public int add(String string) {
        this.getCollection().add(string);
        return this.getCollection().size() - 1;
    }
}
