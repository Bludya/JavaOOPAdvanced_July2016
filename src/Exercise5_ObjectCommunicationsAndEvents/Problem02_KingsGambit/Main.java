package Exercise5_ObjectCommunicationsAndEvents.Problem02_KingsGambit;

import Exercise5_ObjectCommunicationsAndEvents.Problem02_KingsGambit.characters.Character;
import Exercise5_ObjectCommunicationsAndEvents.Problem02_KingsGambit.characters.Footman;
import Exercise5_ObjectCommunicationsAndEvents.Problem02_KingsGambit.characters.King;
import Exercise5_ObjectCommunicationsAndEvents.Problem02_KingsGambit.characters.RoyalGuard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bludya on 8/5/16.
 * All rights reserved!
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String kingName = reader.readLine();
        Character king = new King(kingName);

        String[] royalGuardNames = reader.readLine().split("\\s+");
        for (String name : royalGuardNames) {
            king.addSubordinate(new RoyalGuard(name));
        }

        String[] footmenNames = reader.readLine().split("\\s+");
        for (String name : footmenNames) {
            king.addSubordinate(new Footman(name));
        }

        while (true) {
            String[] command = reader.readLine().split("\\s+");

            switch (command[0]) {
                case "Attack":
                    king.takeAction();
                    break;
                case "Kill":
                    String name = command[1];
                    king.killSubordinate(name);
                    break;
                case "End":
                    return;
            }
        }
    }
}
