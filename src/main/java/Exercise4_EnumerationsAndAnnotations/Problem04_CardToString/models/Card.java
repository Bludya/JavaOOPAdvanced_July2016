package Exercise4_EnumerationsAndAnnotations.Problem04_CardToString.models;


import Exercise4_EnumerationsAndAnnotations.Problem04_CardToString.enumerations.CardRanks;
import Exercise4_EnumerationsAndAnnotations.Problem04_CardToString.enumerations.CardSuits;

/**
 * Created by bludya on 8/2/16.
 * All rights reserved!
 */
public class Card {
    private CardSuits suit;
    private CardRanks rank;
    private int power;

    public Card(String rank, String suit) {
        this.suit = CardSuits.valueOf(suit);
        this.rank = CardRanks.valueOf(rank);
        this.power = this.suit.getPower() + this.rank.getPower();
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d",
                this.rank.toString(),
                this.suit.toString(),
                this.power);
    }
}
