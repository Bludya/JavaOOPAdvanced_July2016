package Exercise6_Reflection.Problem_02_1984.models;

import Exercise6_Reflection.Problem_02_1984.interfaces.EventHandler;

/**
 * Created by bludya on 8/6/16.
 * All rights reserved!
 */
public class Company extends SimpleEntityImpl {

    private int turnover;
    private int revenue;

    public Company(
            String id,
            String name,
            EventHandler eventHandler,
            int revenue,
            int turnover) {
        super(id, name, eventHandler);
        this.turnover = turnover;
        this.revenue = revenue;
    }

}
