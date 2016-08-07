package Exercise1_Interfaces.Problem08_MilitaryElite.soldiers;

import Exercise1_Interfaces.Problem08_MilitaryElite.interfaces.soldiers.ICommando;
import Exercise1_Interfaces.Problem08_MilitaryElite.models.Mission;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by bludya on 7/15/16.
 * All rights reserved!
 */
public class Commando extends SpecialisedSoldier implements ICommando {
    private Set<Mission> missions;

    public Commando(String id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary, corps);
        this.missions = new LinkedHashSet<>();
    }

    @Override
    public Set<Mission> getMissions() {
        return this.missions;
    }

    @Override
    public void addMission(Mission mission) {
        this.getMissions().add(mission);
    }

    @Override
    public String toString() {
        String output = super.toString();
        output += String.format("%nMissions:");
        for (Mission mission : missions) {
            output += String.format("%n  %s", mission.toString());
        }
        return output;
    }
}
