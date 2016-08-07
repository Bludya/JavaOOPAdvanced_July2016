package Exercise5_ObjectCommunicationsAndEvents.Problem05_KingsGambitExtended;

import Exercise5_ObjectCommunicationsAndEvents.Problem05_KingsGambitExtended.characters.Footman;
import Exercise5_ObjectCommunicationsAndEvents.Problem05_KingsGambitExtended.characters.King;
import Exercise5_ObjectCommunicationsAndEvents.Problem05_KingsGambitExtended.characters.RoyalGuard;
import Exercise5_ObjectCommunicationsAndEvents.Problem05_KingsGambitExtended.characters.Subordinate;

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
        King king = new King(kingName);

        String[] royalGuardNames = reader.readLine().split("\\s+");
        for (String name : royalGuardNames) {
            Subordinate royalGuard = new RoyalGuard(name);
            king.addSubordinate(royalGuard);
            royalGuard.setDeathListener(king);
        }

        String[] footmenNames = reader.readLine().split("\\s+");
        for (String name : footmenNames) {
            Subordinate footman = new Footman(name);
            king.addSubordinate(footman);
            footman.setDeathListener(king);
        }

        while (true) {
            String[] command = reader.readLine().split("\\s+");

            switch (command[0]) {
                case "Attack":
                    king.takeAction();
                    break;
                case "Kill":
                    String name = command[1];
                    king.attackOnSubordinate(name);
                    break;
                case "End":
                    return;
            }
        }
    }
}
