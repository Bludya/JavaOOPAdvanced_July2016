package Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.archive;

import Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.interfaces.Weapon;
import Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.interfaces.WeaponArchive;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by bludya on 8/3/16.
 * All rights reserved!
 */
public class WeaponArchiveImpl implements WeaponArchive {
    private Map<String, Weapon> archive;

    public WeaponArchiveImpl() {
        this.setArchive(new TreeMap<>());
    }

    private void setArchive(Map<String, Weapon> archive) {
        this.archive = archive;
    }


    @Override
    public void addWeapon(Weapon weapon) {
        this.archive.put(weapon.getName(), weapon);
    }

    @Override
    public Weapon getWeapon(String weaponName) {
        return this.archive.get(weaponName);
    }
}
