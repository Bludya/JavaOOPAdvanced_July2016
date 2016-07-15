package Exercise1_Interfaces.Problem08_MilitaryElite.interfaces.soldiers;

import Exercise1_Interfaces.Problem08_MilitaryElite.models.Repair;

import java.util.Set;

/**
 * Created by bludya on 7/15/16.
 * All rights reserved!
 */
public interface IEngineer {
    Set<Repair> getRepairs();

    void addRepair(Repair repair);
}
