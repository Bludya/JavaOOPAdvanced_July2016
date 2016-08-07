package Exercise6_Reflection.Problem_02_1984.models.changes;


/**
 * Created by bludya on 8/6/16.
 * All rights reserved!
 */
public class StringChange extends ChangeImpl<String> {

    public StringChange(
            String id,
            String fieldName,
            String newValue) {
        super(
                id,
                fieldName,
                newValue);
    }
}
