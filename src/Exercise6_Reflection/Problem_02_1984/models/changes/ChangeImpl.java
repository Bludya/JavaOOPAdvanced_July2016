package Exercise6_Reflection.Problem_02_1984.models.changes;

import Exercise6_Reflection.Problem_02_1984.interfaces.Change;

/**
 * Created by bludya on 8/6/16.
 * All rights reserved!
 */
public abstract class ChangeImpl<E> implements Change<E> {
    private String id;
    private String fieldName;
    private E newValue;

    protected ChangeImpl(
            String id,
            String fieldName,
            E newValue) {
        this.id = id;
        this.fieldName = fieldName;
        this.newValue = newValue;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getFieldName() {
        return this.fieldName;
    }

    @Override
    public E getNewValue() {
        return this.newValue;
    }

}
