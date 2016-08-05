package Exercise5_ObjectCommunicationsAndEvents.Problem02_KingsGambit.characters;

/**
 * Created by bludya on 8/5/16.
 * All rights reserved!
 */
public class RoyalGuard extends Character {
    private final String DEFEND_MESSAGE = String.format("Royal Guard %s is defending!", super.name);

    public RoyalGuard(String name) {
        super(name);
    }

    @Override
    public void takeAction() {
        System.out.println(DEFEND_MESSAGE);
    }

}
