package Exercise4_EnumerationsAndAnnotations.Problem05_CardCompareTo.models;


import Exercise4_EnumerationsAndAnnotations.Problem05_CardCompareTo.enumerations.CardRanks;
import Exercise4_EnumerationsAndAnnotations.Problem05_CardCompareTo.enumerations.CardSuits;

/**
 * Created by bludya on 8/2/16.
 * All rights reserved!
 */
public class Card implements Comparable<Card> {
    private CardSuits suit;
    private CardRanks rank;
    private int power;

    public Card(String rank, String suit) {
        this.suit = CardSuits.valueOf(suit);
        this.rank = CardRanks.valueOf(rank);
        this.power = this.rank.getPower() + this.suit.getPower();
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d",
                rank.toString(),
                suit.toString(),
                rank.getPower() + suit.getPower());
    }

    @Override
    public int compareTo(Card o) {
        return Integer.compare(this.power, o.power);
    }
}
