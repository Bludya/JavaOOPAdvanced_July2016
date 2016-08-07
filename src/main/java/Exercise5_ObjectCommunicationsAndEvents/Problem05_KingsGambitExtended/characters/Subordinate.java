package Exercise5_ObjectCommunicationsAndEvents.Problem05_KingsGambitExtended.characters;

/**
 * Created by bludya on 8/5/16.
 * All rights reserved!
 */
public abstract class Subordinate extends Character {
    private int lives;
    private DeathListener deathListener;

    protected Subordinate(String name, int lives) {
        super(name);
        this.setLives(lives);
    }

    public void setDeathListener(DeathListener listener) {
        this.deathListener = listener;
    }

    private void setLives(int lives) {
        this.lives = lives;
    }


    public void receiveDamage() {
        lives--;
        if (lives == 0) {
            deathListener.handleDeadSubordinate(new DeathEvent(this));
        }
    }
}
