package Exercise1_Interfaces.Problem08_MilitaryElite.soldiers;

import Exercise1_Interfaces.Problem08_MilitaryElite.interfaces.soldiers.ILeutenantGeneral;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by bludya on 7/15/16.
 * All rights reserved!
 */
public class LeutenantGeneral extends Private implements ILeutenantGeneral {
    private Set<Soldier> privates;

    public LeutenantGeneral(String id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.privates = new LinkedHashSet<>();
    }

    @Override
    public Set<Soldier> getPrivates() {
        return this.privates;
    }

    @Override
    public void addPrivate(Soldier privateSoldier) {
        this.privates.add(privateSoldier);
    }

    @Override
    public String toString() {
        String output = super.toString();
        output += String.format("%nPrivates:");
        for (Soldier privateSoldier : this.getPrivates()) {
            output += String.format("%n  %s", privateSoldier.toString());
        }
        return output;
    }
}
