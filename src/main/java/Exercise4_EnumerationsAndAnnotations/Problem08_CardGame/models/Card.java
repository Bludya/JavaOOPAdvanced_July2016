package Exercise4_EnumerationsAndAnnotations.Problem08_CardGame.models;


import Exercise4_EnumerationsAndAnnotations.Problem08_CardGame.enumerations.CardRanks;
import Exercise4_EnumerationsAndAnnotations.Problem08_CardGame.enumerations.CardSuits;

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
        return String.format("%s of %s",
                rank.toString(),
                suit.toString());
    }

    @Override
    public int compareTo(Card o) {
        return Integer.compare(this.power, o.power);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Card)) {
            return false;
        }
        Card card = (Card) o;

        return this.rank.equals(card.rank) && this.suit.equals(card.suit);
    }

    @Override
    public int hashCode() {

        return this.rank.hashCode() + this.suit.hashCode();
    }
}
