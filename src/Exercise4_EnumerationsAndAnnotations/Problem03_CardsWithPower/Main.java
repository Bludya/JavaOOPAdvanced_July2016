package Exercise4_EnumerationsAndAnnotations.Problem03_CardsWithPower;


import Exercise4_EnumerationsAndAnnotations.Problem03_CardsWithPower.enumerations.CardRanks;
import Exercise4_EnumerationsAndAnnotations.Problem03_CardsWithPower.enumerations.CardSuits;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bludya on 8/2/16.
 * All rights reserved!
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String cardRankString = reader.readLine();
        String cardSuitString = reader.readLine();
        CardRanks rank = CardRanks.valueOf(cardRankString);
        CardSuits suit = CardSuits.valueOf(cardSuitString);
        System.out.printf("Card name: %s of %s; Card power: %d", rank.toString(), suit.toString(), rank.getPower() + suit.getPower());
    }
}
