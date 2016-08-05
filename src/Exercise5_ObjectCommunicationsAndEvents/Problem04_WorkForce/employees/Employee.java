package Exercise5_ObjectCommunicationsAndEvents.Problem04_WorkForce.employees;

/**
 * Created by bludya on 8/5/16.
 * All rights reserved!
 */
public abstract class Employee {
    private String name;
    private int workHours;

    protected Employee(String name, int workHours) {
        this.setName(name);
        this.setWorkHours(workHours);
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getWorkHours() {
        return workHours;
    }

    private void setWorkHours(int workHours) {
        this.workHours = workHours;
    }
}
