package Exercise6_Reflection.Problem_02_1984.factories;

import Exercise6_Reflection.Problem_02_1984.interfaces.Change;
import Exercise6_Reflection.Problem_02_1984.interfaces.Factory;
import Exercise6_Reflection.Problem_02_1984.interfaces.Repository;
import Exercise6_Reflection.Problem_02_1984.interfaces.SimpleEntity;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * Created by bludya on 8/6/16.
 * All rights reserved!
 */
public class ChangesFactory implements Factory<Change> {
    private static final String CHANGES_PACKAGE = "Exercise6_Reflection.Problem_02_1984.models.changes.";
    private Repository<SimpleEntity> entities;

    public ChangesFactory(Repository<SimpleEntity> entities) {
        this.entities = entities;
    }

    @Override
    public Change produce(String[] data) throws ReflectiveOperationException {
        String id = data[0];
        String fieldName = data[1];
        String newValue = data[2];

        SimpleEntity entity = entities.get(id);
        Field field = null;
        Class<?> current = entity.getClass();

        //iterate tru all the extended classes to get the field;
        while (current.getSuperclass() != null) {
            try {
                field = current.getDeclaredField(fieldName);
                break;
            } catch (NoSuchFieldException nsfe) {
                current = current.getSuperclass();
            }
        }

        if (field == null) {
            return null;
        }

        String fieldType = field.getType().getSimpleName();
        fieldType = fieldType.toUpperCase().charAt(0) + fieldType.substring(1);

        String changeClassName = CHANGES_PACKAGE + fieldType + "Change";

        Class<Change> changeClass = (Class<Change>) Class.forName(changeClassName);
        Constructor changeCtor = changeClass.getConstructor(String.class, String.class, String.class);
        return (Change) changeCtor.newInstance(id, fieldName, newValue);
    }
}
