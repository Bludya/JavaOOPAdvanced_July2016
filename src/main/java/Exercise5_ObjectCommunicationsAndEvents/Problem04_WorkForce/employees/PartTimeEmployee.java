package Exercise5_ObjectCommunicationsAndEvents.Problem04_WorkForce.employees;

/**
 * Created by bludya on 8/5/16.
 * All rights reserved!
 */
public class PartTimeEmployee extends Employee {
    private static final int WORK_HOURS = 20;

    public PartTimeEmployee(String name) {
        super(name, WORK_HOURS);
    }
}
