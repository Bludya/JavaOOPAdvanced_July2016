package Exercise2_Generics.Problem11_Threeuple;

import Exercise2_Generics.Problem11_Threeuple.models.Threeuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bludya on 7/21/16.
 * All rights reserved!
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split("\\s+");
        String name = input[0] + " " + input[1];
        String adress = input[2];
        String town = input[3];
        Threeuple<String, String, String> firstThreeuple = new Threeuple<>(name, adress, town);

        input = reader.readLine().split("\\s+");
        name = input[0];
        int litersBeer = Integer.parseInt(input[1]);
        Boolean drunkOrNot = input[2].toLowerCase().equals("drunk");
        Threeuple<String, Integer, Boolean> secondThreeuple = new Threeuple<>(name, litersBeer, drunkOrNot);

        input = reader.readLine().split("\\s+");
        name = input[0];
        Double balance = Double.parseDouble(input[1]);
        String blankName = input[2];
        Threeuple<String, Double, String> thirdThreeuple = new Threeuple<>(name, balance, blankName);

        System.out.println(firstThreeuple);
        System.out.println(secondThreeuple);
        System.out.println(thirdThreeuple);
    }
}
