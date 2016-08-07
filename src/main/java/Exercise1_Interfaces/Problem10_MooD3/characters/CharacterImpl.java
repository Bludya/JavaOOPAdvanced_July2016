package Exercise1_Interfaces.Problem10_MooD3.characters;

import Exercise1_Interfaces.Problem10_MooD3.interfaces.ICharacter;

/**
 * Created by bludya on 7/15/16.
 * All rights reserved!
 */
abstract class CharacterImpl<H, S> implements ICharacter<H, S> {
    private String name;
    private H hashedPassword;
    private int level;
    private S specialPoints;

    CharacterImpl(String name, S specialPoints, int level) {
        this.setName(name);
        this.setLevel(level);
        this.setSpecialPoints(specialPoints);
        this.setHashedPassword(null);
    }

    @Override
    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public H getHashedPassword() {
        return hashedPassword;
    }

    @Override
    public void setHashedPassword(H hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    @Override
    public int getLevel() {
        return level;
    }

    private void setLevel(int level) {
        this.level = level;
    }

    @Override
    public S getSpecialPoints() {
        return specialPoints;
    }

    private void setSpecialPoints(S specialPoints) {
        this.specialPoints = specialPoints;
    }

    @Override
    public String toString() {
        return String.format("\"%s\" | \"%s\" -> %s",
                this.getName(),
                this.getHashedPassword(),
                this.getClass().getSimpleName());
    }
}
