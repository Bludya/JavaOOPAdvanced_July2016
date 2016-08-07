package Exercise4_EnumerationsAndAnnotations.Problem07_DeckOfCards;

import Exercise4_EnumerationsAndAnnotations.Problem07_DeckOfCards.enumerations.Rank;
import Exercise4_EnumerationsAndAnnotations.Problem07_DeckOfCards.enumerations.Suit;

/**
 * Created by bludya on 8/2/16.
 * All rights reserved!
 */
public class Main {
    public static void main(String[] args) {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                System.out.printf("%s of %s%n", rank.toString(), suit.toString());
            }
        }
    }
}
