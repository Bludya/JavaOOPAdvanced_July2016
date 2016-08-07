package Exercise1_Interfaces.Problem08_MilitaryElite.models;

import Exercise1_Interfaces.Problem08_MilitaryElite.interfaces.models.IMission;

/**
 * Created by bludya on 7/15/16.
 * All rights reserved!
 */
public class Mission implements IMission {
    String codeName;
    String state;

    public Mission(String codeName, String state) {
        this.setCodeName(codeName);
        this.setState(state);
    }

    private void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    @Override
    public String getName() {
        return this.codeName;
    }

    @Override
    public String getState() {
        return this.state;
    }

    private void setState(String state) {
        if (!state.equals("inProgress") && !state.equals("Finished")) {
            throw new IllegalArgumentException("Illegal state!");
        }
        this.state = state;
    }

    @Override
    public void completeMission() {
        this.setState("Finished");
    }

    @Override
    public String toString() {
        return String.format("Code Name: %s State: %s ", this.getName(), this.getState());
    }
}
