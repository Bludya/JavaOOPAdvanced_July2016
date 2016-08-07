package Exercise4_EnumerationsAndAnnotations.Problem04_CardToString;

import Exercise4_EnumerationsAndAnnotations.Problem04_CardToString.models.Card;

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
        Card card = new Card(rank, suit);

        System.out.println(card.toString());
    }
}
