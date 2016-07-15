package Exercise1_Interfaces.Problem07_FoodShortage;

import Exercise1_Interfaces.Problem07_FoodShortage.interfaces.Buyable;
import Exercise1_Interfaces.Problem07_FoodShortage.models.Citizen;
import Exercise1_Interfaces.Problem07_FoodShortage.models.Rebel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by bludya on 7/15/16.
 * All rights reserved!
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, Buyable> buyers = new HashMap<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        while (true) {
            String[] input = reader.readLine().split("\\s+");

            if (input[0].equals("End")) {
                break;
            }

            String name = input[0];
            int age;

            switch (input.length) {
                case 4:
                    age = Integer.parseInt(input[1]);
                    String id = input[2];
                    String birthday = input[3];
                    buyers.put(name, tryMakeCitizen(name, age, id, birthday));
                    break;
                case 3:
                    age = Integer.parseInt(input[1]);
                    String group = input[2];
                    buyers.put(name, tryMakeRebel(name, age, group));
                    break;
                case 1:
                    if(buyers.containsKey(name)) {
                        buyers.get(name).buy();
                    }
                    break;
            }
        }
        int totalFoodBought = buyers.values().stream().mapToInt(buyable -> buyable.getFood()).sum();
        System.out.println(totalFoodBought);
    }

    private static Buyable tryMakeRebel(String name, int age, String group) {
        return new Rebel(name, age, group);
    }

    private static Buyable tryMakeCitizen(String name, int age, String id, String birthday) {
        return new Citizen(name, age, id, birthday);
    }

}
