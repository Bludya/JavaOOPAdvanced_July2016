package Exercise6_Reflection.Problem_02_1984.factories;

import Exercise6_Reflection.Problem_02_1984.interfaces.Factory;
import Exercise6_Reflection.Problem_02_1984.models.Institution;

/**
 * Created by bludya on 8/6/16.
 * All rights reserved!
 */
public class InstitutionFactory implements Factory<Institution> {

    @Override
    public Institution produce(String[] data) throws ReflectiveOperationException {
        String id = data[1];
        String name = data[2];
        String[] subjects = new String[data.length - 2];
        for (int i = 2; i < data.length; i++) {
            subjects[i - 2] = data[i];
        }

        return new Institution(id, name, subjects);
    }
}
