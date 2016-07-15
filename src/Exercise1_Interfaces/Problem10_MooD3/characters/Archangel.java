package Exercise1_Interfaces.Problem10_MooD3.characters;

import Exercise1_Interfaces.Problem10_MooD3.interfaces.IArchangel;

/**
 * Created by bludya on 7/15/16.
 * All rights reserved!
 */
public class Archangel extends CharacterImpl<String, Integer> implements IArchangel{

    private static final int HASH_PASSWORD_MULTIPLIER = 21;

    public Archangel(String name, int specialPoints, int level) {
        super(name, specialPoints, level);
        super.setHashedPassword(this.generateHashPassword());
    }

    private String generateHashPassword() {
        StringBuilder output = new StringBuilder(super.getName());
        output.reverse();
        output.append(super.getName().length() * HASH_PASSWORD_MULTIPLIER);
        return output.toString();
    }

    @Override
    public int getMana() {
        return super.getSpecialPoints();
    }

    @Override
    public String toString(){
        return super.toString() + String.format("%n%d", this.getMana() * this.getLevel());
    }
}
