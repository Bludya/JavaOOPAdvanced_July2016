package Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.enums;

/**
 * Created by bludya on 8/3/16.
 * All rights reserved!
 */
public enum Stats {
    STRENGTH(2, 3),
    AGILITY(1, 4),
    VITALITY(0, 0);

    private int minDamageBonus;
    private int maxDamageBonus;

    Stats(int minDamageBonus, int maxDamageBonus) {
        this.minDamageBonus = minDamageBonus;
        this.maxDamageBonus = maxDamageBonus;
    }

    public int getMinDamageBonus() {
        return minDamageBonus;
    }

    public int getMaxDamageBonus() {
        return maxDamageBonus;
    }
}
