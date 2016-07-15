package Exercise1_Interfaces.Problem08_MilitaryElite.soldiers;

import Exercise1_Interfaces.Problem08_MilitaryElite.interfaces.soldiers.IEngineer;
import Exercise1_Interfaces.Problem08_MilitaryElite.models.Repair;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by bludya on 7/15/16.
 * All rights reserved!
 */
public class Engineer extends SpecialisedSoldier implements IEngineer {
    private Set<Repair> repairs;

    public Engineer(String id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary, corps);
        this.repairs = new LinkedHashSet<>();
    }

    @Override
    public Set<Repair> getRepairs() {
        return this.repairs;
    }

    @Override
    public void addRepair(Repair repair) {
        this.getRepairs().add(repair);
    }

    @Override
    public String toString(){
        String output = super.toString();
        output += String.format("%nRepairs:");
        for(Repair repair : repairs){
            output += String.format("%n  %s", repair.toString());
        }
        return output;
    }
}
