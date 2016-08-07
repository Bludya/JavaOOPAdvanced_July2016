package Exercise4_EnumerationsAndAnnotations.Problem04_CardToString.enumerations;

/**
 * Created by bludya on 8/2/16.
 * All rights reserved!
 */
public enum CardSuits {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int power;

    CardSuits(int power) {
        this.power = power;
    }

    public int getPower() {
        return this.power;
    }
}
