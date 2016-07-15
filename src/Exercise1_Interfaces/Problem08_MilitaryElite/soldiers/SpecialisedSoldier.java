package Exercise1_Interfaces.Problem08_MilitaryElite.soldiers;

import Exercise1_Interfaces.Problem08_MilitaryElite.interfaces.soldiers.ISpecialisedSoldier;

/**
 * Created by bludya on 7/15/16.
 * All rights reserved!
 */
public abstract class SpecialisedSoldier extends Private implements ISpecialisedSoldier {
    String corps;

    public SpecialisedSoldier(String id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary);
        this.setCorps(corps);
    }

    private void setCorps(String corps) {
        if(!corps.equals("Airforces") && !corps.equals("Marines")){
            throw new IllegalArgumentException("Invalid corps!");
        }
        this.corps = corps;
    }

    @Override
    public String getCorps() {
        return this.corps;
    }

    @Override
    public String toString(){
        String output = super.toString();
        output += String.format("%nCorps: %s", this.getCorps());
        return output;
    }
}
