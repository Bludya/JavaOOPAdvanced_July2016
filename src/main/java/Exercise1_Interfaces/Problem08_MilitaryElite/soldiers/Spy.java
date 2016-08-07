package Exercise1_Interfaces.Problem08_MilitaryElite.soldiers;

import Exercise1_Interfaces.Problem08_MilitaryElite.interfaces.soldiers.ISpy;

/**
 * Created by bludya on 7/15/16.
 * All rights reserved!
 */
public class Spy extends Soldier implements ISpy {
    private long codeNumber;

    public Spy(String id, String firstName, String lastName, long codeNumber) {
        super(id, firstName, lastName);
        this.setCodeNumber(codeNumber);
    }

    @Override
    public long getCodeNumber() {
        return this.codeNumber;
    }

    private void setCodeNumber(long codeNumber) {
        this.codeNumber = codeNumber;
    }

    @Override
    public String toString() {
        String output = super.toString();
        output += String.format("%nCode Number: %d", this.getCodeNumber());
        return output;
    }
}
