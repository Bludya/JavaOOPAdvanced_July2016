package Exercise4_EnumerationsAndAnnotations.Problem07_DeckOfCards.enumerations;

/**
 * Created by bludya on 8/2/16.
 * All rights reserved!
 */

public enum Suit {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int power;

    Suit(int power) {
        this.power = power;
    }

    public int getPower() {
        return this.power;
    }
}
