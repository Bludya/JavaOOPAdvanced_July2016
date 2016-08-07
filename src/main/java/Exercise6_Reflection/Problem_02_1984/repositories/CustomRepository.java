package Exercise6_Reflection.Problem_02_1984.repositories;

import Exercise6_Reflection.Problem_02_1984.interfaces.Repository;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by bludya on 8/6/16.
 * All rights reserved!
 */
public class CustomRepository<E> implements Repository<E> {
    protected Map<String, E> holder;

    public CustomRepository() {
        this.holder = new LinkedHashMap<>();
    }

    @Override
    public void add(String id, E element) {
        if (!holder.containsKey(id)) {
            holder.put(id, element);
        }
    }

    @Override
    public E get(String id) {
        return this.holder.get(id);
    }

    @Override
    public Collection<E> getValues() {
        return this.holder.values();
    }
}
