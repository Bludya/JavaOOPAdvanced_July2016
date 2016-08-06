package Exercise6_Reflection.Problem_02_1984.factories;

import Exercise6_Reflection.Problem_02_1984.interfaces.EventHandler;
import Exercise6_Reflection.Problem_02_1984.interfaces.Factory;
import Exercise6_Reflection.Problem_02_1984.interfaces.SimpleEntity;
import Exercise6_Reflection.Problem_02_1984.models.Company;
import Exercise6_Reflection.Problem_02_1984.models.Employee;

/**
 * Created by bludya on 8/6/16.
 * All rights reserved!
 */
public class EntityFactory implements Factory<SimpleEntity> {
    private EventHandler eventHandler;

    public EntityFactory(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    @Override
    public SimpleEntity produce(String[] data) throws ReflectiveOperationException {
        String type = data[0];
        String id = data[1];
        String name = data[2];
        switch (type) {
            case "Employee":
                int income = Integer.parseInt(data[3]);
                return new Employee(id, name, eventHandler, income);
            case "Company":
                int turnover = Integer.parseInt(data[3]);
                int revenue = Integer.parseInt(data[4]);
                return new Company(id, name, this.eventHandler, revenue, turnover);
            default:
                return null;
        }
    }
}
