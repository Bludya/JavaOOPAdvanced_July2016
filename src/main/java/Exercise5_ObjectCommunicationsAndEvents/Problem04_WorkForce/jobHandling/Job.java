package Exercise5_ObjectCommunicationsAndEvents.Problem04_WorkForce.jobHandling;

import Exercise5_ObjectCommunicationsAndEvents.Problem04_WorkForce.employees.Employee;

/**
 * Created by bludya on 8/5/16.
 * All rights reserved!
 */
public class Job {
    private String name;
    private int hoursNeeded;
    private Employee employee;
    private JobDoneHandler handler;

    public Job(String name, int hoursNeeded, Employee employee) {
        this.setName(name);
        this.setHoursNeeded(hoursNeeded);
        this.setEmployee(employee);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setHoursNeeded(int hoursNeeded) {
        if (hoursNeeded <= 0) {
            this.fireJobDoneEvent();
        }
        this.hoursNeeded = hoursNeeded;
    }

    public void finishWeek() {
        this.setHoursNeeded(this.hoursNeeded - employee.getWorkHours());
    }

    private void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setHandler(JobDoneHandler handler) {
        this.handler = handler;
    }

    private void fireJobDoneEvent() {
        this.handler.handleJobDone(new JobDoneEvent(this));
    }

    @Override
    public String toString() {
        return String.format("Job: %s Hours Remaining: %d", this.name, this.hoursNeeded);
    }

}
