package Exercise4_EnumerationsAndAnnotations.Problem01_CardSuit;

import Exercise4_EnumerationsAndAnnotations.Problem01_CardSuit.enumerations.Cards;

/**
 * Created by bludya on 8/2/16.
 * All rights reserved!
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Card Suits:");
        for (Cards card : Cards.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", card.ordinal(), card.toString());
        }
    }
}
