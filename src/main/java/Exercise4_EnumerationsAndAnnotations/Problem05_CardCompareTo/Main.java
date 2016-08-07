package Exercise4_EnumerationsAndAnnotations.Problem05_CardCompareTo;

import Exercise4_EnumerationsAndAnnotations.Problem05_CardCompareTo.models.Card;

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

        String rank = reader.readLine();
        String suit = reader.readLine();
        Card firstCard = new Card(rank, suit);

        rank = reader.readLine();
        suit = reader.readLine();
        Card secondCard = new Card(rank, suit);

        if (firstCard.compareTo(secondCard) >= 0) {
            System.out.println(firstCard.toString());
        } else {
            System.out.println(secondCard.toString());
        }

    }
}
