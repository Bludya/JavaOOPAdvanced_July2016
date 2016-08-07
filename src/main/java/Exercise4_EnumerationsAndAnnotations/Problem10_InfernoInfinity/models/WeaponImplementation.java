package Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.models;

import Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.annotation.CustomAnnotation;
import Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.enums.Gems;
import Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.enums.Stats;
import Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.enums.WeaponTypes;
import Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.interfaces.Weapon;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bludya on 8/3/16.
 * All rights reserved!
 */
@CustomAnnotation(
        author = "Pesho",
        revision = 3,
        description = "Used for Java OOP Advanced course - Enumerations and Annotations.",
        reviewers = {"Pesho", "Svetlio"}
)
public abstract class WeaponImplementation implements Weapon {
    private WeaponTypes weaponType;
    private Gems[] sockets;
    private String name;

    protected WeaponImplementation(WeaponTypes weaponType, String name) {
        this.setName(name);
        this.setWeaponType(weaponType);
        this.setSockets(
                new Gems[
                        this.getWeaponType().getNumberOfSockets()]);
    }

    private void setSockets(Gems[] sockets) {
        this.sockets = sockets;
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private WeaponTypes getWeaponType() {
        return weaponType;
    }

    private void setWeaponType(WeaponTypes weaponType) {
        this.weaponType = weaponType;
    }

    private Map<Stats, Integer> getBonusStats() {
        Map<Stats, Integer> stats = new HashMap<>();

        for (Stats stat : Stats.values()) {
            stats.put(stat, 0);
        }

        for (Gems gem : this.sockets) {
            if (gem != null) {
                for (Map.Entry<Stats, Integer> entry : gem.getStats().entrySet()) {
                    int amount = stats.get(entry.getKey());
                    stats.replace(entry.getKey(), amount + entry.getValue());
                }
            }
        }

        return stats;

    }

    private int getMinDamageBonuses(Map<Stats, Integer> stats) {
        int bonus = 0;

        for (Map.Entry<Stats, Integer> entry : stats.entrySet()) {
            Stats stat = entry.getKey();
            Integer amount = entry.getValue();

            bonus += stat.getMinDamageBonus() * amount;
        }

        return bonus;
    }

    private int getMaxDamageBonuses(Map<Stats, Integer> stats) {
        int bonus = 0;

        for (Map.Entry<Stats, Integer> entry : stats.entrySet()) {
            Stats stat = entry.getKey();
            Integer amount = entry.getValue();

            bonus += stat.getMaxDamageBonus() * amount;
        }

        return bonus;
    }

    public void addGem(String gemType, int socketIndex) {
        if (socketIndex >= 0 && socketIndex < this.sockets.length) {
            try {
                Gems gem = Gems.valueOf(gemType);
                this.sockets[socketIndex] = gem;
            } catch (IllegalArgumentException iae) {
                //TODO: nothing;
            }
        }

    }

    public void removeGem(int socketIndex) {
        if (socketIndex >= 0 && socketIndex < this.sockets.length) {
            this.sockets[socketIndex] = null;
        }
    }

    private int getMinDamage(Map<Stats, Integer> stats) {
        return this.getMinDamageBonuses(stats) + this.weaponType.getMinDamage();
    }

    private int getMaxDamage(Map<Stats, Integer> stats) {
        return this.getMaxDamageBonuses(stats) + this.weaponType.getMaxDamage();
    }

    public Double calculateLevel() {
        Map<Stats, Integer> stats = this.getBonusStats();
        Double level = (double) (this.getMinDamage(stats) + this.getMaxDamage(stats)) / 2;

        for (Integer amount : stats.values()) {
            level += amount;
        }

        return level;
    }

    @Override
    public String toString() {
        Map<Stats, Integer> stats = this.getBonusStats();
        int strengthBonus = stats.get(Stats.STRENGTH);
        int agilityBonus = stats.get(Stats.AGILITY);
        int vitalityBonus = stats.get(Stats.VITALITY);


        return String.format("%s: %d-%d Damage, +%d Strength, +%d Agility, +%d Vitality",
                this.name,
                this.getMinDamage(stats),
                this.getMaxDamage(stats),
                strengthBonus,
                agilityBonus,
                vitalityBonus
        );
    }

    @Override
    public int compareTo(Weapon o) {
        Double thisWeaponsLevel = this.calculateLevel();
        Double otherWeaponsLevel = o.calculateLevel();

        return Double.compare(thisWeaponsLevel, otherWeaponsLevel);
    }
}
