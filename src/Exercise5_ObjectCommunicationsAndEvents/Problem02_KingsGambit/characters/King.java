package Exercise5_ObjectCommunicationsAndEvents.Problem02_KingsGambit.characters;

/**
 * Created by bludya on 8/5/16.
 * All rights reserved!
 */
public class King extends Character {
    private final String SHOUT_MESSAGE = String.format("King %s is under attack!", super.name);


    public King(String name) {
        super(name);
    }

    @Override
    public void takeAction() {
        System.out.println(SHOUT_MESSAGE);
        subordinates.values().forEach(Character::takeAction);
    }
}
