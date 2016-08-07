package Exercise5_ObjectCommunicationsAndEvents.Problem02_KingsGambit.characters;

/**
 * Created by bludya on 8/5/16.
 * All rights reserved!
 */
public class Footman extends Character {
    private final String PANIC_MESSAGE = String.format("Footman %s is panicking!", super.name);

    public Footman(String name) {
        super(name);
    }

    @Override
    public void takeAction() {
        System.out.println(PANIC_MESSAGE);
    }
}
