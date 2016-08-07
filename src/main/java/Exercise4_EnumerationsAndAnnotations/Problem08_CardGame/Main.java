package Exercise4_EnumerationsAndAnnotations.Problem08_CardGame;

import Exercise4_EnumerationsAndAnnotations.Problem08_CardGame.models.Card;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by bludya on 8/2/16.
 * All rights reserved!
 */
public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private static Set<Card> drawnCards = new HashSet<>();

    public static void main(String[] args) throws IOException {

        Set<Card> firstPlayerCards = new HashSet<>();
        Set<Card> secondPlayerCards = new HashSet<>();

        String firstPlayer = reader.readLine();
        String secondPlayer = reader.readLine();

        drawCards(firstPlayerCards);
        drawCards(secondPlayerCards);

        Card firstPlayerBestCard = firstPlayerCards.stream().max(Card::compareTo).get();
        Card secondPlayerBestCard = secondPlayerCards.stream().max(Card::compareTo).get();

        if (firstPlayerBestCard.compareTo(secondPlayerBestCard) >= 0) {
            System.out.printf("%s wins with %s.", firstPlayer, firstPlayerBestCard.toString());
        } else {
            System.out.printf("%s wins with %s.", secondPlayer, secondPlayerBestCard.toString());
        }
    }

    private static void drawCards(Set<Card> playerCards) throws IOException {
        int count = 0;

        while (count < 5) {
            String[] input = reader.readLine().split(" of ");
            String rank = input[0];
            String suit = input[1];
            try {
                Card card = new Card(rank, suit);
                if (drawnCards.contains(card)) {
                    System.out.println("Card is not in the deck.");
                    continue;
                }
                playerCards.add(card);
                drawnCards.add(card);
                count++;
            } catch (Exception e) {
                System.out.println("No such card exists.");
            }

        }

    }
}
