package Exercise4_EnumerationsAndAnnotations.Problem06_CustomEnumAnotations.enumerations;

import Exercise4_EnumerationsAndAnnotations.Problem06_CustomEnumAnotations.anotations.Categorization;

/**
 * Created by bludya on 8/2/16.
 * All rights reserved!
 */
@Categorization(
        type = "Enumeration",
        category = "Suit",
        description = "Provides suit constants for a Card class."
)
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
