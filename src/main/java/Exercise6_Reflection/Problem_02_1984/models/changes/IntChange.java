package Exercise6_Reflection.Problem_02_1984.models.changes;

/**
 * Created by bludya on 8/6/16.
 * All rights reserved!
 */
public class IntChange extends ChangeImpl<Integer> {

    public IntChange(
            String id,
            String fieldName,
            String newValue) {
        super(
                id,
                fieldName,
                Integer.parseInt(newValue));
    }

}
