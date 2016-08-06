package Exercise6_Reflection.Problem_02_1984.events;

import java.util.EventObject;

/**
 * Created by bludya on 8/6/16.
 * All rights reserved!
 */
public class ChangeEvent extends EventObject {

    private String id;
    private String name;
    private String type;
    private String fieldType;
    private String oldValue;
    private String newValue;

    public ChangeEvent(Object source,
                       String id,
                       String name,
                       String type,
                       String fieldType,
                       String oldValue,
                       String newValue) {
        super(source);
        this.id = id;
        this.name = name;
        this.type = type;
        this.fieldType = fieldType;
        this.oldValue = oldValue;
        this.newValue = newValue;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        String output = String.format("--%s(ID:%s) changed %s(%s) from %s to %s",
                this.name,
                this.id,
                this.type,
                this.fieldType,
                this.oldValue,
                this.newValue);
        return output;
    }

}
