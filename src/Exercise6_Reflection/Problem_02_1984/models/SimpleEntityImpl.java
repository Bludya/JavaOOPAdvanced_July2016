package Exercise6_Reflection.Problem_02_1984.models;

import Exercise6_Reflection.Problem_02_1984.events.ChangeEvent;
import Exercise6_Reflection.Problem_02_1984.interfaces.Change;
import Exercise6_Reflection.Problem_02_1984.interfaces.EventHandler;
import Exercise6_Reflection.Problem_02_1984.interfaces.SimpleEntity;

import java.lang.reflect.Field;

/**
 * Created by bludya on 8/6/16.
 * All rights reserved!
 */
public abstract class SimpleEntityImpl extends EntityImpl implements SimpleEntity {
    private EventHandler eventHandler;

    protected SimpleEntityImpl(String id, String name, EventHandler eventHandler) {
        super(id, name);
        this.eventHandler = eventHandler;
    }

    @Override
    public void implementChange(Change change) throws NoSuchFieldException, IllegalAccessException {
        Field field = null;
        Class<?> current = this.getClass();
        while (current.getSuperclass() != null) {
            try {
                field = current.getDeclaredField(change.getFieldName());
                break;
            } catch (NoSuchFieldException nsfe) {
                current = current.getSuperclass();
            }
        }
        assert field != null;
        field.setAccessible(true);

        String oldValue = field.get(this).toString();
        field.set(this, change.getNewValue());
        String newValue = field.get(this).toString();

        eventHandler.handleEvent(
                new ChangeEvent(
                        this,
                        this.id,
                        this.getClass().getSimpleName(),
                        change.getFieldName(),
                        field.getType().getSimpleName(),
                        oldValue,
                        newValue));
    }
}
