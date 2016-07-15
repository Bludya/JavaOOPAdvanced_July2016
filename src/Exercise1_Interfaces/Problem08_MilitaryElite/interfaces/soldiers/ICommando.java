package Exercise1_Interfaces.Problem08_MilitaryElite.interfaces.soldiers;

import Exercise1_Interfaces.Problem08_MilitaryElite.models.Mission;

import java.util.Set;

/**
 * Created by bludya on 7/15/16.
 * All rights reserved!
 */
public interface ICommando {
    Set<Mission> getMissions();

    void addMission(Mission mission);
}
