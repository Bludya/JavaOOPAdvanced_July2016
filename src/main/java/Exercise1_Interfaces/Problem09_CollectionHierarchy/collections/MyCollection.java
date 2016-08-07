package Exercise1_Interfaces.Problem09_CollectionHierarchy.collections;

import Exercise1_Interfaces.Problem09_CollectionHierarchy.interfaces.Usable;

import java.util.LinkedList;

/**
 * Created by bludya on 7/15/16.
 * All rights reserved!
 */
public class MyCollection extends AddRemoveCollection implements Usable {
    public MyCollection() {
        super(new LinkedList<>());
    }

    @Override
    public String remove() {
        return super.getCollection().remove(0);
    }

    @Override
    public long used() {
        return super.getCollection().size();
    }
}
