package Exercise1_Interfaces.Problem08_MilitaryElite;

import Exercise1_Interfaces.Problem08_MilitaryElite.models.Mission;
import Exercise1_Interfaces.Problem08_MilitaryElite.models.Repair;
import Exercise1_Interfaces.Problem08_MilitaryElite.soldiers.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by bludya on 7/15/16.
 * All rights reserved!
 */
public class Main {
    private static Map<String, Soldier> soldiers = new LinkedHashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String[] data = reader.readLine().split("\\s+");

            if(data[0].equals("End")){
                break;
            }

            Soldier soldier = null;
            try {
                switch (data[0]) {
                    case "Private":
                        soldier = tryMakePrivate(data);
                        break;
                    case "LeutenantGeneral":
                        soldier = tryMakeLeutenantGeneral(data);
                        break;
                    case "Engineer":
                        soldier = tryMakeEngineer(data);
                        break;
                    case "Commando":
                        soldier = tryMakeCommando(data);
                        break;
                    case "Spy":
                        soldier = tryMakeSpy(data);
                        break;
                }
            }catch (IllegalArgumentException iae){
                continue;
            }

            if(soldier != null) {
                soldiers.put(soldier.getFirstName() + soldier.getLastName(), soldier);
                System.out.println(soldier);
            }
        }
    }

    private static Soldier tryMakeSpy(String[] data) {
        String id = data[1];
        String firstName = data[2];
        String lastName = data[3];
        long codeNumber = Long.parseLong(data[4]);

        return new Spy(id, firstName, lastName, codeNumber);
    }

    private static Soldier tryMakeCommando(String[] data) {
        String id = data[1];
        String firstName = data[2];
        String lastName = data[3];
        double salary = Double.parseDouble(data[4]);
        String corps = data[5];
        Commando commando = new Commando(id, firstName, lastName, salary, corps);

        for (int i = 6; i < data.length; i+=2) {
            String name = data[i];
            String state = data[i+1];
            Mission mission;
            try {
                mission = new Mission(name, state);
                commando.addMission(mission);
            }catch (IllegalArgumentException iae){
            }

        }

        return commando;
    }

    private static Soldier tryMakeEngineer(String[] data) {
        String id = data[1];
        String firstName = data[2];
        String lastName = data[3];
        double salary = Double.parseDouble(data[4]);
        String corps = data[5];
        Engineer engineer = new Engineer(id, firstName, lastName, salary, corps);

        for (int i = 6; i < data.length; i+=2) {
            String partName = data[i];
            int repairHours = Integer.parseInt(data[i+1]);
            Repair repair = new Repair(partName, repairHours);
            engineer.addRepair(repair);
        }

        return engineer;
    }

    private static Soldier tryMakeLeutenantGeneral(String[] data) {
        String id = data[1];
        String firstName = data[2];
        String lastName = data[3];
        double salary = Double.parseDouble(data[4]);
        LeutenantGeneral leutenantGeneral = new LeutenantGeneral(id, firstName, lastName, salary);
        for (int i = 5; i < data.length; i++) {
            String privateId = data[i];

            Soldier newSoldier = soldiers.values().stream()
                    .filter(soldier -> soldier.getId().equals(privateId))
                    .findFirst()
                    .get();
            leutenantGeneral.addPrivate(newSoldier);
        }

        return leutenantGeneral;
    }

    private static Soldier tryMakePrivate(String[] data) {
        String id = data[1];
        String firstName = data[2];
        String lastName = data[3];
        double salary = Double.parseDouble(data[4]);

        return new Private(id, firstName, lastName, salary);
    }
}
