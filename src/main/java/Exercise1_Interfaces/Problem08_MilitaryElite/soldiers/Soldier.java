package Exercise1_Interfaces.Problem08_MilitaryElite.soldiers;

import Exercise1_Interfaces.Problem08_MilitaryElite.interfaces.soldiers.ISoldier;

/**
 * Created by bludya on 7/15/16.
 * All rights reserved!
 */
public abstract class Soldier implements ISoldier {
    String id;
    String firstName;
    String lastName;

    protected Soldier(String id, String firstName, String lastName) {
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    @Override
    public String getId() {
        return this.id;
    }

    private void setId(String id) {
        this.id = id;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s Id: %s",
                this.getFirstName(),
                this.getLastName(),
                this.getId());
    }
}
