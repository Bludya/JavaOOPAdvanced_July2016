package Exercise6_Reflection.Problem_02_1984.models;

import Exercise6_Reflection.Problem_02_1984.interfaces.Entity;

/**
 * Created by bludya on 8/6/16.
 * All rights reserved!
 */
public abstract class EntityImpl implements Entity {
    protected String id;
    protected String name;

    protected EntityImpl(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

}
