package Exercise1_Interfaces.Problem08_MilitaryElite.interfaces.soldiers;

import Exercise1_Interfaces.Problem08_MilitaryElite.soldiers.Private;
import Exercise1_Interfaces.Problem08_MilitaryElite.soldiers.Soldier;

import java.util.Set;

/**
 * Created by bludya on 7/15/16.
 * All rights reserved!
 */
public interface ILeutenantGeneral {

    Set<Soldier> getPrivates();

    void addPrivate(Soldier privateSoldier);
}
