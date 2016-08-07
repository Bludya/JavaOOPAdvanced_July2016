package Exercise1_Interfaces.Problem10_MooD3.characters;

import Exercise1_Interfaces.Problem10_MooD3.interfaces.IDemon;

/**
 * Created by bludya on 7/15/16.
 * All rights reserved!
 */
public class Demon extends CharacterImpl<Integer, Double> implements IDemon {

    private static final int HASH_PASSWORD_MULTIPLIER = 217;

    public Demon(String name, Double specialPoints, int level) {
        super(name, specialPoints, level);
        super.setHashedPassword(this.calculateHashPassword());
    }

    private Integer calculateHashPassword() {
        return super.getName().length() * HASH_PASSWORD_MULTIPLIER;
    }

    @Override
    public Double getEnergy() {
        return super.getSpecialPoints();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + this.getEnergy() * this.getLevel();
    }
}
