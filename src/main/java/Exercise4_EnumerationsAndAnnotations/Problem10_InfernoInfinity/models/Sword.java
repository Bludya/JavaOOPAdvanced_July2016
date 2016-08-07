package Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.models;

import Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.enums.WeaponTypes;

/**
 * Created by bludya on 8/4/16.
 * All rights reserved!
 */
public class Sword extends WeaponImplementation {
    public Sword(String name) {
        super(WeaponTypes.SWORD, name);
    }
}
