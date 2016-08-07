package Exercise1_Interfaces.Problem08_MilitaryElite.soldiers;

import Exercise1_Interfaces.Problem08_MilitaryElite.interfaces.soldiers.IPrivate;

/**
 * Created by bludya on 7/15/16.
 * All rights reserved!
 */
public class Private extends Soldier implements IPrivate {
    double salary;

    public Private(String id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.setSalary(salary);
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    private void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        String output = super.toString();
        output += String.format(" Salary: %.2f", this.getSalary());
        return output;
    }
}
