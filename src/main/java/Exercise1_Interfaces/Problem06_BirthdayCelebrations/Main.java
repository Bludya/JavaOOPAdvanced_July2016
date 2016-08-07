package Exercise1_Interfaces.Problem06_BirthdayCelebrations;

import Exercise1_Interfaces.Problem06_BirthdayCelebrations.Interfaces.Birthable;
import Exercise1_Interfaces.Problem06_BirthdayCelebrations.inhabitants.Citizen;
import Exercise1_Interfaces.Problem06_BirthdayCelebrations.inhabitants.Pet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bludya on 7/15/16.
 * All rights reserved!
 */
public class Main {
    public static void main(String[] args) throws IOException {
        List<Birthable> inhabitants = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] input = reader.readLine().split("\\s+");

            if (input[0].equals("End")) {
                break;
            }

            String name = input[1];
            String birthday = input[input.length - 1];

            switch (input[0]) {
                case "Citizen":
                    int age = Integer.parseInt(input[2]);
                    String id = input[3];
                    inhabitants.add(tryMakeCitizen(name, age, id, birthday));
                    break;
                case "Pet":
                    inhabitants.add(tryMakePet(name, birthday));
            }
        }
        String year = reader.readLine().trim();
        inhabitants.stream().filter(i -> i.getBirthday().endsWith(year))
                .forEach(i -> System.out.println(i.getBirthday()));
    }

    private static Birthable tryMakePet(String name, String birthday) {
        return new Pet(name, birthday);
    }

    private static Birthable tryMakeCitizen(String name, int age, String id, String birthday) {
        return new Citizen(name, age, id, birthday);
    }
}