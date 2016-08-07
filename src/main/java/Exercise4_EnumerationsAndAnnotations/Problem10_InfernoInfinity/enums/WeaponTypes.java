package Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.enums;


/**
 * Created by bludya on 8/3/16.
 * All rights reserved!
 */
public enum WeaponTypes {
    AXE(5, 10, 4),
    SWORD(4, 6, 3),
    KNIFE(3, 4, 2);

    private int minDamage;
    private int maxDamage;
    private int numberOfSockets;

    WeaponTypes(int minDamage, int maxDamage, int numberOfSockets) {
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.numberOfSockets = numberOfSockets;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public int getNumberOfSockets() {
        return numberOfSockets;
    }
}
