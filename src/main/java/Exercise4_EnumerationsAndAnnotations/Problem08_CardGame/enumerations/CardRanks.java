package Exercise4_EnumerationsAndAnnotations.Problem08_CardGame.enumerations;

/**
 * Created by bludya on 8/2/16.
 * All rights reserved!
 */
public enum CardRanks {
    ACE(14),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13);

    private int power;

    CardRanks(int power) {
        this.power = power;
    }

    public int getPower() {
        return this.power;
    }
}
