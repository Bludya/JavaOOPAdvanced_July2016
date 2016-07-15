package Exercise1_Interfaces.Problem08_MilitaryElite.models;

import Exercise1_Interfaces.Problem08_MilitaryElite.interfaces.models.IRepair;

/**
 * Created by bludya on 7/15/16.
 * All rights reserved!
 */
public class Repair implements IRepair{
    String partName;
    int hoursWorked;

    public Repair(String partName, int hoursWorked) {
        this.setPartName(partName);
        this.setHoursWorked(hoursWorked);
    }

    private void setPartName(String partName) {
        this.partName = partName;
    }

    private void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String getPartName() {
        return this.partName;
    }

    @Override
    public int getHoursWorked() {
        return this.hoursWorked;
    }

    @Override
    public String toString(){
        return String.format("Part Name: %s Hours Worked: %d",
                this.getPartName(),
                this.getHoursWorked());
    }
}
