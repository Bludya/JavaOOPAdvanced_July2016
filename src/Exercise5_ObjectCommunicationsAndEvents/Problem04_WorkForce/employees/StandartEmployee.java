package Exercise5_ObjectCommunicationsAndEvents.Problem04_WorkForce.employees;

/**
 * Created by bludya on 8/5/16.
 * All rights reserved!
 */
public class StandartEmployee extends Employee {
    private static final int WORK_HOURS = 40;

    public StandartEmployee(String name) {
        super(name, WORK_HOURS);
    }
}
