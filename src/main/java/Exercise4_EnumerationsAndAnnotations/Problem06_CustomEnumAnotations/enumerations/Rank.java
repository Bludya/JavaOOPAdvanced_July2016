package Exercise4_EnumerationsAndAnnotations.Problem06_CustomEnumAnotations.enumerations;

import Exercise4_EnumerationsAndAnnotations.Problem06_CustomEnumAnotations.anotations.Categorization;

/**
 * Created by bludya on 8/2/16.
 * All rights reserved!
 */

@Categorization(
        type = "Enumeration",
        category = "Rank",
        description = "Provides rank constants for a Card class."
)
public enum Rank {
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

    Rank(int power) {
        this.power = power;
    }

    public int getPower() {
        return this.power;
    }
}
