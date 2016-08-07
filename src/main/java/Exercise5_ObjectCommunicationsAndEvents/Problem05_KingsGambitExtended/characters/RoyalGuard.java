package Exercise5_ObjectCommunicationsAndEvents.Problem05_KingsGambitExtended.characters;

/**
 * Created by bludya on 8/5/16.
 * All rights reserved!
 */
public class RoyalGuard extends Subordinate {
    private static final int LIVES = 3;
    private final String DEFEND_MESSAGE = String.format("Royal Guard %s is defending!", super.getName());

    public RoyalGuard(String name) {
        super(name, LIVES);
    }

    @Override
    public void takeAction() {
        System.out.println(DEFEND_MESSAGE);
    }


}
