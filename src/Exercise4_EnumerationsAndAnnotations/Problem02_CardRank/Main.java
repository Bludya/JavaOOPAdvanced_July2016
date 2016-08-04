package Exercise4_EnumerationsAndAnnotations.Problem02_CardRank;

import Exercise4_EnumerationsAndAnnotations.Problem02_CardRank.enumerations.CardRanks;

/**
 * Created by bludya on 8/2/16.
 * All rights reserved!
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Card Ranks:");
        for (CardRanks card : CardRanks.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", card.ordinal(), card.toString());
        }
    }
}
