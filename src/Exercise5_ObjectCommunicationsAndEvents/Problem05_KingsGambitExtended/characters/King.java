package Exercise5_ObjectCommunicationsAndEvents.Problem05_KingsGambitExtended.characters;

/**
 * Created by bludya on 8/5/16.
 * All rights reserved!
 */
public class King extends Character implements DeathListener {
    private final String SHOUT_MESSAGE = String.format("King %s is under attack!", super.getName());


    public King(String name) {
        super(name);
    }

    public void handleDeadSubordinate(DeathEvent event) {
        Subordinate subordinate = event.getSource();
        this.removeSubordinate(subordinate.getName());
    }

    @Override
    public void takeAction() {
        System.out.println(SHOUT_MESSAGE);
        subordinates.values().forEach(Character::takeAction);
    }
}
