package Exercise1_Interfaces.Problem05_BorderControl;

import Exercise1_Interfaces.Problem05_BorderControl.Interfaces.Identifiable;
import Exercise1_Interfaces.Problem05_BorderControl.inhabitants.Citizen;
import Exercise1_Interfaces.Problem05_BorderControl.inhabitants.Robot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bludya on 7/14/16.
 * All rights reserved!
 */
public class Main {
    public static void main(String[] args) throws IOException {
        List<Identifiable> inhabitants = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] input = reader.readLine().split("\\s+");

            if (input[0].equals("End")) {
                break;
            }

            Identifiable inhabitant = null;
            String name = input[0];
            String id = input[input.length - 1];
            switch (input.length) {
                case 2:
                    inhabitant = tryMakeRobot(name, id);
                    break;
                case 3:
                    int age = Integer.parseInt(input[1]);
                    inhabitant = tryMakeCitizen(name, age, id);
                    break;
            }

            inhabitants.add(inhabitant);
        }

        String idEnding = reader.readLine().trim();
        inhabitants.stream()
                .filter(i -> i.getId().endsWith(idEnding))
                .forEach(i -> System.out.println(i.getId()));
    }

    private static Identifiable tryMakeCitizen(String name, int age, String id) {
        return new Citizen(name, age, id);
    }

    private static Identifiable tryMakeRobot(String model, String id) {
        return new Robot(model, id);
    }
}
