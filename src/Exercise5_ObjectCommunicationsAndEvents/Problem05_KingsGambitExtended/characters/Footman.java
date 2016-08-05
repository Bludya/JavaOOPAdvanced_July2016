package Exercise5_ObjectCommunicationsAndEvents.Problem05_KingsGambitExtended.characters;

/**
 * Created by bludya on 8/5/16.
 * All rights reserved!
 */
public class Footman extends Subordinate {
    private final static int LIVES = 2;
    private final String PANIC_MESSAGE = String.format("Footman %s is panicking!", super.getName());

    public Footman(String name) {
        super(name, LIVES);
    }

    @Override
    public void takeAction() {
        System.out.println(PANIC_MESSAGE);
    }

}
