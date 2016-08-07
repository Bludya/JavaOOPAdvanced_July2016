package Exercise6_Reflection.Problem_02_1984.models;

import Exercise6_Reflection.Problem_02_1984.interfaces.EventHandler;

/**
 * Created by bludya on 8/6/16.
 * All rights reserved!
 */
public class Employee extends SimpleEntityImpl {
    private int income;

    public Employee(String id, String name, EventHandler eventHandler, int income) {
        super(id, name, eventHandler);
        this.setIncome(income);
    }

    private void setIncome(int income) {
        this.income = income;
    }

}
