package Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.models;

import Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.interfaces.Weapon;
import Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.interfaces.WeaponFactory;

/**
 * Created by bludya on 8/4/16.
 * All rights reserved!
 */
public class WeponFactoryImpl implements WeaponFactory {


    @Override
    public Weapon makeWeapon(String type, String name) {
        Weapon weapon;

        switch (type) {
            case "KNIFE":
                weapon = new Knife(name);
                break;
            case "AXE":
                weapon = new Axe(name);
                break;
            case "SWORD":
                weapon = new Sword(name);
                break;
            default:
                weapon = null;
                break;
        }

        return weapon;
    }
}
